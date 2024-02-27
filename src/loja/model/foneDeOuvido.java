package loja.model;

public class foneDeOuvido extends ProdutosEletronicos {

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