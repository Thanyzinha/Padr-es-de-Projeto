public abstract class Violao implements Cloneable {
    private String modelo;
    private int cordas;
    private String tipoConstrucao;
    private String indicacao;

    public Violao(String modelo, int cordas, String tipoConstrucao, String indicacao) {
        this.modelo = modelo;
        this.cordas = cordas;
        this.tipoConstrucao = tipoConstrucao;
        this.indicacao = indicacao;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getModelo() {
        return modelo;
    }

    public int getCordas() {
        return cordas;
    }

    public String getTipoConstrucao() {
        return tipoConstrucao;
    }

    public String getIndicacao() {
        return indicacao;
    }
}
