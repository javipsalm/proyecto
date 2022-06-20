package buscadorPedidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsultarPedidoTest {

	@Test
	void buscarPedido() {
		ConsultarPedido.pedidos.put("HWPLO89", "4_Bultos, Recibido");
		String resultado = ConsultarPedido.buscarPedido("HWPLO89");
		
		assertEquals("4_Bultos, Recibido", resultado);
	}
	
	@Test
	void NoBuscarPedido() {
		ConsultarPedido.pedidos.put("HWPLO89", "4_Bultos, Recibido");
		String resultado = ConsultarPedido.buscarPedido("ZZZZZZZZ");
		
		assertEquals("No se ha encontrado el pedido", resultado);
	}

}
