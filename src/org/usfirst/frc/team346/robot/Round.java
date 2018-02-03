package org.usfirst.frc.team346.robot;

public class Round {
	public double calc(double input) {
		input*=100;
		Math.round(input);
		input/=100;
		return input;
	}
}

