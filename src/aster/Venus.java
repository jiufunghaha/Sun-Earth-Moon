package aster;

import java.awt.Color;
import java.awt.Graphics;

import constant.AsterConstant;

public class Venus extends Planet{
	
	public Venus(){}
	
	public Venus(Aster centerAster){
		super(centerAster, AsterConstant.VENUS_CENTERX, AsterConstant.VENUS_CENTERY, AsterConstant.VENUS_RADIUS,
				AsterConstant.VENUS_ORBIT_RADIUS, AsterConstant.VENUS_DEGREE, AsterConstant.VENUS_SPEED);
	}

	@Override
	public void drawAster(Graphics g) {
		// TODO Auto-generated method stub
		Color originalColor = g.getColor();
		int centerX = getCenterX();
		int centerY = getCenterY();
		g.setColor(new Color(140, 25, 0));
		g.fillOval(getX(), getY(), getRadius()*2, getRadius()*2);
		setCenterXY(centerX, centerY);
		g.setColor(originalColor);
	}

}
