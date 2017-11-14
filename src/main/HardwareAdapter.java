package main;

import edu.wpi.first.wpilibj.Talon;
import lib.joystick.XboxController;

public interface HardwareAdapter extends Constants {
	//DriveTrain Talon's
	public static final Talon forwardTalon = new Talon(DRIVETRAIN_TALON_FORWARD_PWM_OUT);
	public static final Talon leftTalon = new Talon(DRIVETRAIN_TALON_LEFT_PWM_OUT);
	public static final Talon rightTalon = new Talon(DRIVETRAIN_TALON_RIGHT_PWM_OUT);
	
	//Joystick's
	public static final XboxController xbox = new XboxController(OI_JOYSTICK_DRIVE_USB_IN);

}
