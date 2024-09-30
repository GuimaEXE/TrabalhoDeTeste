import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PacienteTest{

    private Paciente paciente;

    @BeforeEach
    public void setUp() {
        paciente = new Paciente("João", 30, "12345678900", "987654321");
    }

    @Test
    public void testGetNome() {
        assertEquals("João", paciente.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(30, paciente.getIdade());
    }

    @Test
    public void testGetCpf() {
        assertEquals("12345678900", paciente.getCpf());
    }

    @Test
    public void testGetTelefone() {
        assertEquals("987654321", paciente.getTelefone());
    }

    @Test
    public void testAdicionarHistorico() {
        paciente.adicionarHistorico("Consulta em 01/01/2024");
        assertTrue(paciente.getHistoricoMedico().contains("Consulta em 01/01/2024"));
    }
}