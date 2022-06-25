public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCadastro.getTipoDocumentoCadastro());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}
