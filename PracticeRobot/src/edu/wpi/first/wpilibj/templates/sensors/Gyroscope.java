
package edu.wpi.first.wpilibj.templates.sensors;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.templates.Constants;
import edu.wpi.first.wpilibj.templates.*;

public class Gyroscope extends Constants {
    
    public static final AnalogChannel gyroAnalog  = new AnalogChannel(GYROSCOPE);
    public static Gyro gyro = new Gyro(gyroAnalog);
    
    public static double p = 0.01;
    public static double i = 0;
    public static double d = 0.01; 
    public static PIDController pid = new PIDController(p, i, d, gyro, Drive.leftVic);

    public static double GetAngle(){
        double angle = gyro.getAngle();
        
        if ((angle > 360) || (angle < -360)) //Prevents GetAngle from exceeding 360 and -360
        {
            gyro.reset();
        }
        
        return angle;
    }
    
    public static void SetPoint(){
        pid.setSetpoint(0);
    }
    
}
