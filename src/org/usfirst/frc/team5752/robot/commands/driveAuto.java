package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveAuto extends Command {

    public driveAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//DriveTrain.drive(.5, 0, o, GYRO_ANGLE);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
