package org.usfirst.frc1716.DeepSpaceJosh.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1716.DeepSpaceJosh.Robot;

public class PlaceHatchCommand extends Command {

    private int count = 0;

    public PlaceHatchCommand()
    {
        requires(Robot.intakeSubsystem);
    }

    @Override
    protected void initialize()
    {
        count = 0;

        if (Robot.intakeSubsystem.isHatchOut)
            Robot.intakeSubsystem.retractSolenoid();
        else
            Robot.intakeSubsystem.extendSolenoid();

        Robot.intakeSubsystem.isHatchOut = !Robot.intakeSubsystem.isHatchOut;
    }

    @Override
    protected void execute()
    {
        count++;
    }

    @Override
    protected boolean isFinished()
    {
        if (count >= 25)
            return true;
        return false;
    }

    @Override
    protected void end()
    {
        Robot.intakeSubsystem.offSolenoid();
    }

    @Override
    protected void interrupted()
    {
        Robot.intakeSubsystem.offSolenoid();
    }
}