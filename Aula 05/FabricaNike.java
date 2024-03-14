public class FabricaNike implements FabricaEsportiva {
    @Override
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}
