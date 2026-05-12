package construtores;

public class ConstrutoresMain {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, 12345, "Engenharia");
        System.out.println("Nome: " + aluno.getIdade());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
    }
}
