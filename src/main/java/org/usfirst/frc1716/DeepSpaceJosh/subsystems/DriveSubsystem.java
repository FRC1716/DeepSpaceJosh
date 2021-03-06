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

import java.awt.Robot;

import org.usfirst.frc1716.DeepSpaceJosh.RobotMap;
import org.usfirst.frc1716.DeepSpaceJosh.commands.*;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveSubsystem extends Subsystem {

    private final SpeedController lfSC = RobotMap.driveSubsystemlfSC;
    private final SpeedController lbSC = RobotMap.driveSubsystemlbSC;
    private final SpeedController rfSC = RobotMap.driveSubsystemrfSC;
    private final SpeedController rbSC = RobotMap.driveSubsystemrbSC;
    private final SpeedControllerGroup leftSCG = RobotMap.driveSubsystemleftSCG;
    private final SpeedControllerGroup rightSCG = RobotMap.driveSubsystemrightSCG;
    private final DifferentialDrive differentialDrive = RobotMap.driveSubsystemdifferentialDrive;

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void drive(double leftSpeed, double rightSpeed)
    {
        differentialDrive.tankDrive(leftSpeed, rightSpeed, true);
    }
}

