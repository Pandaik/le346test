package org.usfirst.frc.team346.robot;



import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drive {
	
	private TalonSRX leftDrive;
	private TalonSRX leftSlave1;	
	private TalonSRX leftSlave2;
	private TalonSRX rightDrive;
	private TalonSRX rightSlave1;
	private TalonSRX rightSlave2;
	
	
	SingleStickOut controller;
	
	public Drive(int driveLeft, int slaveLeft1,int slaveLeft2, int controllerID,int driveRight, int slaveRight1, int slaveRight2) {
		leftDrive = new TalonSRX(driveLeft);
		leftSlave1=new TalonSRX(slaveLeft1);
		leftSlave2= new TalonSRX(slaveLeft2);
		rightDrive = new TalonSRX(driveRight);
		rightSlave1 =new TalonSRX(slaveRight1);
		rightSlave2= new TalonSRX(slaveRight2);
		
		
		
		controller = new SingleStickOut(controllerID);
		
	}
	public void Init() {
		
		leftDrive.set(ControlMode.PercentOutput, 0);
		rightDrive.set(ControlMode.PercentOutput, 0);
		leftSlave1.follow(leftDrive);
		leftSlave2.follow(leftDrive);
		rightSlave1.follow(rightDrive);
		rightSlave2.follow(rightDrive);
	}
	public void Move() {
		
		leftDrive.set(ControlMode.PercentOutput, controller.OutL());
		rightDrive.set(ControlMode.PercentOutput, controller.OutR());
		
	}
}