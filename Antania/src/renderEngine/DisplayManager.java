package renderEngine;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class DisplayManager {
	
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	
	public static void createDisplay(){
		
		Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
		
	}
	
	public static void updateDisplay(){
		
		
	}
	
	public static void closeDisplay(){
		
		
	}
	
}
