package frc.robot;

import frc.robot.commands.ClimbDown;
import frc.robot.commands.ClimbUp;
import frc.robot.commands.ShootBall;
import frc.robot.commands.Square_Auto;
import frc.robot.commands.toggleIntake;
import frc.robot.subsystems.DrivetrainSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class OI {
    /*
       Add your joysticks and buttons here
     */
    private Joystick primaryJoystick = new Joystick(0);

    public OI() {
        // Back button zeroes the drivetrain
        new JoystickButton(primaryJoystick, 7).whenPressed(
                new InstantCommand(() -> DrivetrainSubsystem.getInstance().resetGyroscope())
        );
        new JoystickButton(primaryJoystick, 1).whenPressed(
                new Square_Auto()
        );
        new JoystickButton(primaryJoystick, 3).whenPressed(
                new toggleIntake()
        );
        new JoystickButton(primaryJoystick,6).whenPressed(new ClimbUp());
        new JoystickButton(primaryJoystick, 5).whenPressed(new ClimbDown());
        new JoystickButton(primaryJoystick, 2).whenPressed(new ShootBall());
    }

    public Joystick getPrimaryJoystick() {
        return primaryJoystick;
    }
}