package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class shooter extends Command{

    private final ShooterSubsystem m_shooterSubsystem;
        private final double shooterSpeed;
 
    public shooter(ShooterSubsystem m_shooterSubsystem, double shooterSpeed) {
        this.m_shooterSubsystem = m_shooterSubsystem;
        this.shooterSpeed = shooterSpeed;
        addRequirements(m_shooterSubsystem);
    }

    @Override
    public void execute() {
        m_shooterSubsystem.setmotor(shooterSpeed);
    }
        @Override
        public void end(boolean interrupted) {
            m_shooterSubsystem.setmotor(0);
    }
}
