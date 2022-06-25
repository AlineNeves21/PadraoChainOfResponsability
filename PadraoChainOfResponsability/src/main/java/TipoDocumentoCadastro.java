public class TipoDocumentoCadastro implements TipoDocumento{

        private static TipoDocumentoCadastro tipoDocumentoCadastro = new TipoDocumentoCadastro();

    private TipoDocumentoCadastro() {};

        public static TipoDocumentoCadastro getTipoDocumentoCadastro() {
            return tipoDocumentoCadastro;
        }
}
