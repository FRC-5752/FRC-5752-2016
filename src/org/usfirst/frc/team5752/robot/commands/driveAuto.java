package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class driveAuto extends Command {
	
	private double xDirection, yDirection, Rotation, time, timeKeeper = 0;
	
    public driveAuto(double xDirection, double yDirection, double Rotation, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	this.xDirection = xDirection;
    	this.yDirection = yDirection;
    	this.Rotation = Rotation;
    	this.time = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
	protected void execute() {
		//X + Y must be > .15
		//ROTATION must be > .2
    	DriveTrain.drive(xDirection, yDirection, Rotation, 0);
		SmartDashboard.putString("DB/String 0", "Time: " + Double.toString(time));
		SmartDashboard.putString("DB/String 1", "Time keeper: " + Double.toString(timeKeeper));
		timeKeeper++;
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done();
    }

    // Called once after isFinished returns true
    protected void end() {
    	timeKeeper = 0;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    protected boolean done() {
    	if (timeKeeper > time) { 
    		return true;
    	} else {
    		return false;
    	}
    }
}
