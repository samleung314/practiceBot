
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.templates.sensors.*;
import edu.wpi.first.wpilibj.IterativeRobot;


public class RobotTemplate extends IterativeRobot {
  
    public void robotInit() 
    {
        Gyroscope.pid.startLiveWindowMode();
    }


    public void autonomousPeriodic() 
    {

    }

    public void teleopPeriodic() 
    {
        Gyroscope.pid.enable();
        System.out.println(Gyroscope.GetAngle());
    }
 
    public void testPeriodic() 
    {
    
    }
    
}
