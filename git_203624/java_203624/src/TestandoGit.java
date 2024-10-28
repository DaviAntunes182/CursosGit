import java.util.Scanner;

public class TestandoGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.printf("""
                Seja bem-vindo(a) %s!
                """, nome);
    }
}
