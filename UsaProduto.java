public class UsaProduto {
    public static void main(String[] args) {
        // testa da gravação
        ProdutoPersiste p = new ProdutoPersiste();
        p.setCodigo(2);
        p.setDescricao("Sabonete");
        System.out.println(p.gravar());
        // testa da leitura
        Produto01 p1 = ProdutoPersiste.ler(2);
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
    }
}