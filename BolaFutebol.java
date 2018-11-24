public class BolaFutebol extends Bola {
    private String tipo;
    public BolaFutebol (String cor, int tamanho, String tipo){
        super(cor, tamanho);
        this.tipo = tipo;
    }
    public void mostrar (){
        super.mostrar(); // super para poder acessar o método mostrar da superclasse
        System.out.println(tipo);
    }
}