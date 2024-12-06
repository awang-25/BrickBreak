/*
 * Author: Adam Wang
 * Date: 12/04/2024
 * Description: This component is the moving paddle which the user will control.
 */
import java.awt.Graphics;
import java.awt.*;

public class Paddle {

	// Instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int velocity;
	
	// Constructor
	public Paddle(int x, int y, int width, int height){
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
	}
	
	// Getters and setters
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getVelocity(){
		return velocity;
	}
	public void setX(int x){
		xPos = x;
	}
	public void setVelocity(int velocity){
		this.velocity = velocity;
	}

	// Pre-condition: N/A
	// Post-condition: Paddle's x-position moves velocity amount
	public void move(){
			xPos += velocity;
	}
	// Pre-condition: Input is any integer
	// Post-condition: Input is added to existing velocity
	public void addVelocity(int velocity){
		if(this.velocity < 10){
			this.velocity += velocity;
		}
	}
	// Pre-condition: Graphics g is not null
	// Post-condition: Draws the paddle on the screen
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillRect(xPos, yPos, width, height);
	}
}
