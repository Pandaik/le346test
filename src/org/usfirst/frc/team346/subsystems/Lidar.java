package org.usfirst.frc.PUT_YOUR_TEAM_HERE.robot;

import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Timer;

/**
*
*/
public class LidarSubsystem extends SensorBase{

I2C m_i2c;

public LidarSubsystem() { 
m_i2c = new I2C(I2C.Port.kMXP,0x62);
initLidar(); 
}

public void initLidar(){	
// nothing to do
}

public int getDistance() {

byte[] buffer; 
buffer = new byte[2];

m_i2c.write(0x00, 0x04);
Timer.delay(0.04);
m_i2c.read(0x8f, 2, buffer); 


return (int)Integer.toUnsignedLong(buffer[0] << 8) + Byte.toUnsignedInt(buffer[1]);	
}


public void initDefaultCommand() {
// Set the default command for a subsystem here.
//setDefaultCommand(new MySpecialCommand());
}


}

Here is a simple robot code to demonstrate:

package org.usfirst.frc.PUT_YOUR_TEAM_HERE.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
* The VM is configured to automatically run this class, and to call the
* functions corresponding to each mode, as described in the IterativeRobot
* documentation. If you change the name of this class or the package after
* creating this project, you must also update the manifest file in the resource
* directory.
*/
public class Robot extends IterativeRobot{

LidarSubsystem lidar1;

/**
* This function is run when the robot is first started up and should be
* used for any initialization code.
*/
public void robotInit() {

lidar1=new LidarSubsystem();

}

/**
* This function is run once each time the robot enters autonomous mode
*/
public void autonomousInit() {
}

/**
* This function is called periodically during autonomous
*/
public void autonomousPeriodic() {

int distance;

distance = lidar1.getDistance();
System.out.println(distance); // this prints to the console window.

}

/**
* This function is called once each time the robot enters tele-operated mode
*/
public void teleopInit(){
}

/**
* This function is called periodically during operator control
*/
public void teleopPeriodic() {

}

/**
* This function is called periodically during test mode
*/
public void testPeriodic() {
LiveWindow.run();
}

}

