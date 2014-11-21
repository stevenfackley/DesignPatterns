package edu.ccsu.cs407.FinalProject.Environment;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import edu.ccsu.cs407.FinalProject.MainThread;
import edu.ccsu.cs407.FinalProject.Creatures.ConcreteCreatureFactory;
import edu.ccsu.cs407.FinalProject.UI.MouseInput;

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
		addCreatures(area/10);
	}
	
	public Tile getTile(int x,int y){
		return data[x][y];
	}
	public void setTile(int x,int y,String tile,int maxPlants,int range){
		data[x][y] = tileFactory.createTile(tile,maxPlants,range);
	}
	public int getWidth(){
		return width;
	}
	private void seedLand(int numIslands){
		int randX = 0;
		int randY = 0;
		for(int i=0; i<numIslands; i++){
			randX = (int)((rand.nextDouble()+rand.nextDouble()+rand.nextDouble())/3*width);
			randY = (int)((rand.nextDouble()+rand.nextDouble()+rand.nextDouble())/3*width);
			this.setTile(randX, randY, "land",0,0);
		}
	}
	private void growLand(int iterations){
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
	
	//Debug Method
	private void addCreatures(int num){
		int randX = 0;
		int randY = 0;
		ConcreteCreatureFactory factory = ConcreteCreatureFactory.getInstance();
		for(int i=0; i<num; i++){
			randX = rand.nextInt(width);
			randY = rand.nextInt(width);
			if(data[randX][randY] instanceof Land && data[randX][randY].getCreature()==null){
				data[randX][randY].setCreature(factory.createCreature("wolf"));
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
			gridSize*=2;
		}
		MainThread.realGridSize = (int) (gridSize/MainThread.tileSize)*10;
		g.setColor(new Color(0,0,0,75));
		for(int i=0; i<=width/(gridSize/MainThread.tileSize); i++){
			for(int j=0; j<=width/(gridSize/MainThread.tileSize); j++){
				g.drawRect((int)(i*gridSize-MainThread.offsetX-Math.floor(MainThread.startTileX)%(gridSize/MainThread.tileSize)*MainThread.tileSize), (int)(j*gridSize-MainThread.offsetY-Math.floor(MainThread.startTileY)%(gridSize/MainThread.tileSize)*MainThread.tileSize), (int)gridSize, (int)gridSize);
			}
		}
	}
	private void drawTiles(int startTileX, int startTileY, int width, Graphics g){
		if(width<this.width)
			width++;
		for(int i=startTileX; i<width+startTileX; i++){
			for(int j=startTileY; j<width+startTileY; j++){
				data[i][j].draw((int)Math.ceil(MainThread.tileSize), (int)(Math.floor(i-startTileX)*MainThread.tileSize-MainThread.offsetX), (int)(Math.floor(j-startTileY)*MainThread.tileSize-MainThread.offsetY), g);
			}
		}
	}
	
	public Tile getMouseOver(){
		int tileX=(int) (Math.floor(MouseInput.mouseX)/MainThread.tileSize+MainThread.startTileX);
		int tileY=(int) (Math.floor(MouseInput.mouseY)/MainThread.tileSize+MainThread.startTileY);
		return getTile(tileX,tileY);
	}
}
