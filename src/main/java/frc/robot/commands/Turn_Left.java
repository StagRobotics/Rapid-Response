package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.DrivetrainSubsystem;

public class Turn_Left extends Command {
    
    public Turn_Left(double direction){

        requires(DrivetrainSubsystem.getInstance());
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
