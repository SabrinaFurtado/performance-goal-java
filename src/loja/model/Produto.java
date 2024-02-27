package loja.model;

public abstract class Produto {
    private int numero;
    private String nome;
    private double preco;
    private int quantidade;
	private int tipo;

    public Produto(int numero, String nome, double preco, int quantidade) {
        this.numero = numero;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	        System.out.println("Número do produto: " + this.numero);
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Preço: R$" + this.preco);
	        System.out.println("Quantidade em estoque: " + this.quantidade);
	        System.out.println("****************************************");
	    }
	    public String getTipoNome() {
	        String tipoNome = "";
	        switch (this.tipo) {
	            case 1:
	                tipoNome = "Fone de Ouvido";
	                break;
	            case 2:
	                tipoNome = "Caixa de Som ";
	                break;
	            default:
	                tipoNome = "Tipo de produto desconhecido";
	        }
	        return tipoNome;
	    }
}
    
