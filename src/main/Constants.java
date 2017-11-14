package main;

/**
 * REPLACES ROBOTMAP
 */
public interface Constants{
	
	/*************
	 * VARIABLES *
	 *************/
	//DRIVETRAIN VELOCITY MODIFIERS
	public final double DRIVETRAIN_SPEED = 1.0;//Assert (0 - 1.0)
	
	/*************
	 * CONSTANTS *
	 *************/
	//JOYSTICK INVERSION MODIFIERS
	public final boolean OI_JOYSTICK_DRIVE_XAxis_INVERT = false;
	public final boolean OI_JOYSTICK_DRIVE_YAxis_INVERT = false;
	public final boolean OI_JOYSTICK_DRIVE_XAltAxis_INVERT = false;
		
	//MOTOR CONTROLLER INVERSION MODIFIERS
	public final boolean DRIVETRAIN_TALON_FORWARD_INVERT = false;
	public final boolean DRIVETRAIN_TALON_LEFT_INVERT = false;
	public final boolean DRIVETRAIN_TALON_RIGHT_INVERT = false;
		
	
	/****************
	 * DEVICE PORTS *
	 ****************/
	//USB JOYSTICKS
	public final int OI_JOYSTICK_DRIVE_USB_IN = 0;
		
	//MOTOR CONTROLLERS
	public final int DRIVETRAIN_TALON_FORWARD_PWM_OUT = 7;
	public final int DRIVETRAIN_TALON_LEFT_PWM_OUT = 8;
	public final int DRIVETRAIN_TALON_RIGHT_PWM_OUT = 9;
	
	
}