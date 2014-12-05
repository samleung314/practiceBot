
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics extends Constants {
    
    public static Compressor compress = new Compressor(COMPRESSOR_RELAY,COMPRESSOR_SWITCH);
    
    public static void EnableCompress()
    {
        compress.enabled();
    }
    
    public static void StartCompress()
    {
        if (compress.getPressureSwitchValue() == false) //For safety, compressor will start if less than 120 psi
        {
                compress.start(); //starts compressor
        }
        else 
        {
                compress.stop(); //stops compressor when pressure gets to 120 psi
        }
    }
    
    public static void StopCompress()
    {
        compress.stop();
    }
    
}
