package main.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.drivetrain.Drive;

public class DriveTrain extends Subsystem implements Constants, HardwareAdapter {
	private double forwardSpeed, leftSpeed, rightSpeed;
    
	public void move(double x, double y, double strafeX) {
    	if(Constants.OI_JOYSTICK_DRIVE_XAxis_INVERT)
    		x = x * -1;
    	if(Constants.OI_JOYSTICK_DRIVE_YAxis_INVERT)
    		y = y * -1;
    	if(Constants.OI_JOYSTICK_DRIVE_XAltAxis_INVERT)
    		strafeX = strafeX * -1;
    	
    	if(Constants.DRIVETRAIN_TALON_FORWARD_INVERT)
    		forwardSpeed = (x+strafeX) * -1;
    	else
    		forwardSpeed = x+strafeX;
    	if(Constants.DRIVETRAIN_TALON_LEFT_INVERT)
    		leftSpeed = (-x/2 + 0.866*y + strafeX) * -1;
    	else
    		leftSpeed = -x/2 + 0.866*y + strafeX;
    	if(Constants.DRIVETRAIN_TALON_RIGHT_INVERT)
    		rightSpeed = (-x/2 - 0.866*y +strafeX) * -1;
    	else
    		rightSpeed = -x/2 - 0.866*y +strafeX;
    	
    	forwardTalon.set(forwardSpeed * Constants.DRIVETRAIN_SPEED);
    	leftTalon.set(leftSpeed * Constants.DRIVETRAIN_SPEED);
    	rightTalon.set(rightSpeed * Constants.DRIVETRAIN_SPEED);
    }
	
	public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
}

