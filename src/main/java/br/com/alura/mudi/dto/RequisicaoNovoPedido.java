package br.com.alura.mudi.dto;

import br.com.alura.mudi.model.Pedido;
import lombok.Data;

@Data
public class RequisicaoNovoPedido {

	private String nomeProduto;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setDescricao(descricao);
		return pedido; 
	}
}
