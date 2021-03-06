// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1716.DeepSpaceJosh.subsystems;

import org.usfirst.frc1716.DeepSpaceJosh.RobotMap;
import org.usfirst.frc1716.DeepSpaceJosh.commands.*;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class ArmSubsystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	/*
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController armSC = RobotMap.armSubsystemarmSC;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
     */

    private final WPI_VictorSPX intakeSC = RobotMap.armSubsystemintakeSC;
    private final WPI_VictorSPX armSC = RobotMap.armSubsystemarmSC;
    private final DigitalInput limitSwitchBottom = RobotMap.armSubsystemlimitSwitchBottom;
    private final DigitalInput limitSwitchTop = RobotMap.armSubsystemlimitSwitchTop;
    private final DoubleSolenoid brakeSolenoid = RobotMap.armSubsystembrakeSolenoid;
	
    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new BrakeArmCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void setArmMotor(double speed)
    {
    	armSC.set(speed);
    }

    public void setIntakeMotor(double speed)
    {
        intakeSC.set(speed);
    }

    public boolean getSwitchBottom()
    {
        return limitSwitchBottom.get();
    }

    public boolean getSwitchTop()
    {
        return limitSwitchTop.get();
    }

    public void solenoidForward()
    {
        brakeSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void solenoidReverse()
    {
        brakeSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void solenoidOff()
    {
        brakeSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}

