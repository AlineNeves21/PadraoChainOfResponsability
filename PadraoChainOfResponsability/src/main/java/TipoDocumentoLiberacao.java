public class TipoDocumentoLiberacao implements TipoDocumento {

    private static TipoDocumentoLiberacao tipoDocumentoLiberacao = new TipoDocumentoLiberacao();

    private TipoDocumentoLiberacao() {};

    public static TipoDocumentoLiberacao getTipoDocumentoLiberacao() {
        return tipoDocumentoLiberacao;
    }
}
