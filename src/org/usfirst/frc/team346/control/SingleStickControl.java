package org.usfirst.frc.team346.control;

import org.usfirst.frc.team346.robot.Drive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.XboxController;

public class SingleStickControl {
	float sideRight;
	int sideLeft;
	int dir;
	Drive driveTrain;
	XboxController xbxcontrol;
	public SingleStickControl(int controller) {
		xbxcontrol = new XboxController(controller);
	}
//	public void ControllerDropout() {
//		if(xbxcontrol.getY(Hand.kLeft) <5 && xbxcontrol.getY(Hand.kLeft))
	
	public void getDirection() {
		//forward = -1
		//backwards = 1
		if(xbxcontrol.getY(Hand.kLeft)>0) {
			dir = 1;
		}
		if(xbxcontrol.getY(Hand.kLeft)<0) {
			dir = -1;
		}
		else{
			dir = 0;
		}
	}
	
	public float ControllerOutputR() {
		if(xbxcontrol.getX(Hand.kLeft)>0 && xbxcontrol.getY(Hand.kLeft)!=0) {
			sideRight = (1 - xbxcontrol.getX(Hand.kLeft));
		}
		
		return sideRight;
	}

}