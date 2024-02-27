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


		}
	}

	

