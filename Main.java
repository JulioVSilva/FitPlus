import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Pessoa pessoa = new Pessoa();

    System.out.print("Digite '1' para cadastrar Aluno ou '2' para cadastrar Professor:");
    char opcao = sc.next().charAt(0);

    if (opcao == '1' || opcao == 'a') {
      Aluno a = new Aluno();
      CadastroAlunos ca = new CadastroAlunos();

      System.out.print("Nome:");
      a.setNome(sc.next());

      System.out.print("Data de Nascimento:");
      a.setDataNascimento(Date.valueOf(sc.next()));
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

      System.out.print("CPF:");
      a.setCpf(sc.nextInt());

      System.out.print("Endereço:");
      a.setEndereco(sc.next());

      System.out.print("Contato:");
      a.setContato(sc.next());

      System.out.print("Plano de Treino:");
      a.setPlanoTreino(sc.next());

      System.out.print("Data da matrícula:");
      a.setDataMatricula(Date.valueOf(sc.next()));

      ca.cadastrarAluno(a);
      System.out.print("Aluno cadastrado com sucesso!");

    } else if (opcao == '2' || opcao == 'p') {
      Professor p = new Professor();
      CadastroProfessores cp = new CadastroProfessores();

      System.out.print("Nome:");
      p.setNome(sc.next());

      System.out.print("Data de Nascimento:");
      p.setDataNascimento(Date.valueOf(sc.next()));

      System.out.print("CPF:");
      p.setCpf(sc.nextInt());

      System.out.print("Endereço:");
      p.setEndereco(sc.next());

      System.out.print("Contato:");
      p.setContato(sc.next());

      System.out.print("Modalidade:");
      p.setModalidade(sc.next());

      System.out.print("Turno:");
      p.setTurno(sc.next());
    }
  }
}