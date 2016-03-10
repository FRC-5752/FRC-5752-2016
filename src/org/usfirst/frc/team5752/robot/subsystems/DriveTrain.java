package org.usfirst.frc.team5752.robot.subsystems;

import org.usfirst.frc.team5752.robot.OI;
import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.commands.mecanumDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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

		double number1 = 1.25;
		double number2 = 1.176;

		if (Math.abs(ROTATION) < RobotMap.DEADBAND) {
			ROTATION = 0;
		} else if (ROTATION > 0) {
			ROTATION -= RobotMap.DEADBAND;
			ROTATION *= number1; // * 1.24 to be on the safe side
		} else if (ROTATION < 0) {
			ROTATION += RobotMap.DEADBAND;
			ROTATION *= number1; // * 1.24 to be on the safe side
		}

		if (Math.abs(X_DIRECTION) < RobotMap.XY_DEADBAND) {
			X_DIRECTION = 0;
		} else if (X_DIRECTION > 0) {
			X_DIRECTION -= RobotMap.XY_DEADBAND;
			X_DIRECTION *= number2; // * 1.175 to be on the safe side
		} else if (X_DIRECTION < 0) {
			X_DIRECTION += RobotMap.XY_DEADBAND;
			X_DIRECTION *= number2;// * 1.175 to be on the safe side
		}

		if (Math.abs(Y_DIRECTION) < RobotMap.XY_DEADBAND) {
			Y_DIRECTION = 0;
		} else if (Y_DIRECTION > 0) {
			Y_DIRECTION -= RobotMap.XY_DEADBAND;
			Y_DIRECTION *= number2;// * 1.175 to be on the safe side
		} else if (Y_DIRECTION < 0) {
			Y_DIRECTION += RobotMap.XY_DEADBAND;
			Y_DIRECTION *= number2; // * 1.175 to be on the safe side
		}

		// if (OI.stick.getRawAxis(3) < .5)
		SmartDashboard.putString("DB/String 2", "X:" + Double.toString(X_DIRECTION));
		SmartDashboard.putString("DB/String 3", "Y:" + Double.toString(Y_DIRECTION));
		SmartDashboard.putString("DB/String 4", "ROTATE:" + Double.toString(ROTATION));
		myDrive.mecanumDrive_Cartesian(X_DIRECTION, Y_DIRECTION, ROTATION, GYRO_ANGLE);

	}

	public static void straightDrive(double POWER) {
		frontLeft.set(POWER);
		backLeft.set(POWER);
		frontRight.set(-POWER);
		backRight.set(-POWER);

	}

	/*
	 * public static void polarDrive(double MAGNITUDE, double DIRECTION, double
	 * ROTATION) { myDrive.mecanumDrive_Polar(MAGNITUDE, DIRECTION, ROTATION); }
	 */
}
