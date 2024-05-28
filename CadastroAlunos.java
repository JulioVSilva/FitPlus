import java.util.ArrayList;
public class CadastroAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno a) {
        alunos.add(a);
    }

    public void listar() {
        for (Aluno a : alunos) {
            System.out.println("Nome:" + a.getNome());
            System.out.println("Data de Nascimento:" + a.getDataNascimento());
            System.out.println("CPF:" + a.getCpf());
            System.out.println("Endereço:" + a.getEndereco());
            System.out.println("Contato:" + a.getContato());
            System.out.println("Plano de treino:" + a.getPlanoTreino());
            System.out.println("Data da matrícula:" + a.getDataMatricula());
        }
    }
}

