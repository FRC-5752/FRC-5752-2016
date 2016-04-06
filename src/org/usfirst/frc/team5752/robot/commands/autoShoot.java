package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.subsystems.Shooter;
import org.usfirst.frc.team5752.robot.subsystems.intakeSystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class autoShoot extends Command {
	
	private double time = 0, timeKeeper = 300;

    public autoShoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	requires(Robot.intakeSystem);
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		SmartDashboard.putString("DB/String 0", "Time: " + Double.toString(time));
		SmartDashboard.putString("DB/String 1", "Time keeper: " + Double.toString(timeKeeper));
		
		Shooter.spin(1);
		
		if (time > 250) {
			intakeSystem.move(1);
		}
		
		time++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done();
    }

    // Called once after isFinished returns true
    protected void end() {
    	timeKeeper = 0;
    	Shooter.stop();
    	intakeSystem.stop();
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
