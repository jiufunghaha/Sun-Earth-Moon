package aster;

import java.awt.Color;
import java.awt.Graphics;

import constant.AsterConstant;

/*
 * 月球类
 */
public class Moon extends Planet{
	
	public Moon(){}
	
	public Moon(Planet centerPlanet) {
		super(centerPlanet, AsterConstant.MOON_CENTERX, AsterConstant.MOON_CENTERY, AsterConstant.MOON_RADIUS,
				AsterConstant.MOON_ORBIT_RADIUS, AsterConstant.MOON_DEGREE, AsterConstant.MOON_SPEED);
	}

	@Override
	public void drawAster(Graphics g) {
		Color originalColor = g.getColor();
		int centerX = getCenterX();
		int centerY = getCenterY();
		g.setColor(Color.white);
		g.fillOval(getX(), getY(), getRadius()*2, getRadius()*2);
		setCenterXY(centerX, centerY);
		g.setColor(originalColor);
	}

}
