package org.usfirst.frc1716.DeepSpaceJosh.subsystems;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc1716.DeepSpaceJosh.RobotMap;
import org.usfirst.frc1716.DeepSpaceJosh.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;

public class IntakeSubsystem extends Subsystem {

    public boolean isHatchOut = false;

    private final SpeedController rollerLeftSC = RobotMap.intakeSubsystemrollerLeftSC;
    private final SpeedController rollerRightSC = RobotMap.intakeSubsystemrollerRightSC;
    private final DigitalInput limitSwitch = RobotMap.intakeSubsystemlimitSwitch;
    private final DoubleSolenoid hatchSolenoid = RobotMap.intakeSubsystemhatchSolenoid;

    @Override
    public void initDefaultCommand() {

    }

    @Override
    public void periodic() {

    }

    public void setMotors(double speed)
    {
        rollerLeftSC.set(speed);
        rollerRightSC.set(-speed);
    }

    public boolean getLimitSwitch()
    {
        return limitSwitch.get();
    }

    public void extendSolenoid()
    {
        hatchSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void retractSolenoid()
    {
        hatchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void offSolenoid()
    {
        hatchSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}