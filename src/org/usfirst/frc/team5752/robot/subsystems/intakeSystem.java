package org.usfirst.frc.team5752.robot.subsystems;

import org.usfirst.frc.team5752.robot.RobotMap;
import org.usfirst.frc.team5752.robot.commands.intakeFast;
import org.usfirst.frc.team5752.robot.commands.intakeSlowToggle;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class intakeSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static TalonSRX intakeTalon = new TalonSRX(RobotMap.INTAKE_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new intakeStart());
    	//setDefaultCommand(new intakeSlowToggle());
    }
    
    public static void move(double SPEED) {
    	intakeTalon.set(-1 * SPEED);
    }
    
    
    
    public static void stop() {
    	intakeTalon.set(0);
    }
}

