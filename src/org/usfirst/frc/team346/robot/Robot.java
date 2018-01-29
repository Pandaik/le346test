/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team346.robot;

import org.usfirst.frc.team346.control.SingleStickControl;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	
	//Drive drive = new Drive(14, 16, 4);
	SingleStickControl con = new SingleStickControl(4);
	TalonSRX testTalon = new TalonSRX(16);
	public void robotInit() {
		//drive.Init();
		testTalon.set(ControlMode.PercentOutput, 0);
	}

	
	
	public void autonomousInit() {
		
	}

	
 
	public void autonomousPeriodic() {
		
	}

	

	public void teleopPeriodic() {
		//drive.Move();
		System.out.println(con.ControllerOutputR());
		testTalon.set(ControlMode.PercentOutput, con.ControllerOutputR());
	}

	public void testPeriodic() {
	}
}
