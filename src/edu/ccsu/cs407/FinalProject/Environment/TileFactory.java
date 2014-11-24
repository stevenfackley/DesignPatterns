package edu.ccsu.cs407.FinalProject.Environment;

/**
 * A factory patern that makes Tiles
 * @author grunes
 *
 */
public class TileFactory {
	private static TileFactory instance = null;
	
	/**
	 * Returns the instance of factory singleton
	 * @return
	 */
	public static TileFactory getInstance(){
		if(instance == null)
			instance = new TileFactory();
		return instance;
	}
	private TileFactory(){}
	
	/**
	 * Returns a tile with the specified parameters
	 * @param name name representing the type of tile
	 * @param tile the name of the tile being added
	 * @param minPlants the min number of plants(1-100)
	 * @param range the range of the number of plants
	 */
	public Tile createTile(String name, int maxPlants, int range){
		if(name.equalsIgnoreCase("water"))
			return new Water();
		else
			return new Land(maxPlants,range);
	}
}
