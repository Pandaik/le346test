/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team346.robot;



import org.usfirst.frc.team346.subsystems.ProximitySensor;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;
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
	SingleStickControl con = new SingleStickControl(4);
	TalonSRX testTalon = new TalonSRX(16);
	TalonSRX testTalon2 = new TalonSRX(14);
	XboxController xbx = new XboxController(4);
	ProximitySensor prox = new ProximitySensor(0);
	
	public void robotInit() {
		testTalon.set(ControlMode.PercentOutput, 0);
		testTalon2.set(ControlMode.PercentOutput, 0);
	}

	
	
	public void autonomousInit() {
		
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	
	public void autonomousPeriodic() {
		
	}

	/**
	 * This function is called periodically during operator control.
	 */
	public void teleopPeriodic() {
		if (prox.Read()) {
			testTalon.set(ControlMode.PercentOutput,50 );
		}else {
			testTalon.set(ControlMode.PercentOutput, 0 );
		}
				
		//testTalon.set(ControlMode.PercentOutput, con.ControllerOutputR());
		//testTalon2.set(ControlMode.PercentOutput, -1*(con.ControllerOutputL()));
		//testTalon.set(ControlMode.PercentOutput, xbx.getY(Hand.kLeft));
	}
		
	
	
	public void testPeriodic() {
		//System.out.println(con.ControllerOutputL());
		//System.out.println(in.getVoltage());
	}
}
