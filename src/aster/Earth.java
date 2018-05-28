package aster;

import java.awt.Color;
import java.awt.Graphics;

import constant.AsterConstant;

/*
 * 地球类
 */
public class Earth extends Planet{
	
	public Earth(Aster centerAster){
		super(centerAster, AsterConstant.EARTH_CENTERX, AsterConstant.EARTH_CENTERY, AsterConstant.EARTH_RADIUS,
				AsterConstant.EARTH_ORBIT_RADIUS, AsterConstant.EARTH_DEGREE, AsterConstant.EARTH_SPEED);
	}

	@Override
	public void drawAster(Graphics g) {
		Color originalColor = g.getColor();
		int centerX = getCenterX();
		int centerY = getCenterY();
		drawOrbit(g);
		g.setColor(new Color(100, 100, 255));
		g.fillOval(getX(), getY(), getRadius()*2, getRadius()*2);
		setCenterXY(centerX, centerY);
		g.setColor(originalColor);
	}

}
