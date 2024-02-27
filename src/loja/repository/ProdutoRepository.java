package loja.repository;

import loja.model.ProdutosEletronicos;

public interface ProdutoRepository {


    public void  procurarPorNumero(int numero);
    public void listarTodas();
    public void cadastrar(ProdutosEletronicos cadastrar);
    public void atualizar(ProdutosEletronicos atualizar) ;
    public void deletar(int numero);

}
