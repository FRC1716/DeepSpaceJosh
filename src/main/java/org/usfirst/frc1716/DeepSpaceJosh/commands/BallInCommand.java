package org.usfirst.frc1716.DeepSpaceJosh.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1716.DeepSpaceJosh.Robot;

public class BallInCommand extends Command {
    public BallInCommand() {
        requires(Robot.intakeSubsystem);
    }

    @Override
    protected void initialize() {
        if (!Robot.intakeSubsystem.getLimitSwitch())
            Robot.intakeSubsystem.setMotors(-0.6);
    }

    @Override
    protected void execute() {

    }

    @Override
    protected boolean isFinished() {
        if (Robot.intakeSubsystem.getLimitSwitch())
            return true;
        return false;
    }

    @Override
    protected void end() {
        Robot.intakeSubsystem.setMotors(0);
    }

    @Override
    protected void interrupted() {
        Robot.intakeSubsystem.setMotors(0);
    }
}