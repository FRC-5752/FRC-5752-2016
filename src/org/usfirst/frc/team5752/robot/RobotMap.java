package org.usfirst.frc.team5752.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static final int MOTOR_FRONT_LEFT = 0;
	public static final int MOTOR_FRONT_RIGHT = 1;
	public static final int MOTOR_BACK_LEFT = 2;
	public static final int MOTOR_BACK_RIGHT = 3;
	
	public static final int INTAKE_MOTOR = 4;
	
	public static final int SHOOTER_MOTOR = 5;
	
	public static boolean INTAKE_ON = false;
	
	public static boolean SPIN_SLOW = false;
	
	// -1.0 to 1.0
	
	public static double DRIVE_SPEED = 1;
	
	public static final double DEADBAND = .2;
	
	public static final double XY_DEADBAND = .2;
	
	public static final int XBOX_PORT_DRIVER = 0;
}
