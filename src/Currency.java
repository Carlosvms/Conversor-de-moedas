public class Currency {
    private String nome;
    private String simbolo;
    private double taxaConversao;

    public Currency(String nome, String simbolo, double taxaConversao) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.taxaConversao = taxaConversao;
    }

    public String getNome() {
        return nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }
}
