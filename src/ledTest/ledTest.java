package ledTest;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;

public class ledTest {
	
	TalonSRX talon= new TalonSRX(42);
	
		
	Joystick controller= new Joystick(0);
	Solenoid black= new Solenoid(7);
	Solenoid red=new Solenoid(5);
	Solenoid blue= new Solenoid(4);
	Solenoid green= new Solenoid(3);
	public ledTest() {

	}
	

	public void run()
	{
	if(controller.getRawAxis(5)<-.5)
	{
		red(black,red,blue,green);
		talon.set(ControlMode.PercentOutput, 1);
		
	}
	else if(controller.getRawAxis(5)>.5)
	{
		blue(black,red,blue,green);
		talon.set(ControlMode.PercentOutput, -1);
		
	}
	else if(controller.getRawAxis(4)<-.5)
	{
		red(black,red,blue,green);
		waitTime(.1);
		blue(black,red,blue,green);
		waitTime(.1);
		
	}
	else if(controller.getRawAxis(4)>.5)
	{
		green(black,red,blue,green);
		waitTime(.1);
		purple(black,red,blue,green);
		waitTime(.1);
	
		
	}
	else if(controller.getRawAxis(1)<-.5)
	{
		yellow(black,red,blue,green);
		waitTime(.1);
		lightBlue(black,red,blue,green);
		waitTime(.1);
	}
	else if(controller.getRawAxis(1)>.5)
	{
		lightBlue(black,red,blue,green);
		waitTime(.1);
		green(black,red,blue,green);
		waitTime(.1);
	}
	else if(controller.getRawButton(6))
	{
		epilepsy(black,red,blue,green);
	}
	else if(controller.getRawButton(5))
	{
		superEpilepsy(black,red,blue,green);
	}
	else if(controller.getRawButton(9))
	{
		notEpilepsy(black,red,blue,green);
	}
	else if(controller.getRawButton(4))
	{
		yellow(black,red,blue,green);
	}
	else if(controller.getRawButton(10))
	{
		red(black,red,blue,green);
		waitTime(.1);
		blue(black,red,blue,green);
		waitTime(.1);
	}
	else if(controller.getRawButton(3))
	{
		blue(black,red,blue,green);
	}
	else if(controller.getRawButton(1))
	{
		green(black,red,blue,green);
	}
	else if(controller.getRawButton(2))
	{
		red(black,red,blue,green);
	}
	else
	{
		off(black,red,blue,green);
		this.talon.set(ControlMode.PercentOutput, 0);
	}
	}
	
	public void red(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(true);
		blue.set(false);
		green.set(false);
	}
	public void blue(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(false);
		blue.set(true);
		green.set(false);
	}
	public void green(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(false);
		blue.set(false);
		green.set(true);
	}
	public void pink(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(true);
		blue.set(true);
		green.set(true);
	}
	public void yellow(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(true);
		blue.set(false);
		green.set(true);
	}
	public void purple(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(true);
		blue.set(true);
		green.set(false);
	}
	public void lightBlue(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(true);
		red.set(false);
		blue.set(true);
		green.set(true);
	}
	public void off(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		black.set(false);
		red.set(false);
		blue.set(false);
		green.set(false);
	}
	public void superEpilepsy(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		red(black,red,blue,green);
		waitTime(.05);
		blue(black,red,blue,green);
		waitTime(.05);
		green(black,red,blue,green);
		waitTime(.05);
		pink(black,red,blue,green);
		waitTime(.05);
		purple(black,red,blue,green);
		waitTime(.05);
		yellow(black,red,blue,green);
		waitTime(.05);
		lightBlue(black,red,blue,green);
	}
	public void notEpilepsy(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
	red(black,red,blue,green);
	waitTime(.75);
	blue(black,red,blue,green);
	waitTime(.75);
	green(black,red,blue,green);
	waitTime(.75);
	pink(black,red,blue,green);
	waitTime(.75);
	purple(black,red,blue,green);
	waitTime(.75);
	yellow(black,red,blue,green);
	waitTime(.75);
	lightBlue(black,red,blue,green);
	}
	public void epilepsy(Solenoid black,Solenoid red,Solenoid blue, Solenoid green)
	{
		red(black,red,blue,green);
		waitTime(.1);
		blue(black,red,blue,green);
		waitTime(.1);
		green(black,red,blue,green);
		waitTime(.1);
		pink(black,red,blue,green);
		waitTime(.1);
		purple(black,red,blue,green);
		waitTime(.1);
		yellow(black,red,blue,green);
		waitTime(.1);
		lightBlue(black,red,blue,green);
	}
	public void waitTime(double _seconds) {
		long initialTime = System.currentTimeMillis();
		while(System.currentTimeMillis() - initialTime < Math.abs(_seconds) * 1000) {
		}
	}
	
}