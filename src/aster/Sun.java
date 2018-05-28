package aster;

import java.awt.Color;
import java.awt.Graphics;

import constant.AsterConstant;
import constant.WindowConstant;

/*
 * 太阳类
 */
public class Sun extends Aster{
	
	public Sun(){
		super(WindowConstant.WINDOW_WIDTH/2, WindowConstant.WINDOW_HEIGHT/2, AsterConstant.SUN_RADIUS);
	}

	@Override
	public void drawAster(Graphics g) {
		Color originalColor = g.getColor();
		g.setColor(Color.orange);
		g.fillOval(getX(), getY(), getRadius()*2, getRadius()*2);
		g.setColor(originalColor);
	}

}
