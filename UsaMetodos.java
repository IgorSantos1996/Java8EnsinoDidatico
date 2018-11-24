public class UsaMetodos {
    public static void main(String[] args) {
        MetodoSemRetorno.imprimirTexto("Usando métodos de outra classe");
        MetodoSemRetorno.somar(20, 30);
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(5));
        System.out.println(MetodosComRetorno.contarLetrasA("Macacada"));
        
    }
}