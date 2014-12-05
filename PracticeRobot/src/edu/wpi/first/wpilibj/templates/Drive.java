
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

public class Drive extends Constants {

    public static Victor leftVic = new Victor(LEFT_VICTOR);
    public static Victor rightVic = new Victor(RIGHT_VICTOR);
    
    public static Joystick xBox = new Joystick(XBOX);
    public static Joystick leftJoy = new Joystick(LEFT_JOYSTICK);
    public static Joystick rightJoy = new Joystick(RIGHT_JOYSTICK);
    
    public static RobotDrive tank = new RobotDrive(leftVic, rightVic);
    
    public static void xBoxDrive()
    {
        tank.tankDrive(xBox.getRawAxis(2), xBox.getRawAxis(5));
    }
    
    public static void JoystickDrive()
    {
        tank.tankDrive(leftJoy.getY(), rightJoy.getY());
    }
}

/*
1: Left Stick X Axis
-Left:Negative ; Right: Positive
2: Left Stick Y Axis
-Up: Negative ; Down: Positive
3: Triggers
-Left: Positive ; Right: Negative
4: Right Stick X Axis
-Left: Negative ; Right: Positive
5: Right Stick Y Axis
-Up: Negative ; Down: Positive
*/

