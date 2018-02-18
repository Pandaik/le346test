package org.usfirst.frc.team346.robot;

public class SingleStickOut {
	
	private double rightSide;
	private double leftSide;
	
	final double d = .2;
	final double nd = -.2;
	
	SingleStickControl con;
	
//	Round rounding;

	public SingleStickOut(int control) {
		con = new SingleStickControl(control);
//		rounding = new Round();
		//con.getSticks();
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
			leftSide = v;
		}
		
		if(con.ControllerOutputL() < nd) {
			leftSide = v;
		}
		
		if(con.ControllerOutputL() < d && con.ControllerOutputL() > nd) {
			leftSide = 0;
		}
		
		return leftSide;
	}
}
