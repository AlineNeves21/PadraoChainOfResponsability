import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentoTest {
    FuncionarioFinanceiro financeiro;
    FuncionarioSupervisor supervisor;
    FuncionarioSecretaria secretaria;

    @BeforeEach
    void setUp() {
        financeiro = new FuncionarioFinanceiro(null);
        supervisor = new FuncionarioSupervisor(financeiro);
        secretaria = new FuncionarioSecretaria(supervisor);
    }

    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico() {
        assertEquals("Secretaria", secretaria.assinarDocumento(new Documento(TipoDocumentoHistorico.getTipoDocumentoHistorico())));
    }

    @Test
    void deveRetornarSupervisorParaAssinaturaCadastro() {
        assertEquals("Supervisor", secretaria.assinarDocumento(new Documento(TipoDocumentoCadastro.getTipoDocumentoCadastro())));
    }

    @Test
    void deveRetornarFinanceiroParaAssinaturaCertificado() {
        assertEquals("Financeiro", secretaria.assinarDocumento(new Documento(TipoDocumentoLiberacao.getTipoDocumentoLiberacao())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem assinatura", secretaria.assinarDocumento(new Documento(TipoDocumentoBoleto.getTipoDocumentoBoleto())));
    }
}
