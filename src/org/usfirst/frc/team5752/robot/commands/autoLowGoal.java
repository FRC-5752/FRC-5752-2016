package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5752.robot.subsystems.intakeSystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class autoLowGoal extends Command {
	int time = 70, timeKeeper = 0;
    public autoLowGoal() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	//requires(Robot.intakeSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		SmartDashboard.putString("DB/String 0", "Time: " + Double.toString(time));
		SmartDashboard.putString("DB/String 1", "Time keeper: " + Double.toString(timeKeeper));
		
		DriveTrain.driveOverRide(.6, -1, 0); //X = speed Y = speed * sqrt(3)
		
		/*if (timeKeeper < 30) {
			intakeSystem.move(-1);

		}*/
		
    	timeKeeper++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timeKeeper > time;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
