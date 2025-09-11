package Model;

import java.util.Date;

public class Tarefa {
    private String Nome;
    private String Descricao;
    private Date DataInicio;
    private Date Prazo;

    public Tarefa(String nome, String descricao, Date prazo) {
        Nome = nome;
        Descricao = descricao;
        DataInicio = new Date();
        Prazo = prazo;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public Date getPrazo() {
        return Prazo;
    }
}
