package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Relay;

public class Fangs extends Subsystem {
    
  private boolean onIntake = false;
  private boolean extend = false;
  private DoubleSolenoid extender = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.extender1, RobotMap.extender2);
  private Spark intakeMotor = new Spark(RobotMap.intakeMotor);
    

  public Fangs(){
   
  }
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
  public void ToggleExtend(){
    if (extend == false){
      extender.set(DoubleSolenoid.Value.kForward);
      extend = true;
    }else if(extend = true){
      extender.set(DoubleSolenoid.Value.kReverse);
      extend = false;
    }
  }
    
  public void intakeForward() {
    intakeMotor.set(0.5);
  }
    
  public void intakeBackward() {
    intakeMotor.set(-0.5);
  }
        
  public void intakeOff(){
    intakeMotor.set(0.0);
  }
    
    
    

}

