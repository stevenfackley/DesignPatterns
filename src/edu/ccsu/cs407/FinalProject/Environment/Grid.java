package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import edu.ccsu.cs407.FinalProject.MainThread;

public class Grid {
	private Random rand = new Random();
	private int width;
	private Tile data[][];
	private TileFactory tileFactory = TileFactory.getInstance();
	
	public void step(){
		for(int i=0; i<width; i++){
			for(int j=0; j<width; j++){
				data[i][j].step();
			}
		}
	}
	
	public Grid(int width){
		data = new Tile[width][width];
		for(int i=0; i<width; i++){
			for(int j=0; j<width; j++){
				this.setTile(i, j, "water",0,0);
			}
		}
		this.width = width;
		int area=width*width;
		seedLand(area/250);
		growLand(25);
	}
	
	public Tile getTile(int x,int y){
		return data[x][y];
	}
	public void setTile(int x,int y,String tile,int maxPlants,int range){
		data[x][y] = tileFactory.createTile(tile,maxPlants , range);
	}
	public int getWidth(){
		return width;
	}
	public void seedLand(int numIslands){
		int randX = 0;
		int randY = 0;
		for(int i=0; i<numIslands; i++){
			randX = (int)((rand.nextDouble()+rand.nextDouble()+rand.nextDouble())/3*width);
			randY = (int)((rand.nextDouble()+rand.nextDouble()+rand.nextDouble())/3*width);
			this.setTile(randX, randY, "land",0,0);
		}
	}
	public void growLand(int iterations){
		for(int iter=0; iter<iterations; iter++){
			for(int i=1+(width/iterations*iter)/5; i<width-(width/iterations*iter)/5-1; i++){
				for(int j=1+(width/iterations*iter)/5; j<width-(width/iterations*iter)/5-1; j++){
					if(data[i][j] instanceof Water){
						if(rand.nextDouble()<numSurrounding(i,j)/18.0)
							setTile(i,j,"land",0+100*iter/iterations,(iterations-iter)/iterations*25+25);
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
	
	public void draw(int startTileX, int startTileY, int width, Graphics g){
		drawTiles(startTileX,startTileY,width,g);
		drawGrid(startTileX,startTileY,width,g);
		
	}
	private void drawGrid(int startTileX, int startTileY, int width, Graphics g){
		double gridSize = MainThread.tileSize;
		while(gridSize<10){
			gridSize+=MainThread.tileSize;
		}
		g.setColor(Color.BLACK);
		for(int i=0; i<=width/(gridSize/MainThread.tileSize); i++){
			for(int j=0; j<=width/(gridSize/MainThread.tileSize); j++){
				g.drawRect((int)(i*gridSize-MainThread.offset), (int)(j*gridSize-MainThread.offset), (int)gridSize, (int)gridSize);
			}
		}
	}
	private void drawTiles(int startTileX, int startTileY, int width, Graphics g){
		if(width<this.width)
			width++;
		for(int i=startTileX; i<width+startTileX; i++){
			for(int j=startTileY; j<width+startTileY; j++){
				data[i][j].draw((int)Math.ceil(MainThread.tileSize), (int)((i-startTileX)*MainThread.tileSize-MainThread.offset), (int)((j-startTileY)*MainThread.tileSize-MainThread.offset), g);
			}
		}
	}
}
