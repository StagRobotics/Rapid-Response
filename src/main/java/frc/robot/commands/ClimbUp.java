package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimbUp extends Command {
    
    public ClimbUp(){
        requires(Robot.m_SpidersWeb);
    }
    @Override
    protected void initialize(){
        
    }

    @Override
    protected void execute(){
        
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
