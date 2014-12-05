
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.templates.sensors.*;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class RobotTemplate extends IterativeRobot {
  
    public void robotInit() 
    {
   
    }


    public void autonomousPeriodic() 
    {

    }
    
    public void telopInit()
    {
        Gyroscope.gyro.reset();
    }

    public void teleopPeriodic() 
    {
        Gyroscope.pid.enable();
        SmartDash.UpdateValues();
        LiveWindow.run();
        
    }
    
    public void disabledPeriodic()
    {
        Gyroscope.gyro.reset();
    }
 
    public void testPeriodic() 
    {
    
    }
    
}
