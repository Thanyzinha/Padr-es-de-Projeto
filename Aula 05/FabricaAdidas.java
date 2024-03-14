public class FabricaAdidas implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}
