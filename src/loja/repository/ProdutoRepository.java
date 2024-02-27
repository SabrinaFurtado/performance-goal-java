package loja.repository;

import loja.model.Produto;

public interface ProdutoRepository {

    // Criando CRUD 
    public void  procurarPorNumero(int numero);
    public void listarTodas();
    public void cadastrar(Produto produto);
    public void atualizar(Produto conta) ;
    public void deletar(int numero);

}
