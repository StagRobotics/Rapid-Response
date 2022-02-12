package frc.robot;

public class RobotMap {
    //Front Left Wheel
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 4; // CAN Angle
    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 1; // Analog
    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 3; // CAN Drive

    //Front Right Wheel
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 8; // CAN Angle
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 3; // Analog
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 7; // CAN Drive

    //Back Left Wheel
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 2; // CAN Angle
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 0; // Analog
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 1; // CAN Drive

    //Back Right Wheel
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 6; // CAN Angle
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 2; // Analog
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 5; // CAN Drive

    //Motors
    public static int shooterMotor = 0;
    public static int backspinMotor = 1;
    public static int intakeMotor = 2;
    public static int leftClimb = 3;
    public static int rightClimb = 4;

    //Digital Input
    public static int climbLimit  = 4;

    //Pnuematics
    public static int extender1 = 0;
    public static int extender2 = 1;
    public static int kicker1 = 2;
    public static int kicker2 = 3;
    public static int grabber1 = 4;
    public static int grabber2 = 5;
}