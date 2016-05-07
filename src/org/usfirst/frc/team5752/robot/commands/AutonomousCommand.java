package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

	public AutonomousCommand() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);
		requires(Robot.intakeSystem);

		// -.5Y makes it go forward (towards intake) Negative towards intake
		// .5Y make it go backwards (towards shooter) Positive towards shooter
		// addSequential(new driveAuto(X, Y, ROTATION, TIME));

		
		
		// FORWARDS

		
		//addSequential(new driveAuto(0,-.65, 0, 120)); // Move forwards towards intake, **used at Lewiston Competition**
		

		
		
		addSequential(new driveAuto(0, -.9, 0, 140)); // go forwards fast
		
		addSequential(new driveAuto(0, -.5, 0, 80)); // go forwards slow
		
		addSequential(new driveAuto(.6, .6, 0, 15)); // backup a little bit && go right a little while backing up
		
		addSequential(new rotateToAngle(90)); // rotate to 60 for tower
		
		addSequential(new driveAuto(1, 0, 0, 100)); // move towards tower

		addSequential(new autoLowGoal()); // go forwards and shoot
		
		
		

		// ROBOT FACING BACKWARDS (SHOOTER TOWARDS LOW BAR) GOING LEFT RELATIVE
		// TO LOWBAR
		
		// addSequential(new driveAuto(0, 0, 0, 40));
		// addSequential(new driveAuto(.65, 0, .3, 85));
		
		
		
		
		
		//addSequential(new driveAuto(0, .65, 0, 220)); // moving towards intake until hits wall
		
		//addSequential(new driveAuto(0, -.65, 0, 10)); // back up a little bit
		
		//addSequential(new rotateToAngle(90)); // rotate 60 degrees clockwise
		
		//addSequential(new driveAuto(0, .65, 0, 7)); // go back forwards to wall
		
		//addSequential(new driveAuto(.65, 0, 0, 100)); // drive to the right (relative to driverStation) to tower low goal
		
		//addSequential(new autoLowGoal());
		

	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
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
