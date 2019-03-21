package org.usfirst.frc1716.DeepSpaceJosh.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1716.DeepSpaceJosh.Robot;

public class BrakeArmCommand extends Command {

    private int count = 0;

    public BrakeArmCommand()
    {
        requires(Robot.armSubsystem);
    }

    @Override
    protected void initialize()
    {
        count = 0;
        Robot.armSubsystem.solenoidReverse();
    }

    @Override
    protected void execute()
    {
        if (count == 5)
            Robot.armSubsystem.solenoidOff();
        count++;
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }

    @Override
    protected void end()
    {
        Robot.armSubsystem.solenoidOff();
    }

    @Override
    protected void interrupted()
    {
        Robot.armSubsystem.solenoidOff();
    }
}