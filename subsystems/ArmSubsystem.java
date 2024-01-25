package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class ArmSubsystem extends SubsystemBase {
  
private CANSparkMax m_leadMotor;
private CANSparkMax m_followMotor;

public ArmSubsystem() {
        
    m_leadMotor = new CANSparkMax(2,com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
 
    m_leadMotor.setInverted(false);

    m_followMotor = new CANSparkMax(3, com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
 
    m_followMotor.setInverted(false);

    m_followMotor.follow(m_leadMotor);
 
   }


    public void setmotor(double propellorSpeed) {
        m_leadMotor.set(propellorSpeed);
    }
    @Override
    public void periodic() {
     
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}
