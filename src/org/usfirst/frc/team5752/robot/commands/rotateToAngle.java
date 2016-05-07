package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class rotateToAngle extends Command {
	double angle = 0;
	boolean done = false;
	/**
	 * 
	 * @param angle angle to rotate to. ex: 90 will rotate robot 90 degrees clockwise
	 */
    public rotateToAngle(double angle) { // double angle
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	this.angle = angle;

    	done = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		SmartDashboard.putString("DB/String 5", Double.toString(Robot.ahrs.getAngle()));
		SmartDashboard.putString("DB/String 6", Double.toString(Robot.ahrs.getYaw()));
    	SmartDashboard.putString("DB/String 7", "testrotate22222");
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		
		if (Robot.ahrs.getYaw() < this.angle - .5) {
			DriveTrain.driveOverRide(0, 0, .2);
		} else if (Robot.ahrs.getYaw()  > this.angle +.5) {
			DriveTrain.driveOverRide(0, 0, -.2);
		}else {
			DriveTrain.stop();
			done = true;
		}
		
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
