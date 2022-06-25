public class FuncionarioFinanceiro extends Funcionario {

    public FuncionarioFinanceiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoLiberacao.getTipoDocumentoLiberacao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Financeiro";
    }
}
