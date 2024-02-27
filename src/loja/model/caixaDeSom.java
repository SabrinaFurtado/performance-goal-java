package loja.model;

public class caixaDeSom extends Produto {

	private String bluetooth;

	public caixaDeSom(int numero, String nome, double preco, int quantidade) {
		super(numero, nome, preco, quantidade);
		// TODO Auto-generated constructor stub
	}

	public String getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}


}


