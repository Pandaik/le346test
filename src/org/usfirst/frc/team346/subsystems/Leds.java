package org.usfirst.frc.team346.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;

public class Leds {
	
	Solenoid r = new Solenoid(0,5) ;	
	Solenoid b = new Solenoid(0,4);
	Solenoid g = new Solenoid(0,3);
	Solenoid p = new Solenoid(0,7);
	
	public void waitTime(double _seconds) {
		long lInitialTime = System.currentTimeMillis();
		while(System.currentTimeMillis() - lInitialTime < Math.abs(_seconds) * 1000) {
		}
	}
	
	Joystick xbx = new Joystick(0);
	public void ledInit() {
		r.set(false);
		g.set(false);
		b.set(false);
		p.set(true);
		
	}
//	public void ledChange () {
//		if(xbx.getRawButton(2)) {
//			b.set(true);
//		}else {
//			b.set(false);
//		}
//		if(xbx.getRawButton(3)) {
//			r.set(true);
//		}else {
//			r.set(false);
//		}
//		if(xbx.getRawButton(4)) {
//			g.set(true);
//		}else {
//			g.set(false);
//		}
//	}
	public void epilepsy() {
		r.set(Rand.randomBoolean());
		g.set(Rand.randomBoolean());
		b.set(Rand.randomBoolean());
	}
	public void red() {
		r.set(true);
		g.set(false);
		b.set(false);
	}
	public void blue() {
		r.set(false);
		g.set(false);
		b.set(true);
	}
	public void yellow() {
		r.set(true);
		g.set(true);
		b.set(false);
	}
	public void white() {
		r.set(true);
		g.set(true);
		b.set(true);
	}
	public void purple() {
		r.set(true);
		g.set(false);
		b.set(true);
	}
	public void black() {
		r.set(false);
		g.set(false);
		b.set(false);
	}
	public void green() {
		r.set(false);
		g.set(true);
		b.set(false);
	}
	public void lightBlue() {
		r.set(false);
		g.set(true);
		b.set(true);
	}
}
