package loja;

import java.util.Scanner;
import loja.controller.LojaController;
import loja.model.ProdutosEletronicos;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		LojaController produtos = new LojaController();

		int opcao;
		int codigoProduto;
		String nomeProduto;
		int quantidade;
		double preco;
		float totalCompra;

		while (true) {
			System.out.println("  *******************************************");
			System.out.println("  *          Eletronicos SAH                *");
			System.out.println("  *******************************************");
			System.out.println("  *    1 - CADASTRAR                        *");
			System.out.println("  *    2 - LISTAR TODOS OS PRODUTOS         *");
			System.out.println("  *    3 - BUSCAR PRODUTO POR NÚMERO        *");
			System.out.println("  *    4 - ATUALIZAR                        *");
			System.out.println("  *    5 - APAGAR PRODUTO                   *");
			System.out.println("  *    6 - EFETUAR COMPRA                   *");
			System.out.println("  *    0 - SAIR                             *");
			System.out.println("  *******************************************");
			System.out.println("  *      DIGITE A OPÇÃO DESEJADA            *");
			System.out.println("  *******************************************");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Opção 1 selecionada: CADASTRAR PRODUTO");
				System.out.println("Digite o código do produto:");
				codigoProduto = leia.nextInt();

				System.out.println("Digite o nome do produto:");
				nomeProduto = leia.next();

				System.out.print("Digite a quantidade em estoque:");
				quantidade = leia.nextInt();

				System.out.println("Digite o preço unitário do produto:");
				preco = leia.nextFloat();

				System.out.println("Produto cadastrado com sucesso!");
				break;

			case 2:
				System.out.println("Opção 2 selecionada: LISTAR PRODUTOS DISPONÍVEIS");
				produtos.listarProdutos();
				
				break;

			case 3:
				System.out.println("Opção 3 selecionada: BUSCAR PRODUTO POR CÓDIGO");
				System.out.println("Digite o código do produto:");
				codigoProduto = leia.nextInt();
				produtos.buscarProdutoPorCodigo(codigoProduto);
				break;

			case 4:
				System.out.println("Opção 4 selecionada: ATUALIZAR PRODUTO");
				System.out.println("Digite o código do produto que deseja atualizar:");
				codigoProduto = leia.nextInt();

				ProdutosEletronicos produto = produtos.procurarPorNumero(codigoProduto);
				if (produto != null) {
					System.out.println("Digite o novo nome do produto:");
					nomeProduto = leia.next();

					System.out.println("Digite a nova quantidade:");
					quantidade = leia.nextInt();

					System.out.println("Digite o novo preço unitário:");
					preco = leia.nextFloat();

					produto.setNome(nomeProduto);
					produto.setQuantidade(quantidade);
					produto.setPreco(preco);

					produtos.atualizar(produto);
					System.out.println("Produto atualizado com sucesso!");
				} else {
					System.out.println("Produto não encontrado.");
				}
				break;

			case 5:
				System.out.println("Opção 5 selecionada: APAGAR PRODUTO");
				System.out.println("Digite o código do produto que deseja apagar:");
				codigoProduto = leia.nextInt();
				produtos.apagarProduto(codigoProduto);
				break;

			case 6:
				System.out.println("Opção 6 selecionada: EFETUAR COMPRA");
				System.out.println("Digite o código do produto que deseja comprar:");
				codigoProduto = leia.nextInt();

				System.out.println("Digite a quantidade que deseja comprar:");
				quantidade = leia.nextInt();

				totalCompra = produtos.efetuarCompra(codigoProduto, quantidade);
				System.out.println("Total da compra: R$" + totalCompra);
				break;

			case 0:
				System.out.println("Saindo...");
				System.exit(0);
				break;

			default:
				System.out.println("Opção inválida! Por favor, digite novamente.");
			}
		}
	}
}
