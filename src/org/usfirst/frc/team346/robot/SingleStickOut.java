package org.usfirst.frc.team346.robot;

public class SingleStickOut {
	
	private double rightSide;
	private double leftSide;
	
	final double d = .4;
	final double nd = -.4;
	
	SingleStickControl con;
	

	public SingleStickOut(int control) {
		con = new SingleStickControl(control);
		con.getSticks();
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
	public double OutL () {
		double v = con.ControllerOutputL();
		
		if(con.ControllerOutputL() > d) {
			rightSide = v;
		}
		
		if(con.ControllerOutputL() < nd) {
			rightSide = v;
		}
		
		if(con.ControllerOutputL() < d && con.ControllerOutputL() > nd) {
			rightSide = 0;
		}
		
		return rightSide;
	}
}
