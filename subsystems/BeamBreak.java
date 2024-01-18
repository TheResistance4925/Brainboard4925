// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import frc.robot.commands.propellor;

public class BeamBreak extends SubsystemBase {

 public final ArmSubsystem b_armSubsystem = new ArmSubsystem();
  /** Creates a new BeamBreak. */
  AnalogInput beam = new AnalogInput(0);
  double beamVolts;
  
  public BeamBreak() {
    
  }

  //@Override
  public void periodic() {
    // This method will be called once per scheduler run
    beamVolts = beam.getAverageVoltage();
    SmartDashboard.putNumber("BeamAverageVoltage", beamVolts);

    //if(beamVolts >2.0){
      
     // new propellor( b_armSubsystem, 0.3 );
    //}



  }
}
