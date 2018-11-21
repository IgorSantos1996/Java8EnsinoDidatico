public class UsaTelevisor {
    public static void main (String [] args){
        Televisor tv = new Televisor();
        tv.canal = 150;
        tv.volume = 33;
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.trocarCanal(10);
        tv.mostrar();
    }
}