package org.usfirst.frc.team5752.robot.subsystems;

import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.commands.intakeStart;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class intakeSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static Talon intakeTalon = new Talon(RobotMap.INTAKE_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new intakeStart());
    }
    
    public static void drive(double SPEED) {
    	intakeTalon.set(SPEED);
    	
    }
    
    public static void stop() {
    	intakeTalon.stopMotor();
    }
}

