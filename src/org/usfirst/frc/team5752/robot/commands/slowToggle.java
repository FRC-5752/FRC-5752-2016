package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class slowToggle extends Command {

    public slowToggle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.SPIN_SLOW = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.SPIN_SLOW = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.SPIN_SLOW = false;
    }
}
