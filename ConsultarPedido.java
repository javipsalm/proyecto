package buscadorPedidos;

import java.util.HashMap;
import java.util.Set;

public class ConsultarPedido {
  public static HashMap<String, String> pedidos = new HashMap<String, String>();

  public static String buscarPedido(String identificador) {
	    Set<String> identificadores = pedidos.keySet();
	    
	    if (identificadores.contains(identificador))
	      return pedidos.get(identificador);
	    else
	      return "No se ha encontrado el pedido";
	  }
}
