package org.usfirst.frc.team346.robot;



import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drive {
	
	TalonSRX leftDrive;
	TalonSRX rightDrive;
	
	SingleStickControl controller;
	
	public Drive(int driveLeft, int driveLeftSlave1, int controllerID) {
		leftDrive = new TalonSRX(driveLeft);
		rightDrive = new TalonSRX(driveLeftSlave1);
		
		controller = new SingleStickControl(controllerID);
		
	}
	public void Init() {
		
		leftDrive.set(ControlMode.PercentOutput, 0);
		rightDrive.set(ControlMode.PercentOutput, 0);
		
	}
	public void Move() {
		
		leftDrive.set(ControlMode.PercentOutput, controller.ControllerOutputL());
		rightDrive.set(ControlMode.PercentOutput, controller.ControllerOutputR());
		
	}
}