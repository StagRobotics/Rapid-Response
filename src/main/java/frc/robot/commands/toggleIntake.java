package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;



public class toggleIntake extends Command {
        public toggleIntake(){
            requires(Robot.m_Fangs);
        }
    
        @Override
        protected void initialize(){
            
        }
    
        @Override
        protected void execute(){
            Robot.m_Fangs.toggleIntake();
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

