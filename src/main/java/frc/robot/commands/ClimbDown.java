package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimbDown extends Command {
    
    public ClimbDown(){
        requires(Robot.m_SpidersWeb);
    }
    @Override
    protected void initialize(){
        
    }

    @Override
    protected void execute(){
        Robot.m_SpidersWeb.ClimbDown();
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
