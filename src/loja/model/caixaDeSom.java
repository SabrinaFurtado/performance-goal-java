package loja.model;

public class caixaDeSom extends ProdutosEletronicos {

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

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Bluetooth: " + bluetooth);
	}

	@Override
	public String getTipoNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNumero(int gerarNumero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}

}
