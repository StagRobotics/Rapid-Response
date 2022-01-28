package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;


public class WebShooter extends Subsystem {
    
    private PWMVictorSPX smbs = new PWMVictorSPX(RobotMap.backspinMotor);
    private Spark sms = new Spark(RobotMap.shooterMotor);
    private boolean Shoot = false;
    private boolean Spin = false;
    private double SMSpeed = 0.4;
    private double BSSpeed = 0.4;

    public WebShooter(){
        super();
        System.out.print("Shoot");
    }

    @Override
    public void initDefaultCommand(){
        //Set the default command for a subsystem here. 
        // setDefaultCommand(new MySpecialCommand());
    }

    public void toggleWheel(){
            System.out.println(Shoot);

            if (Shoot){
                BSOn();
                Shoot = false;
                System.out.println(Shoot);
            }else{
                Shoot = true;
                System.out.println(Shoot);
            }
    }

    public void BSOn(){
        smbs.set(BSSpeed);
    }

    public void BSOff(){
        smbs.set(0.0);
    }

    public void SMOn(){
        sms.set(SMSpeed);
    }

    public void SMOff(){
        sms.set(0.0);
    }


}