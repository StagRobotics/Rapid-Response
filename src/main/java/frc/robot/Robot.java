package frc.robot;

import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.Fangs;
import frc.robot.subsystems.SpidersWeb;
import frc.robot.subsystems.WebShooter;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

public class Robot extends TimedRobot {
    SendableChooser<String> autoChooser = new SendableChooser<>();
    
    public static DrivetrainSubsystem m_drivetrain;
    public static Fangs m_Fangs;
    public static WebShooter m_WebShooter;
    public static SpidersWeb m_SpidersWeb;
    
    public static OI m_oi;
    public static String AutoCommand = "";
    public static Command command;


    public static OI getOi() {
        return m_oi;
    }

    @Override
    public void robotInit() {
        m_oi = new OI();
        m_drivetrain = DrivetrainSubsystem.getInstance();
    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }
}