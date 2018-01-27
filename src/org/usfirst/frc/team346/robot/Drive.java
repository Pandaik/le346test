package org.usfirst.frc.team346.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class Drive {
	
	TalonSRX leftDrive;
	XboxController xbx;
	
	public Drive(int driveLeft, int xbox) {
		leftDrive = new TalonSRX(driveLeft);
		xbx = new XboxController(xbox);
	}
	public void Init() {
		leftDrive.set(ControlMode.PercentOutput, 0);
	}
	public void Move() {
		leftDrive.set(ControlMode.PercentOutput, xbx.getY(Hand.kLeft));
	}
}
