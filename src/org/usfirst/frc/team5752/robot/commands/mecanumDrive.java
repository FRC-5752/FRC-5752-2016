package org.usfirst.frc.team5752.robot.commands;

import org.usfirst.frc.team5752.robot.OI;
import org.usfirst.frc.team5752.robot.Robot;
import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class mecanumDrive extends Command {
	
	static double ACCEL_COEFFICIENT = .05;

	public mecanumDrive() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		// SmartDashboard.putNumber("XBox Left X Axis", OI.Xbox.getLeftXAxis());
		// SmartDashboard.putNumber("XBox Left Y Axis", OI.Xbox.getLeftYAxis());
		// SmartDashboard.putNumber("XBox Right X Axis",
		// OI.Xbox.getRightXAxis());

		// DriveTrain.drive(OI.Xbox.getLeftXAxis(), OI.Xbox.getLeftYAxis(),
		// OI.Xbox.getRightXAxis(), 0);
		
		/*if (Math.abs(lastLeftPower - power) > ACCEL_COEFFICIENT) {
			if (Math.signum(power - lastLeftPower) == 1) {
				power = lastLeftPower + ACCEL_COEFFICIENT;
			} else if (Math.signum(power - lastLeftPower) == -1) { // it could
																	// also be 0
				power = lastLeftPower - ACCEL_COEFFICIENT;
			}

		}*/

		double X_DIRECTION = OI.stick.getRawAxis(0);
		double Y_DIRECTION = OI.stick.getRawAxis(1);
		double ROTATION = OI.stick.getRawAxis(2);
		
		
		if (OI.stick.getRawButton(7) || OI.stick.getRawButton(8) || OI.stick.getRawButton(9) || OI.stick.getRawButton(10) || 
				OI.stick.getRawButton(11) || OI.stick.getRawButton(12)) {
			DriveTrain.fieldDrive(X_DIRECTION, Y_DIRECTION, ROTATION);
		} else {
			DriveTrain.drive(X_DIRECTION, Y_DIRECTION, ROTATION);
		}
		
		// ZERO ROTATION
		// DriveTrain.drive(OI.Xbox.getLeftXAxis(), OI.Xbox.getLeftYAxis(), 0,
		// 0);

		// **TESTING**

		// DriveTrain.straightDrive(.1);
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
