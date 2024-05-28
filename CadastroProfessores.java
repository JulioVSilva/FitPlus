import java.util.ArrayList;

public class CadastroProfessores {

    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrarProfessor(Professor p) {
        professores.add(p);
    }

    public void listar() {
        for (Professor p: professores) {
            System.out.println("Nome:" + p.getNome());
            System.out.println("Data de Nascimento:" + p.getDataNascimento());
            System.out.println("CPF:" + p.getCpf());
            System.out.println("Endereço:" + p.getEndereco());
            System.out.println("Contato:" + p.getContato());
            System.out.println("Modalidade:" + p.getModalidade());
            System.out.println("Turno de aulas:" + p.getTurno());
        }
    }
}
