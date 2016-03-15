package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.subsystems.intakeSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class intakeSlowToggle extends Command {

    public intakeSlowToggle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	/*RobotMap.INTAKE_ON = true;
    	
    	if (RobotMap.INTAKE_ON) {
    		RobotMap.INTAKE_ON = false;
    	} else {
    		RobotMap.INTAKE_ON = true;
    	}*/
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	intakeSystem.move(.7);
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
    	intakeSystem.stop();
    }
}
