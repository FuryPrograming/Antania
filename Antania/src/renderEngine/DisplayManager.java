package renderEngine;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final int FPS_CAP = 120;
	
	public static void createDisplay(){
		
		ContextAttribs attribs = new ContextAttribs(3,2);
		attrubs.withForwardCompatible(true);
		attribs.withProfileCore(true);
	
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.create(new PixelFormat(), attribs);
			
		} catch (LWJGLExcpetion e) {
			e.printStackTrace();	
		}
		
		GL11.glview(0, 0, WIDTH, HEIGHT);
	}
	
	public static void updateDisplay(){
		
		Display.syn(FPS_CAP);
		Display.uodate();
		
	}
	
	public static void closeDisplay(){
		
		Display.destroy();
		
	}
	
}
