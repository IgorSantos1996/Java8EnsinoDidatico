import java.io.*;

public class ProdutoPersiste extends Produto01 {
    public String gravar () {
        String ret = "Produto armazenado com sucesso";
        try {
            FileOutputStream file = new FileOutputStream("C:/Produto" + this.getCodigo());
            ObjectOutputStream stream  = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
        } catch (Exception erro) {
            ret = "Falha na gravação\n " + erro.toString();
        }
        return ret;
    }
    public static Produto01 ler (int codigo) {
        try {
            FileInputStream file = new FileInputStream("C:/Produto" + codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return ((Produto01) stream.readObject());
        }
        catch (Exception erro) {
            System.out.println("Falha na leitura\n " + erro.toString());
            return null;
        }
    }
}