package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class WebShooter extends Subsystem {
    
    private PWMVictorSPX smbs = new PWMVictorSPX(RobotMap.backspinMotor);
    private PWMVictorSPX sms = new PWMVictorSPX(RobotMap.shooterMotor);
    private DoubleSolenoid kicker = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.kicker1, RobotMap.kicker2);

    private boolean Shoot = false;
    private boolean kick = false;
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
                SMOn();
                Shoot = false;
                System.out.println(Shoot);
            }else{
                SMOff();
                Shoot = true;
                System.out.println(Shoot);
            }
    }

    public void toggleSpin(){
        if(Spin){
            BSOn();
            Spin = false;
            System.out.print(Spin);
        }else{
            BSOff();
            Spin = true;
            System.out.print(Spin);
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
    public void ToggleKicker(){
        if(kick == false){
            kicker.set(DoubleSolenoid.Value.kForward);
            kick = true;
            System.out.print(kick);
        }else if (kick == true){
            kicker.set(DoubleSolenoid.Value.kReverse);
            kick = false;
            System.out.print(kick);
        }
    }

}