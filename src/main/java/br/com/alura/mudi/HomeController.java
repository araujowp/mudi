package br.com.alura.mudi;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("home")
	public String home(Model model) {
		
		Pedido pedido  = new Pedido();
		pedido.setNomeProduto("Bermudas Aramis");
		pedido.setUrlProduto("https://www.amazon.com.br/Bermuda-5Pockets-Bigode-Aramis-Masculino/dp/B09C6G7WNY?ref_=Oct_DLandingS_D_00ac6e33_62&smid=A1ZZFT5FULY4LN");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/716mOr-0pHL._AC_SY879_.jpg");
		pedido.setDescricao("Bermuda Jeans 5 bolsos");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos",pedidos);
		
		return "/home";
	}
	
}
