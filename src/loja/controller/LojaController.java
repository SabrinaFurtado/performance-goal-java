package loja.controller;

import java.util.ArrayList;
import java.util.List;

import loja.model.ProdutosEletronicos;

public class LojaController {

	private List<ProdutosEletronicos> listaProdutos = new ArrayList<>();

	public ProdutosEletronicos procurarPorNumero(int numero) {
		for (ProdutosEletronicos produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}

	public void listarTodas() {
		for (ProdutosEletronicos produto : listaProdutos) {
			produto.visualizar();
		}
	}

	public void cadastrar(ProdutosEletronicos produto) {
	    produto.setNumero(gerarNumero(0));
	    listaProdutos.add(produto);
	    System.out.println("Produto " + produto.getNome() + " cadastrado com sucesso!");
	}


	public void atualizar(ProdutosEletronicos produto) {
		ProdutosEletronicos produtoEncontrado = procurarPorNumero(produto.getNumero());
		if (produtoEncontrado != null) {
			int index = listaProdutos.indexOf(produtoEncontrado);
			listaProdutos.set(index, produto);
			System.out.println("Produto " + produto.getNome() + " atualizado com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	public void deletar(int numero) {
		ProdutosEletronicos produtoEncontrado = procurarPorNumero(numero);
		if (produtoEncontrado != null) {
			listaProdutos.remove(produtoEncontrado);
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	public int gerarNumero(int numero) {
		return ++numero;

	}


	public void listarProdutos() {
		listarProdutos();
		;

	}

	public int buscarProdutoPorCodigo(int numero) {
		for (ProdutosEletronicos produto : listaProdutos) {
			if (produto.getCodProduto() == numero) {
				return numero;
			}
		}
		return -1;

	}

	public float efetuarCompra(int codigoProduto, int quantidade) {
		ProdutosEletronicos produto = procurarPorNumero(codigoProduto);

		if (produto != null) {
			double total = produto.getPreco() * quantidade;
			System.out.println("Compra realizada com sucesso. Total a pagar: " + total);
			return (float) total;
		} else {
			System.out.println("Produto não encontrado.");
			return (0);
		}
	}

	public void apagarProduto(int codigoProduto) {
		ProdutosEletronicos produto = procurarPorNumero(codigoProduto);
		
		if (produto != null) {
			deletar(codigoProduto);
			System.out.println("Produto removido com sucesso!");
			
		} else {
			System.out.println("Produto não encontrado.");

		}

	}

}