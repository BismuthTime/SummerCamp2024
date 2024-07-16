package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class DriveBase 
{
   
    private double speed = 100;
   
    public DriveBase()
   {

   }
  
   public void setSpeed(double speed)
   {
    this.speed = speed;
   }

   public double getSpeed()
   {
    return this.speed;
   }

   public void log()
   {
        SmartDashboard.putNumber( "speed", speed);
   }

}
