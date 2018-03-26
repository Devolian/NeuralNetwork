package io.github.kennytk.numbers;

public class Globals
{
	public static int realWidth;
	public static int realHeight;
	
	public static float innerWidth = 1920;
	public static float innerHeight = 1080;
	
	public static int menuBasePointX = 1200;
	public static double mutationFactor = .05;

	public static double dragRatio = 1;
	public static float scaleFactor = .25f;

	public static enum TileType
	{
		GRASS, WATER, PLANT
	}

	public static MenuMode menuMode;

	public static enum MenuMode
	{
		MAIN, CREATURE, DATA, TILE;
	}
}