import java.util.*;

public class EntradaComScanner {
    public static void main (String args []){
        float largura, comprimento, area, perimetro;
        Scanner scan;
        try{
            System.out.println("Entre com o comprimento: ");
            scan = new Scanner(System.in);
            comprimento = scan.nextFloat();

            System.out.println("Entre com a largura");
            largura = scan.nextFloat();
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área de retângulo : " + area);
            System.out.println("Perímetro do retângulo : " + perimetro);


        } catch (NumberFormatException erro){
            System.out.println("Houve erro na conversão, digite apenas caracteres");
        }
    }
}