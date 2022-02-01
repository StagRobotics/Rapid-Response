package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Relay;
public class Fangs extends Subsystem {
    
    private boolean onIntake = false;

    public Fangs(){
   
    }
        private Relay intakeMotor = new Relay(RobotMap.intakeMotor);
   
        public void toggleIntake(){
            if (onIntake == false){
              intakeForward();
              onIntake = true;
            }else{
              intakeOff();
              onIntake = false;
            }
          }
        @Override
        public void initDefaultCommand(){
          
        }
        
    
        public void intakeForward() {
            intakeMotor.set(Relay.Value.kForward);
        }
    
        public void intakeBackward() {
            intakeMotor.set(Relay.Value.kReverse);
        }
        
        public void intakeOff(){
            intakeMotor.set(Relay.Value.kOff);
        }
    
    
    

}

