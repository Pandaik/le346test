
package org.usfirst.frc.team346.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class SingleStickControl {
	private double sideRight;
	private double sideLeft;
	
//	private double outr;
//	private double outl;
	
	final double d = .1;
	final double nd = -.1;
	
	Round r;
	
	int dir;
	Drive driveTrain;
	XboxController xbxcontrol;
	
	double x;
	double y;
	
	public SingleStickControl(int controller) {
		xbxcontrol = new XboxController(controller);
		x = xbxcontrol.getX(Hand.kLeft);
		y = xbxcontrol.getY(Hand.kLeft);
		
	}
//	public void ControllerDropout() {
//		if(xbxcontrol.getY(Hand.kLeft) <5 && xbxcontrol.getY(Hand.kLeft))
	public void getSticks() {
		x = xbxcontrol.getX(Hand.kLeft);
		y = xbxcontrol.getY(Hand.kLeft);
	}
	
	public double ControllerOutputR() {
		
		x = xbxcontrol.getX(Hand.kLeft);
		y = xbxcontrol.getY(Hand.kLeft);
		if(x>0&&y>d) {
			if(y>d) {
				sideRight = -1*(Math.pow(Math.abs((x-1)*y), .5));
			}
			else {
				sideRight = 0;
			}
		}
		if(x>0&&y<nd) {
			if(y<nd) {
				sideRight = Math.pow((x-1)*y, .5);
			}
			else {
				sideRight = 0;
			}
		}
		if(x<0 && y<nd) {
			if((Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)),.5))>d) {
				sideRight = (Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)),.5)); 
			}else {
				sideRight = 0; 
			}
		}
		if(x<0 && y>d) {
			if((-1*(Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)),.5)))<nd) {
				sideRight = -1*(Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)),.5));
			}else {
				sideRight = 0;
			}
		}if(x>0&&y>nd&&y<d) {
			sideRight=0;
		}
		
		return sideRight;
	}
	public double ControllerOutputL() {
		x = xbxcontrol.getX(Hand.kLeft);
		y = xbxcontrol.getY(Hand.kLeft);
		if(x<0&&y>d) {
			sideLeft = -1*(Math.pow(Math.abs((x + 1) *y), .5));
		}
		if(x<0&&y<nd) {
			sideLeft = Math.pow(Math.abs((x + 1) *y), .5);
		}
		if(x>0 && y<nd) {
			if(Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)), .5)>d) {
				sideLeft = Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)), .5);
			}
			else {
				sideLeft = 0;
			}
		}
		if(x>0 && y>d) {
			if((-1*(Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)), .5)))<nd) {
				sideLeft = -1*(Math.pow((Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)), .5));
			}
			else {
				sideLeft = 0;
			}
		}
		
		if (x<0 && y>nd && y<d) {
			sideLeft = 0;
		}
		
		
		return sideLeft;
	}
	
}