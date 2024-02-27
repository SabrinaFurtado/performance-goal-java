package loja.controller;

import java.util.ArrayList;
import java.util.List;

import loja.model.Produto;

public class LojaController {

	private List<Produto> listaProdutos = new ArrayList<>();
	private int numero = 0;

	public Produto procurarPorNumero(int numero) {
		for (Produto produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}

	public void listarTodas() {
		for (Produto produto : listaProdutos) {
			produto.visualizar();
		}
	}

	public void cadastrar(Produto produto) {
		produto.setNumero(gerarNumero());
		listaProdutos.add(produto);
		System.out.println("Produto " + produto.getNome() + " cadastrado com sucesso!");
	}

	public void atualizar(Produto produto) {
		Produto produtoEncontrado = procurarPorNumero(produto.getNumero());
		if (produtoEncontrado != null) {
			int index = listaProdutos.indexOf(produtoEncontrado);
			listaProdutos.set(index, produto);
			System.out.println("Produto " + produto.getNome() + " atualizado com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	public void deletar(int numero) {
		Produto produtoEncontrado = procurarPorNumero(numero);
		if (produtoEncontrado != null) {
			listaProdutos.remove(produtoEncontrado);
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
	}

	public int gerarNumero() {
		return ++numero;
	}
}
