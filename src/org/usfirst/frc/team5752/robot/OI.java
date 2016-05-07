package org.usfirst.frc.team5752.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5752.robot.commands.aiShoot;
import org.usfirst.frc.team5752.robot.commands.intakeFast;
import org.usfirst.frc.team5752.robot.commands.intakeSlowToggle;
import org.usfirst.frc.team5752.robot.commands.intakeSpit;
import org.usfirst.frc.team5752.robot.commands.mecanumDrive;
import org.usfirst.frc.team5752.robot.commands.shoot;
import org.usfirst.frc.team5752.robot.commands.shootReverse;
import org.usfirst.frc.team5752.robot.commands.slowShoot;
import org.usfirst.frc.team5752.robot.commands.slowToggle;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	//public static XBoxController Xbox = new XBoxController(RobotMap.XBOX_PORT_DRIVER);
	
	public static Joystick stick = new Joystick(0);
	
	Button button1 = new JoystickButton(stick, 1),
			button2 = new JoystickButton(stick, 2),
			button3 = new JoystickButton(stick, 3),
			button4 = new JoystickButton(stick, 4),
			button5 = new JoystickButton(stick, 5),
			button6 = new JoystickButton(stick, 6),
			button7 = new JoystickButton(stick, 7),
			button8 = new JoystickButton(stick, 8),
			button9 = new JoystickButton(stick, 8),
			button10 = new JoystickButton(stick, 10),
			button11 = new JoystickButton(stick, 11),
			button12 = new JoystickButton(stick, 12);
	
	//JOYSTICK 4 = limitswitch bottom
	
	public OI() {
		
		//BUTTON 3 = REVERSE
		
		button1.whileHeld(new intakeFast());
		
		//button1.whileHeld(new shoot());
		
		button2.toggleWhenActive(new intakeSlowToggle());
		
		button3.whileHeld(new intakeSpit());
		
		button4.whileHeld(new shoot());
		
		//button5.whileHeld(new slowShoot());
		
		button6.whileHeld(new shootReverse());
		
		
		
		//button3.whenPressed(new intakeSlowToggle());
		
		
		
		//example
		//Xbox.getButtonX().whenReleased(new ExampleCommand());
		
		//Xbox.getButtonLeft().whenPressed(new intakeStart());
		
		//Xbox.getButtonRight().toggleWhenPressed(new intakeStart());
	}
}

