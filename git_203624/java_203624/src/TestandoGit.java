import java.util.Scanner;

public class TestandoGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno("Davi", 123);
        System.out.print("Digite seu nome aqui: ");
        String nome = sc.next();

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
