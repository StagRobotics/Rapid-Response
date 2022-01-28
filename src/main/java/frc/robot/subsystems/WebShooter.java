package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import frc.robot.OI;


public class WebShooter extends Subsystem {
    
    private boolean SHOOT;

    public WebShooter(){
        
    }

    @Override
    public void initDefaultCommand(){
        //Set the default command for a subsystem here. 
        // setDefaultCommand(new MySpecialCommand());
            
        
    }

    public void toggleWheel(){
            System.out.println(SHOOT);

            if (SHOOT){
                
                SHOOT = false;
                System.out.println(SHOOT);
            }else{
                SHOOT = true;
                System.out.println(SHOOT);
            }
    }


    

    public void SetSpeed(double x){

    }
}