import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {

			int acao = 0;
			while (true) {
				System.out.println("Digite 1 para codificar e 2 para decodificar");
				acao = in.nextInt();
				String vazio = in.nextLine();

				if (acao == 1 || acao == 2) {
					break;
				}
			}

			System.out.println("Digite a palavra: ");
			String base = in.nextLine();

			base = base.toUpperCase();

			for (int i = 0; i < base.length(); i++) {
				if (base.charAt(i) < 65 || base.charAt(i) > 90) {
					System.out.println("Palavra inválida. Digite apenas letras.");
					acao = 0;
				}
			}

			if (acao == 0) {
				break;
			}

			System.out.println("Digite o índice da sifra:");
			int n = in.nextInt();
			String vazio2 = in.nextLine();
			String resultado = "";

			if (acao == 1) {
				for (int i = 0; i < base.length(); i++) {
					resultado += (char) ((base.charAt(i) - 65) + (n % 26) + 65);
				}
			} else if (acao == 2) {
				for (int i = 0; i < base.length(); i++) {
					resultado += (char) ((base.charAt(i) - 65) - (n % 26) + 65);
				}
			}

			System.out.println(resultado);

			System.out.println("Deseja encerrar o programa? (s/n)");
			char continuar = in.nextLine().charAt(0);

			if (continuar == 's') {
				break;
			}

		}
		System.out.println("Programa encerrado");

	}

}
