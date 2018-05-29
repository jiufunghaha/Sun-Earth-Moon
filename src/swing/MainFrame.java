package swing;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Timer;

import aster.Earth;
import aster.Mercury;
import aster.Moon;
import aster.Sun;
import aster.Venus;
import constant.WindowConstant;

@SuppressWarnings("serial")
public class MainFrame extends Frame implements ActionListener{
	
	Sun sun = new Sun();
	Earth earth = new Earth(sun);
	Moon moon = new Moon(earth);
	Mercury mercury = new Mercury(sun);
	Venus venus = new Venus(sun);
	
	Timer timer = new Timer(WindowConstant.TIMER_DELAY, this);
	
	public MainFrame(){
		this.setFocusable(true);
		timer.start();
	}
	
	public void launchFrame(){
		//设置窗体大小
		setSize(WindowConstant.WINDOW_WIDTH, WindowConstant.WINDOW_HEIGHT);
		//设置背景颜色
		setBackground(Color.black);
		//窗体居中
		setLocationRelativeTo(null);
		//窗体不可拉伸
		setResizable(false);
		//窗体可视
		setVisible(true);
		//点×关闭窗体
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		//画出太阳
		sun.drawAster(g);
		//画出水星
		mercury.drawAster(g);
		//画出金星
		venus.drawAster(g);
		//画出地球
		earth.drawAster(g);
		//画出月球
		moon.drawAster(g);
		//画出行星卫星轨道
		//drawOrbit(g);
	}
	
	//画出行星卫星轨道
	public void drawOrbit(Graphics g){
		mercury.drawOrbit(g);
		venus.drawOrbit(g);
		earth.drawOrbit(g);
		moon.drawOrbit(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
}
