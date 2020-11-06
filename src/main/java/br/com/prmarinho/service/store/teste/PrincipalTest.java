package br.com.prmarinho.service.store.teste;

import javax.xml.ws.soap.SOAPFaultException;

import br.com.prmarinho.service.store.client.InGameDTO;
import br.com.prmarinho.service.store.client.OutGameDTO;
import br.com.prmarinho.service.store.client.WebStoreServiceSoapService;

public class PrincipalTest {

	public static void main(String[] args) {
		WebStoreServiceSoapService service = new WebStoreServiceSoapService();
		
		try {
			System.out.println("Lista de Jogos");
			 service.getWebStoreServiceSoapPort().listarJogos().forEach(
					 g -> System.err.format("ID: %d - Jogo: %s - Plataforma: %s \n", g.getId() ,g.getNome(), g.getPlataforma())
			);
		 
			 System.out.println("Buscar Jogo");

			 InGameDTO game = new InGameDTO();
			 game.setId(5000);
			
			 OutGameDTO out =  new WebStoreServiceSoapService().getWebStoreServiceSoapPort().buscarJogo(game);
			 System.err.println(out.getNome().concat(" - ").concat(out.getPlataforma()));

			 // Chamada Assíncrona
			 new WebStoreServiceSoapService().getWebStoreServiceSoapPort().desabilitarProduto(2000);
			 
		} catch (SOAPFaultException e) {
			e.printStackTrace();
		}
	}

}
