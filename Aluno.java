import java.sql.Date;

public class Aluno extends Pessoa {

    public String planoTreino;
    public Date dataMatricula;



    public String getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(String planoTreino) {
        this.planoTreino = planoTreino;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
