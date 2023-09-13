import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idadeUsuario;

        System.out.println("Olá este programa informa se o eleitor pode votar ou não\n Por favor digite sua idade");
        idadeUsuario = scan.nextInt();

        if (idadeUsuario == 16 || idadeUsuario == 17 || idadeUsuario > 65) {
            System.out.println("O seu voto é facultativo.");
        } else if (idadeUsuario < 16) {
            System.out.println("Você não pode votar.");
        } else {
            System.out.println("O seu voto é obrigatório.");
        }

    }
}
// Fiquei bastante contente, pois foi o primeiro código que não precisei consultar fontes externas como Google e outros.