
package edu.wpi.first.wpilibj.templates.sensors;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class SmartDash {
    
    public static SmartDashboard dash = new SmartDashboard();
    
    public static void UpdateValues(){
        dash.putNumber("Gyro Angle: ", Gyroscope.GetAngle());
    }
    
    public static void EnableLiveWin()
    {
        LiveWindow.addActuator("Drive Train", "PIDController", Gyroscope.pid);
    }
    
}
