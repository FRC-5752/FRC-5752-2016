package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;

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
    	requires(Robot.shooter);
    	//SmartDashboard.putString("DB/String 6", "AUTO COMMAND RUNNING");
    	// -.5Y makes it go forward
    	addSequential(new driveAuto(0,-.65, 0, 100));
    	// -.5X makes it go left
    	//addSequential(new driveAuto(-.8, 0, 0, 100));
    	
    	// 128in IN 100 itterations
    	
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
