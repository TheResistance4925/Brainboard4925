package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class ShooterSubsystem extends SubsystemBase{

    private CANSparkMax m_leftShooterMotor;
    private CANSparkMax m_rightShooterMotor;
    public ShooterSubsystem() {
        
        m_leftShooterMotor = new CANSparkMax(4,com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
         
        m_leftShooterMotor.setInverted(true);
        
        m_rightShooterMotor = new CANSparkMax(5, com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
         
        m_rightShooterMotor.setInverted(false);
           }

        public void setmotor(double shooterSpeed) {
            m_leftShooterMotor.set(shooterSpeed);
            m_rightShooterMotor.set(shooterSpeed);
        }
}
