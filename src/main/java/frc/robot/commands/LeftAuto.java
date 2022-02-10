package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftAuto extends CommandGroup {
    
    public LeftAuto(){
        addSequential(new Drive_Vertical(1.0, "forward"));
        addSequential(new wait(0.8));
        addSequential(new Turn_Right(180.0));
        addSequential(new wait(1.0));
        addSequential(new Drive_Vertical(1.0, "backward"));
        addSequential(new wait(1.0));
        addSequential(new Drive_Horizontal(1.0, "left"));
        addSequential(new wait(1.0));
    }

}
