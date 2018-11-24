public class TestaBomba {
    public static void main(String[] args) {
        BombaDaAgua b = new BombaDaAgua();
        try {
            b.ligar(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        b.desligar();
    } 
}