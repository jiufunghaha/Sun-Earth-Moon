package aster;

import java.awt.Color;
import java.awt.Graphics;

import constant.AsterConstant;

public class Mercury extends Planet{
	
	public Mercury(){}
	
	public Mercury(Aster centerAster){
		super(centerAster, AsterConstant.MERCURY_CENTERX, AsterConstant.MERCURY_CENTERY, AsterConstant.MERCURY_RADIUS,
				AsterConstant.MERCURY_ORBIT_RADIUS, AsterConstant.MERCURY_DEGREE, AsterConstant.MERCURY_SPEED);
	}

	@Override
	public void drawAster(Graphics g) {
		Color originalColor = g.getColor();
		int centerX = getCenterX();
		int centerY = getCenterY();
		g.setColor(new Color(138, 43, 226));
		g.fillOval(getX(), getY(), getRadius()*2, getRadius()*2);
		setCenterXY(centerX, centerY);
		g.setColor(originalColor);
	}

}
