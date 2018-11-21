import java.io.*;

public class Produto01 implements Serializable {
    private int codigo;
    private String descricao;

    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo () {
      return codigo;  
    }
}