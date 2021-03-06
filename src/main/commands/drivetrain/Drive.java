package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import main.OI;
import main.Robot;

public class Drive extends Command {

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.move(OI.getJoystickX(), OI.getJoystickY(), OI.getJoystickAltX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
