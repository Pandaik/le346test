package org.usfirst.frc.team346.robot;

public class SingleStickOut {
	
	private double rightSide;
	private double leftSide;
	
	final double d = .4;
	final double nd = -.4;
	
	SingleStickControl con;
	
	public SingleStickOut() {
		con = new SingleStickControl(4);
	}
	
	public double OutR () {
		double v = con.ControllerOutputR();
		
		if(con.ControllerOutputR() > d) {
			rightSide = v;
		}
		
		if(con.ControllerOutputR() < nd) {
			rightSide = v;
		}
		
		if(con.ControllerOutputR() < d && con.ControllerOutputR() > nd) {
			rightSide = 0;
		}
		
		return rightSide;
	}
}
