package org.usfirst.frc1716.DeepSpaceJosh.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1716.DeepSpaceJosh.Robot;

public class BallOutCommand extends Command {
    public BallOutCommand() {

    }

    @Override
    protected void initialize() {
        Robot.intakeSubsystem.setMotors(1.0);
    }

    @Override
    protected void execute() {

    }

    @Override
    protected boolean isFinished() {
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