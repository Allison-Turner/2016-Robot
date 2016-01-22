package org.usfirst.frc.team88.robot.subsystems;

import org.usfirst.frc.team88.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    private final CANTalon outerRollerTalon, innerRollerTalon;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Intake(){
    	outerRollerTalon = new CANTalon(RobotMap.frontRollerMotorController);
    	innerRollerTalon = new CANTalon(RobotMap.innerRollerMotorController);
    }
    
    public void RollOuterRoller(double direction){
    	
    }
    
    public void RollInnerRoller(double direction){
    	
    }
    
    public void RollBothRollers(double direction){
    	
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

