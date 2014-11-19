package edu.ccsu.cs407.FinalProject.Environment;

public class TileFactory {
	private static TileFactory instance = null;
	
	public static TileFactory getInstance(){
		if(instance == null)
			instance = new TileFactory();
		return instance;
	}
	private TileFactory(){}
	
	public Tile createTile(String name){
		if(name.equalsIgnoreCase("water"))
			return new Water();
		else
			return new Land();
	}
}
