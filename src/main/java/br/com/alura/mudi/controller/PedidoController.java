package br.com.alura.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mudi.dto.RequisicaoNovoPedido;
import br.com.alura.mudi.model.Pedido;
import br.com.alura.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "pedido/formulario";
	}

//	@PostMapping("novo")
//	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result ) {
//		
//		if(result.hasErrors()) {
//			return "pedido/formulario";
//		}
//		
//		Pedido pedido = requisicao.toPedido();
//		pedidoRepository.save(pedido);
//		
//		return "redirect:/home";
//	}
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
	    if(result.hasErrors()) {
	        return "pedido/formulario";
	    }

	    Pedido pedido = requisicao.toPedido();
	    pedidoRepository.save(pedido);

	    return "forward:/home";
	}
}
