package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Get_Sonar extends Command {
    public Get_Sonar(){
        requires(Robot.m_Echo);
    }
    @Override
    protected void initialize(){
        
    }

    @Override
    protected void execute(){
        Robot.m_Echo.getDistance();
        Robot.m_Echo.updateDashboard();
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
