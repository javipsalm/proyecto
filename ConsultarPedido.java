package buscadorPedidos;

import java.util.HashMap;
import java.util.Set;

/**
 * Clase que crea un diccionario almacenado en la variable pedidos
 * @version 0.8
 * @author zuper
 *
 */

public class ConsultarPedido {
	
	/**
	 * Variable de clase; Es un diccionario de todos los pedidos realizados.
	 */
	
  public static HashMap<String, String> pedidos = new HashMap<String, String>();
  
  /**
   * Metodo buscarPedido; Comprueba si un identificador esta en los pedidos
   * y te muestra su contenido o si existe.
   * @param identificador; Es un string que tiene cada pedido que sirve para comprobar su
   * estado
   * @return Devuelve el estado del pedido
   * @see ConsultarPedido crea el diccionario donde se almacenan los identificadores
   */

  public static String buscarPedido(String identificador) {
	    Set<String> identificadores = pedidos.keySet();
	    
	    if (identificadores.contains(identificador))
	      return pedidos.get(identificador);
	    else
	      return "No se ha encontrado el pedido";
	  }
}
