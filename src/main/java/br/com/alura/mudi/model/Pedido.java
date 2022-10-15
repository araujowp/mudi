package br.com.alura.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data 
public class Pedido {
	
	private String nomeProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataEntrega;
	private String urlProduto;
	private String urlImagem;
	private String descricao;
	
}
