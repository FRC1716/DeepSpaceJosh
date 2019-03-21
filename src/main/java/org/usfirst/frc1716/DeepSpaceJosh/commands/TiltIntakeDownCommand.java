package org.usfirst.frc1716.DeepSpaceJosh.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1716.DeepSpaceJosh.Robot;

public class TiltIntakeDownCommand extends Command {

    public TiltIntakeDownCommand()
    {
        requires(Robot.armSubsystem);
    }

    @Override
    protected void initialize() {
        Robot.armSubsystem.setIntakeMotor(-1.0);
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
        Robot.armSubsystem.setIntakeMotor(0);
    }

    @Override
    protected void interrupted() {
        Robot.armSubsystem.setIntakeMotor(0);
    }
}