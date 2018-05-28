package aster;

import java.awt.Color;
import java.awt.Graphics;

/*
 * 行星抽象类
 */
public abstract class Planet extends Aster{
	
	private Aster centerAster;
	
	private int orbitRadius;
	
	private double degree;
	private double speed;
	
	public Planet(){
		super();
	}
	
	public Planet(Aster centerAster, int centerX, int centerY, int radius, int orbitRadius, double degree, double speed){
		super(centerX, centerY, radius);
		this.centerAster = centerAster;
		this.orbitRadius = orbitRadius;
		this.degree = degree;
		this.speed = speed;
	}
	
	public double getDegree(){
		int centerX = (int) (centerAster.getCenterX()+orbitRadius*Math.cos(degree));
		int centerY = (int) (centerAster.getCenterY()+orbitRadius*Math.sin(degree));
		degree += speed;
		setCenterXY(centerX, centerY);
		return degree;
	}
	
	public void drawOrbit(Graphics g){
		Color originalColor = g.getColor();
		g.setColor(Color.white);
		g.drawOval(centerAster.getCenterX()-orbitRadius, centerAster.getCenterY()-orbitRadius, orbitRadius*2, orbitRadius*2);
		g.setColor(originalColor);
	}
	
	@Override
	public void setCenterXY(int centerX, int centerY) {
		centerX = (int) (centerAster.getCenterX()+orbitRadius*Math.cos(degree));
		centerY = (int) (centerAster.getCenterY()+orbitRadius*Math.sin(degree));
		degree += speed;
		super.setCenterXY(centerX, centerY);
	}
}
