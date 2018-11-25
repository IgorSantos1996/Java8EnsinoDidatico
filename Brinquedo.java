public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    public Brinquedo() {
    }

    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public Brinquedo(String nome, float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getFaixaEtaria() {
        return this.faixaEtaria;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFaixaEtaria(String faixa) {
        if (faixa.equalsIgnoreCase("0 a 2") || faixa.equalsIgnoreCase("3 a 5") || faixa.equals("6 a 10")
                || faixa.equals("acima de 10"))
            this.faixaEtaria = faixa;
        else
            System.out.println("String não aceita");
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}