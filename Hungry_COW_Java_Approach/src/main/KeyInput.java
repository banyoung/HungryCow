package main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private Boolean klicked = false;
	
	public KeyInput(Handler handler)
	{
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		for(int i = 0; i < handler.object.size(); i ++)
		{
			GameObject tempObject = handler.object.get(i);
			//Cow keyboard
			if(tempObject.getId() == ID.Player && klicked == false)
			{
				if(tempObject.getVelX() != 0 && key == KeyEvent.VK_LEFT){
					tempObject.setVelY((-1) * tempObject.getVelX());
					tempObject.setVelX(0);
					klicked = true;
				}
				else if(tempObject.getVelX() != 0 && key == KeyEvent.VK_RIGHT){
					tempObject.setVelY(tempObject.getVelX());
					tempObject.setVelX(0);
					klicked = true;
				}
				else if(tempObject.getVelY() != 0 && key == KeyEvent.VK_RIGHT){
					tempObject.setVelX((-1) * tempObject.getVelY());
					tempObject.setVelY(0);
					klicked = true;
				}
				else if(tempObject.getVelY() != 0 && key == KeyEvent.VK_LEFT){
					tempObject.setVelX(tempObject.getVelY());
					tempObject.setVelY(0);
					klicked = true;
				}
				else {
					System.out.println("******************ERROR******************");
				}
			
			}
		}
	}
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		for(int i = 0; i < handler.object.size(); i ++)
		{
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ID.Player)
			{
				if(key == KeyEvent.VK_LEFT) klicked = false;
				if(key == KeyEvent.VK_RIGHT) klicked = false;
			}
		}
	}	
}
