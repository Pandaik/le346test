package org.usfirst.frc.team346.control;

import org.usfirst.frc.team346.robot.Drive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class SingleStickControl {
	double sideRight;
	double sideLeft;
	
	int dir;
	Drive driveTrain;
	XboxController xbxcontrol;
	
	double x = xbxcontrol.getX(Hand.kLeft);
	double y = xbxcontrol.getY(Hand.kLeft);
	
	public SingleStickControl(int controller) {
		xbxcontrol = new XboxController(controller);
	}
//	public void ControllerDropout() {
//		if(xbxcontrol.getY(Hand.kLeft) <5 && xbxcontrol.getY(Hand.kLeft))
	
//	public void getDirection() {
//		//forward = -1
//		//backwards = 1
//		if(xbxcontrol.getY(Hand.kLeft)>0) {
//			dir = 1;
//		}
//		if(xbxcontrol.getY(Hand.kLeft)<0) {
//			dir = -1;
//		}
//		else{
//			dir = 0;
//		}
//	}
	
	public double ControllerOutputR() {
		if(x>0) {
			sideRight = (x - 1) *y;
		}
		if(x<0 && y<0) {
			sideRight = (Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5)); 
		}
		if(x<0 && y>0) {
			sideRight = -1*(Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), .5));
		}
		if (y==0 && x == 0) {
			sideRight = 0;
		}
		
		
		return sideRight;
	}
	public double ControllerOutputL() {
		if(xbxcontrol.getX(Hand.kLeft)<0) {
			sideLeft = (xbxcontrol.getX(Hand.kLeft) + 1) *xbxcontrol.getY(Hand.kLeft);
		}
		if(xbxcontrol.getX(Hand.kLeft)>0 && xbxcontrol.getY(Hand.kLeft)<0) {
			sideLeft = (Math.pow((Math.pow(xbxcontrol.getX(Hand.kLeft), 2) + Math.pow(xbxcontrol.getY(Hand.kLeft), 2)), .5));
		}
		if(xbxcontrol.getX(Hand.kLeft)>0 && xbxcontrol.getY(Hand.kLeft)>0) {
			sideLeft = -1*(Math.pow((Math.pow(xbxcontrol.getX(Hand.kLeft), 2) + Math.pow(xbxcontrol.getY(Hand.kLeft), 2)), .5));
		}
		if (xbxcontrol.getY(Hand.kLeft)==0) {
			sideLeft = 0;
		}
		
		
		return sideLeft;
	}
}