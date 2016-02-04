package org.usfirst.frc.team5752.robot.subsystems;

import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.commands.mecanumDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private static Talon frontLeft = new Talon(RobotMap.MOTOR_FRONT_LEFT);
	private static Talon frontRight = new Talon(RobotMap.MOTOR_FRONT_RIGHT);
	private static Talon backLeft = new Talon(RobotMap.MOTOR_BACK_LEFT);
	private static Talon backRight = new Talon(RobotMap.MOTOR_BACK_RIGHT);
	private static RobotDrive myDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new mecanumDrive());
	}

	public static void drive(double X_DIRECTION, double Y_DIRECTION, double ROTATION, double GYRO_ANGLE) {
		
		myDrive.mecanumDrive_Cartesian(X_DIRECTION, Y_DIRECTION, ROTATION, GYRO_ANGLE);
	}
}
