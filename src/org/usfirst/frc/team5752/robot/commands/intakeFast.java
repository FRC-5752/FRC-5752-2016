package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.OI;
import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.subsystems.intakeSystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class intakeFast extends Command {

    public intakeFast() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intakeSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
	protected void execute() {
    	/*if (RobotMap.INTAKE_ON && OI.stick.getRawButton(3)) {
    		intakeSystem.move(.5);
    	} else if (RobotMap.INTAKE_ON){
    		intakeSystem.move(.3);
    	}*/
    	//if (!OI.stick.getRawButton(2));
    	//	intakeSystem.move(.3);
    	
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
