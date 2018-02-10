package org.usfirst.frc.team346.robot;

public class Round {
	public double calc(double input) {
		input = input*100;
		input = Math.round(input);
		input = input/100;
		return input;
	}
}

