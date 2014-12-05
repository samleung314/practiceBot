
package edu.wpi.first.wpilibj.templates.sensors;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.templates.Constants;

public class Encoders extends Constants{
    
    public static Encoder leftEnc = new Encoder(LEFT_ENCODERa,LEFT_ENCODERb);
    public static Encoder rightEnc = new Encoder(RIGHT_ENCODERa,RIGHT_ENCODERb);
    
    public static void StartEncoders()
    {
        leftEnc.start();
        rightEnc.start();
    }
    
    public static void StopEncoders()
    {
        leftEnc.stop();
        rightEnc.stop();
    }
    
    public static void ResetEncoders()
    {
        leftEnc.reset();
        rightEnc.reset();
    }
    
    public static double GetDistance()
    {
        double left = leftEnc.getDistance();
        double right = rightEnc.getDistance();
        
        double average = (left + right)/2;
        
        return average;
    }
}


