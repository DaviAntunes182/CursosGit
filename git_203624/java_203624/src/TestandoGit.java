import java.util.Scanner;

public class TestandoGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno al1 = new Aluno("Davi", 123);
        Aula au1 = new Aula("iniciando github com java", 10);
        System.out.print("Digite seu nome aqui: ");
        String nome = sc.next();

        Curso c1 = new Curso("Curso de git com java", "Carinha do bigode feio");

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("""
                Seja bem-vindo(a) %s!
                """, nome);
                
        System.out.printf("""
                Você tem %d anos
                """, idade);
    }
}
