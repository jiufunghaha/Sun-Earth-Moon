package aster;

import java.awt.Graphics;

/*
 * 星体抽象类
 */
public abstract class Aster {
	
	private int x;
	private int y;
	private int centerX;
	private int centerY;
	private int radius;
	
	public Aster(){}
	
	public Aster(int centerX, int centerY, int radius){
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		setXY();
	}
	
	public abstract void drawAster(Graphics g);
	
	private void setXY(){
		x = centerX - radius;
		y = centerY - radius;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getCenterX(){
		return centerX;
	}
	
	public int getCenterY(){
		return centerY;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public void setCenterXY(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
		setXY();
	}

}
