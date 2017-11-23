package codigo;
import java.awt.Color;

import acm.graphics.GRect;
/**
 *Autor : Víctor Añover
 *
 *
 *La clase barra es la que dibuja el cursor del juego
 *
 */
public class Barra  extends GRect{

/**
 * Crea el cursor del juego
 * @param width -> el ancho del cursor 
 * @param height -> el alto del cursor
 * @param _color -> color del cursor
 * @param _posicionY
 */
	public Barra(double _ancho, double _alto, Color _color) {
		super(_ancho,_alto);
		setFilled(true);
		setFillColor(_color);
	
	}
	/**
	 * mueveBarra reposiciona la barra en la coordenada 
	 * en la que está el ratón
	 * @param posX -> la posicion x del raton. la Y la obtiene de la propia barra
	 * @param anchoPantalla-> porque asi no tengo que pasar nada mas
	 */
	public void mueveBarra(int posX, int anchoPantalla){
		if (posX + getWidth() < anchoPantalla)
			setLocation(posX, getY());
	}
	
	

}
