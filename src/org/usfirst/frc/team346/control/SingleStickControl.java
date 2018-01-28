package org.usfirst.frc.team346.control;

import org.usfirst.frc.team346.robot.Drive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class SingleStickControl {
	int sideRight;
	int sideLeft;
	int dir;
	Drive driveTrain;
	XboxController xbxcontrol;
	public SingleStickControl(int controller) {
		xbxcontrol = new XboxController(controller);
	}
//	public void ControllerDropout() {
//		if(xbxcontrol.getY(Hand.kLeft) <5 && xbxcontrol.getY(Hand.kLeft))
//	}
	public double ControllerOutputR() {
		
		//forward = -1
		//backwards = 1
		
		if(xbxcontrol.getY(Hand.kLeft) > 0) {
			dir = 1;
		}
		if(xbxcontrol.getY(Hand.kLeft) < 0) {
			dir = -1;
		}
		else {
			dir = 0;
		}
		
		if(dir!=0) {
			
		}
	}

}