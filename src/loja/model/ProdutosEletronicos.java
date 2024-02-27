package loja.model;

public abstract class ProdutosEletronicos {
	private int codProduto;
	private String nome;
	private double preco;
	private int quantidade;

	public ProdutosEletronicos(int codProduto, String nome, double preco, int quantidade) {
		this.codProduto = codProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {
		System.out.println("********** DADOS DO PRODUTO ************");
		System.out.println("Número do produto: " + this.codProduto);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: R$" + this.preco);
		System.out.println("Quantidade em estoque: " + this.quantidade);
		System.out.println("****************************************");
	}

	public abstract String getTipoNome();

	public abstract void setNumero(int gerarNumero);

	public abstract int getNumero();
}
