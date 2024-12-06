/*
 * Author: Adam Wang
 * Date: 12/04/2024
 * Description: This component is the moving ball which the user will hit with the paddle.
 */

import java.awt.*;

public class Ball {

	// Instance variables
	private int xPos;
	private int yPos;
	private int size;
	private int xVelocity;
	private int yVelocity;
	
	// Constructor
	public Ball(int x, int y, int size){
		xPos = x;
		yPos = y;
		this.size = size;
		xVelocity = 1;
		yVelocity = -5;
	}

	// Getters and setters
	public int getXpos(){
		return xPos;
	}
	public int getYpos(){
		return yPos;
	}
	public int getSize(){
		return size;
	}
	public void setXVelocity(int velocity){
		xVelocity = velocity;
	}
	public void setYVelocity(int velocity){
		yVelocity = velocity;
	}
	public void setX(int x){
		xPos = x;
	}
	public void setY(int y){
		yPos = y;
	}

	// Pre-condition: N/A
	// Post-condition: Ball's x-position moves xVelocity amount, y-position moves yVelocity amount
	public void move(){
		xPos += xVelocity;
		yPos += yVelocity;
	}
	// Pre-condition: N/A
	// Post-condition: xVelocity becomes itself multiplied by -1
	public void reverseX(){
		xVelocity = xVelocity * -1;
	}
	// Pre-condition: N/A
	// Post-condition: yVelocity becomes itself multiplied by -1
	public void reverseY(){
		yVelocity = yVelocity * -1;
	}
	// Pre-condition: Graphics g is not null
	// Post-condition: Paddle is drawn on screen
	public void draw(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(xPos, yPos, size, size);
	}
}
