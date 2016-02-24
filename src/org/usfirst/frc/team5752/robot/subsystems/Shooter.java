package org.usfirst.frc.team5752.robot.subsystems;

import org.usfirst.frc.team5752.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private static TalonSRX wheel = new TalonSRX(RobotMap.SHOOTER_MOTOR);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

		// setDefaultCommand(new spinUp());
	}

	public static void spin(double SPEED) {
		
		wheel.set(SPEED);
		
	}
	
	public static void stop() {
		wheel.set(0);
	}

}
