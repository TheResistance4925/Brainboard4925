package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.ArmSubsystem;

public class propellor extends Command {

        private final ArmSubsystem m_armSubsystem;
        private final double propellorSpeed;
 

    public propellor(ArmSubsystem m_armSubsystem, double propellorSpeed) {
        this.m_armSubsystem = m_armSubsystem;
        this.propellorSpeed = propellorSpeed;
        addRequirements(m_armSubsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_armSubsystem.setmotor(propellorSpeed);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_armSubsystem.setmotor(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
