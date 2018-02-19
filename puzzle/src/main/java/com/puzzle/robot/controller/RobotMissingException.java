package com.puzzle.robot.controller;

public class RobotMissingException extends Exception {

	private static final long serialVersionUID = 5993657303580682718L;

	public RobotMissingException() {
		super();
	}

	public RobotMissingException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public RobotMissingException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public RobotMissingException(String arg0) {
		super(arg0);
	}

	public RobotMissingException(Throwable arg0) {
		super(arg0);
	}

	
}
