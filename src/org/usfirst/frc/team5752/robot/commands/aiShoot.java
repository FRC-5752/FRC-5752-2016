package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5752.robot.subsystems.Shooter;
import org.usfirst.frc.team5752.robot.subsystems.intakeSystem;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class aiShoot extends Command {
	
	private boolean move, move1, move2;
	
	private double wantedX;
	private double wantedY;
	private double wantedWidth;
	
	private double time = 200, timeKeeper = 0;
	
    public aiShoot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	
    	requires(Robot.intakeSystem);
    	requires(Robot.shooter);
    	//TODO MAKE MOVE TRUE ONE I FIND THE VALUES
    	move = false;
    	move1 = false;
    	move2 = false;
    	
    	timeKeeper = 0;
    	

    	/*
    	public NetworkTable table = NetworkTable.getTable("Grip/TowerTarget");
    	Width = table.getNumberArray("width", 0.0);
    	SmartDashboard.putNumber("width :", width[0]);
    	*/
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    @SuppressWarnings("deprecation")
	protected void execute() {
    	
    	/*double centerX = table.getDouble("centerX"),
    			centerY = table.getDouble("centerY"),
    		 	width = table.getDouble("width"),
    			area = table.getDouble("area"),
    			height = table.getDouble("height");*/
    	//double centerX = table.getDouble("cetnerX");
    	
    	//SmartDashboard.putString("DB/String 2", "centerX:" + Double.toString(centerX));
		//SmartDashboard.putString("DB/String 3", "centerY:" + Double.toString(centerY));
		//SmartDashboard.putString("DB/String 4", "width:" + Double.toString(width));
		//SmartDashboard.putString("DB/String 5", "height: " + Double.toString(height));
		//SmartDashboard.putString("DB/String 6", "area: " + Double.toString(area));
    	
    	
    	/* (rotate) {
    		//rotate to 0 on Gyro
    		DriveTrain.driveOverRide(0, 0, 0);
    	}*/
    	
		// -.5Y makes it go forward (towards intake)
		// addSequential(new driveAuto(X, Y, ROTATION, TIME));
    	
    	// -.5X makes it go left (facing backwards with shooter)
    	/*
		double x = 0,
				y = 0,
				rotate = 0;
		
    	if(centerX < wantedX - 5 && move) {
    		DriveTrain.driveOverRide(.4, 0, 0);
    		//x = .4;
    	} else if (centerX > wantedX + 5) {
    		DriveTrain.driveOverRide(-.4, 0, 0);
    		//x = -.4;
    	} else {
    		DriveTrain.stop();
    		//x = 0;
    		move1 = false;
    	}
    	
    	if(centerY < wantedY - 5 && move) {
    		DriveTrain.driveOverRide(0, .3, 0);
    		//y = .3;
    	} else if(centerY > wantedY + 5) {
    		DriveTrain.driveOverRide(0, -.3, 0);
    		//y = -.3;
    	} else {
    		DriveTrain.stop();
    		//y = 0;
    		move2 = false;
    	}*/
    	
    	//DriveTrain.driveOverRide(x, y, rotate);
    	
    	//shoot the ball
    	/*if (!move1 && !move2) {
    		move = false;
    		//shoot
    		SmartDashboard.putString("DB/String 0", "Time: " + Double.toString(time));
    		SmartDashboard.putString("DB/String 1", "Time keeper: " + Double.toString(timeKeeper));
    		
    		Shooter.spin(1);
    		
    		if (timeKeeper > 150) {
    			intakeSystem.move(1);
    		}
    		
    		timeKeeper++;
    	}*/
    	
    	//ROTATE ROBOT TO GYRO ANGLE 0 or 180
    	
    	//STRAFE LEFT OR RIGHT UNTIL PICTURE IS CENTERED
    	
    	//MOVE FORWARDS AND BACKWARDS UNTIL PICTURE IS IN
    	//CORRECT PLACE UP AND DOWN
    	
    	//SPIN UP SHOOTER
    	
    	//SHOOT W/ INTAKE
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done();
    }

    // Called once after isFinished returns true
    protected void end() {
    	DriveTrain.stop();
    	intakeSystem.stop();
    	Shooter.stop();
    	
    	timeKeeper = 0;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	DriveTrain.stop();
    	intakeSystem.stop();
    	Shooter.stop();
    	
    	timeKeeper = 0;
    }
    
    protected boolean done() {
    	if (timeKeeper > time) { 
    		return true;
    	} else {
    		return false;
    	}
    }
}
