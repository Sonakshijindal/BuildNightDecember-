package org.usfirst.frc.team4500.robot.subsystems;

import org.usfirst.frc.team4500.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Motor2Subsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor motorThree;
	public Motor2Subsystem() {
		motorThree = new Victor( RobotMap.MotorOneID);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

