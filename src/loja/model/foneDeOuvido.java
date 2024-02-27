package loja.model;

public class foneDeOuvido extends Produto {

	private String comFio;
	
	public foneDeOuvido(int numero, String nome, double preco, int quantidade) {
		super(numero, nome, preco, quantidade);
		
	}

	public String getComFio() {
		return comFio;
	}

	public void setComFio(String comFio) {
		this.comFio = comFio;
	}
	
	@Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Com Fio: " + comFio);
}
}