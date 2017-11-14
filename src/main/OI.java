package main;

import lib.joystick.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI implements HardwareAdapter{
	public static XboxController getJoystick() {
		return xbox;
	}
	public static double getJoystickX() {
		return xbox.getX();
		
	}
	public static double getJoystickY() {
		return xbox.getY();
		
	}
	public static double getJoystickAltX() {
		return xbox.getAltX();
		
	}
	public static double getJoystickAltY() {
		return xbox.getAltY();
		
	}
}

