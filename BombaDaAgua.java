public class BombaDaAgua {
    public boolean status;

    public void ligar (int tempo) throws Exception {
        try{
            status = true;
            while(tempo !=0){
                if ( tempo > 0){
                    int t = tempo--;
                    System.out.println("Faltam " + t + " s para a bomba ser desligada");
                }else{
                    throw new Exception("Tempo precisa ser maior que 0");
            }
        } 
        }catch (NumberFormatException e){
            System.out.println("Por gentileza, não entre com letras" + e.toString());
        }
    }

    public void desligar () {
        status = false;
        System.out.println("A bomba foi desligada");
    }
}