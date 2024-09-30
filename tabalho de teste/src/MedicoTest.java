import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MedicoTest{

    private Medico medico;

    @BeforeEach
    public void setUp() {
        medico = new Medico("Dr. Silva", "Cardiologia", 12345);
    }

    @Test
    public void testGetNome() {
        assertEquals("Dr. Silva", medico.getNome());
    }

    @Test
    public void testGetEspecialidade() {
        assertEquals("Cardiologia", medico.getEspecialidade());
    }

    @Test
    public void testGetCrm() {
        assertEquals(12345, medico.getCrm());
    }

    @Test
    public void testAtenderPacienteComPacienteValido() {
        Paciente paciente = new Paciente("Maria", 25, "98765432100", "123456789");
        assertTrue(medico.atenderPaciente(paciente));
    }

    @Test
    public void testAtenderPacienteComPacienteNulo() {
        assertFalse(medico.atenderPaciente(null));}
}