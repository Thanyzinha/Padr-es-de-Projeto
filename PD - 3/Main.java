public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto X", 850);
        Exibicao exibicao = new Exibicao();
        Desconto desconto = new Desconto();
        
        
        
        exibicao.exibirInformacoes(produto, desconto);
       
    }
}
