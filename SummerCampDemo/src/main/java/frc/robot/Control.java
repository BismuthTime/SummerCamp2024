package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class Control {
    
    XboxController xboxController;
    DriveBase drivebase; 
    
    public Control()
    {
        xboxController = new XboxController(0);
        drivebase = new DriveBase();
    }
        
    public void teleop()
    {
        double axis0Value = xboxController.getRawAxis(0);
        drivebase.setSpeed(axis0Value);
    }

}
