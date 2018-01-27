package org.usfirst.frc.team346.subsystems;


import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.Timer;

/**
*
*/
public class Lidar extends SensorBase{

	I2C m_i2c;
	
	public Lidar() { 
		m_i2c = new I2C(I2C.Port.kMXP,0x62);
		initLidar(); 
	}
	
	public void initLidar(){	
	
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
