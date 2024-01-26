package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.BeamBreak;
public class BeamCommand extends Command {
    private final ArmSubsystem m_armSubsystem;
    private final BeamBreak m_beamBreak;
    //private boolean isBeamBroken;

    public BeamCommand(ArmSubsystem m_armSubsystem, BeamBreak m_beamBreak, double propellorSpeed, boolean isBeamBroken) {
        this.m_armSubsystem = m_armSubsystem;
        this.m_beamBreak = m_beamBreak;
        this.isBeamBroken = isBeamBroken;
        addRequirements(m_armSubsystem);
        addRequirements(m_beamBreak);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
       if (m_beamBreak.isBeamBroken()) {
        m_armSubsystem.setmotor(0.3);
        
       } else {
        m_armSubsystem.setmotor(0);
       }
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
