import java.util.Scanner;

public class TestandoGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome aqui: ");
        String nome = sc.next();

        System.out.printf("""
                Olá %s!
                """, nome);
    }
}
