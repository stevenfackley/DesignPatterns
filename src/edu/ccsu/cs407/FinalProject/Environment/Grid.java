package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Grid {
	private Random rand = new Random();
	private int squaresX;
	private int squaresY;
	private Tile data[][];
	private TileFactory tileFactory = TileFactory.getInstance();
	
	public void step(){
		for(int i=0; i<squaresX; i++){
			for(int j=0; j<squaresY; j++){
				data[i][j].step();
			}
		}
	}
	
	public Grid(int squaresX,int squaresY){
		this.squaresX = squaresX;
		this.squaresY = squaresY;
		data = new Tile[squaresX][squaresY];
		for(int i=0; i<squaresX; i++){
			for(int j=0; j<squaresY; j++){
				this.setTile(i, j, "water",0,0);
			}
		}
		seedLand(10);
		growLand(10);
	}
	public Tile getTile(int x,int y){
		return data[x][y];
	}
	public void setTile(int x,int y,String tile,int maxPlants,int range){
		data[x][y] = tileFactory.createTile(tile,maxPlants , range);
	}
	public int getSquaresX(){
		return squaresX;
	}
	public int getSquaresY(){
		return squaresY;
	}
	public void seedLand(int numIslands){
		int randX = 0;
		int randY = 0;
		for(int i=0; i<numIslands; i++){
			randX = rand.nextInt(squaresX);
			randY = rand.nextInt(squaresY);
			this.setTile(randX, randY, "land",100,0);
		}
	}
	public void growLand(int iterations){
		for(int iter=0; iter<iterations; iter++){
			for(int i=1; i<squaresX-1; i++){
				for(int j=1; j<squaresY-1; j++){
					if(data[i][j] instanceof Water){
						if(rand.nextDouble()<numSurrounding(i,j)/10.0)
							setTile(i,j,"land",100-iter*5,iter*5);
					}
				}
			}
		}
	}
	
	public int numSurrounding(int x, int y){
		int surrounding=0;
		if(data[x-1][y-1] instanceof Land)
			surrounding++;
		if(data[x-1][y] instanceof Land)
			surrounding++;
		if(data[x-1][y+1] instanceof Land)
			surrounding++;
		if(data[x][y-1] instanceof Land)
			surrounding++;
		if(data[x][y+1] instanceof Land)
			surrounding++;
		if(data[x+1][y-1] instanceof Land)
			surrounding++;
		if(data[x+1][y] instanceof Land)
			surrounding++;
		if(data[x+1][y+1] instanceof Land)
			surrounding++;
		return surrounding;
	}
	
	public void draw(int tileSize, int startX, int startY, Graphics g){
		for(int i=0; i<squaresX; i++){
			for(int j=0; j<squaresY; j++){
				data[i][j].draw(tileSize, startX+i*tileSize, startY+j*tileSize, g);
			}
		}
		g.setColor(Color.BLACK);
		for(int i=0; i<squaresX; i++){
			for(int j=0; j<squaresY; j++){
				g.drawRect(startX+i*tileSize, startY+j*tileSize, tileSize, tileSize);
			}
		}
	}
}
