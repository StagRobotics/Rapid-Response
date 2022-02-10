package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShootBall extends Command {
    public ShootBall(){
        requires(Robot.m_WebShooter);
    }
    @Override
    protected void initialize(){
        
    }

    @Override
    protected void execute(){
        Robot.m_WebShooter.toggleSpin();
        Robot.m_WebShooter.toggleWheel();
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
