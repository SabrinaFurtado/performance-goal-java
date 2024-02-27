package loja;

import java.util.Scanner;

public class Menu {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		try (Scanner leia = new Scanner(System.in)) {
			while (true) {

				System.out.println("  *******************************************");
				System.out.println("  *          Eletronicos SAH                *");
				System.out.println("  *******************************************");
				System.out.println("  *    1 - CADASTRAR                        *");
				System.out.println("  *    2 - LISTAR TODAS OS PRODUTOS         *");
				System.out.println("  *    3 - BUSCAR PRODUTO POR NÚMERO        *");
				System.out.println("  *    4 - ATUALIZAR                        *");
				System.out.println("  *    5 - APAGAR PRODUTO                   *");
				System.out.println("  *    6 - EFETUAR COMPRA                   *");
				System.out.println("  *    0 - SAIR                             *");
				System.out.println("  *******************************************");
				System.out.println("  *      DIGITE A OPÇÃO DESEJADA            *");
				System.out.println("  *******************************************");
				leia.nextInt();

				do {
					System.out.print("Digite a opção desejada: ");
					opcao = leia.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("Digite o produto para cadastrar: ");
						break;
					case 2:
						System.out.println("Digite o produto para cadastrar: ");
						
						break;
					case 3:
						System.out.println("Digite o produto para cadastrar: ");
						
						break;
					case 4:
						System.out.println("Digite o produto para cadastrar: ");
						
						break;
					case 5:
						System.out.println("Digite o produto para cadastrar: ");
						
						break;
					case 6:
						System.out.println("Digite o produto para cadastrar: ");
						
						break;
					case 0:
						System.out.println("Saindo...");
						break;
					default:
						System.out.println("Opção inválida! Por favor, digite novamente.");
					}
				} while (opcao != 0);
			}
		}
	}

}
