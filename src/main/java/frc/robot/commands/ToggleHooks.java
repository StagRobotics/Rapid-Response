package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ToggleHooks extends Command {
    public ToggleHooks(){
        requires(Robot.m_SpidersWeb);
    }

    @Override
    protected void initialize(){
        
    }

    @Override
    protected void execute(){
        Robot.m_SpidersWeb.ToggleGrab();
    }

    @Override
    protected boolean isFinished(){
        return true;
    }

    @Override
    protected void end(){
    }

    @Override
    protected void interrupted(){
     
    }
}
