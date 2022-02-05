package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import frc.robot.RobotMap;

public class SpidersWeb extends Subsystem {
    
    private PWMVictorSPX leftClimb = new PWMVictorSPX(RobotMap.leftClimb);
    private PWMVictorSPX rightClimb = new PWMVictorSPX(RobotMap.rightClimb);
    private DigitalInput limiter = new DigitalInput(RobotMap.climbLimit);

    private double motorSpeed = 0.5;

    public SpidersWeb(){

    }

    @Override
    public void initDefaultCommand(){

    }

    public void ClimibUp(){
        leftClimb.set(motorSpeed);
        rightClimb.set(motorSpeed);
    }
    public void ClimbDown(){
        if (limiter.get() == true){
            leftClimb.set(-motorSpeed);
            rightClimb.set(-motorSpeed);
        }
    }
}
