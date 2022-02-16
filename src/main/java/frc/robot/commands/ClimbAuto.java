package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ClimbAuto extends CommandGroup {
    public ClimbAuto(){
        addSequential(new ClimbDown());
        addSequential(new ToggleHooks());
        addSequential(new ClimbUp());
        addSequential(new ToggleHooks());
        addSequential(new ClimbDown());
    }
}
