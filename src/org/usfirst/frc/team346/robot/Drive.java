package org.usfirst.frc.team346.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class Drive {
	
	TalonSRX leftDrive;
	TalonSRX leftSlave1;
	XboxController xbx;
	
	public Drive(int driveLeft, int driveLeftSlave1, int xbox) {
		leftDrive = new TalonSRX(driveLeft);
		leftSlave1 = new TalonSRX(driveLeftSlave1);
		
		xbx = new XboxController(xbox);
	}
	public void Init() {
		leftDrive.set(ControlMode.PercentOutput, 0);
		leftSlave1.follow(leftDrive);
	}
	public void Move() {
		leftDrive.set(ControlMode.PercentOutput, xbx.getY(Hand.kLeft));
		leftSlave1.follow(leftDrive);
	}
}
