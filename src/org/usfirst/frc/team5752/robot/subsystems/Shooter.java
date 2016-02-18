package org.usfirst.frc.team5752.robot.subsystems;

import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.commands.spinUp;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private static Talon wheel = new Talon(RobotMap.SHOOTER_MOTOR);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

		// setDefaultCommand(new spinUp());
	}

	public static void spinTop(double SPEED) {
		wheel.set(SPEED);

	}

}
