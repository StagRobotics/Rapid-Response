package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import frc.robot.RobotMap;

public class SpidersWeb extends Subsystem {
    
    private PWMVictorSPX leftClimb = new PWMVictorSPX(RobotMap.leftClimb);
    private PWMVictorSPX rightClimb = new PWMVictorSPX(RobotMap.rightClimb);
    private DigitalInput limiter = new DigitalInput(RobotMap.climbLimit);
    private DoubleSolenoid grabber = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.grabber1, RobotMap.grabber2);

    private double motorSpeed = 0.5;
    private boolean grab = false;

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
    public void ToggleGrab(){
        if(grab == false){
            grabber.set(DoubleSolenoid.Value.kForward);
            grab = true;
        }else if(grab = true){
            grabber.set(DoubleSolenoid.Value.kReverse);
            grab = false;
        }
    }
}
