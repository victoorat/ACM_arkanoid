package codigo;
import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import java.awt.event.MouseEvent;

/*
 * Autor: Víctor Añover
 * 
 * El Arkanoid pero orientado a objetos
 * 
 */
import acm.graphics.*;
public class Arkanoid  extends acm.program.GraphicsProgram {

	Pelota pelota1= new Pelota (20, Color.BLACK);
	Pelota pelota2= new Pelota(30,Color.RED);
	Barra barra1 = new Barra(60, 15, Color.BLUE);
	int anchoLadrillo= 30;
	int altoLadrillo= 15;
// el sistema del marcador
	int puntuacion = 0;
	GLabel marcador = new GLabel("0");
	GRect cajaMarcador = new GRect(20, 40);
	public void init(){
		addMouseListeners();
		setSize(400,600);

		add (pelota1, 0, getHeight()*0.60 - pelota1.getHeight());
		//add (pelota2, 0, getHeight()*0.70 - pelota2.getHeight());
		add(barra1,0, getHeight()*0.85 - barra1.getHeight());
		cajaMarcador.setFilled(true);
		cajaMarcador.setFillColor(Color.red);
	}
	public void run(){
dibujaNivel101();
add(marcador, 5, 0);
add(marcador, 10, 20);
marcador.setFont(new Font("Arial", Font.BOLD, 18));

		while(true){
			pelota1.muevete(this);
			//pelota2.muevete(this);
			pause(20);
		}

	}
	public void mouseMoved(MouseEvent evento){
		barra1.mueveBarra(evento.getX(), getWidth());

	}

	private void dibujaNivel101(){
		for (int j=0; j<14; j++){
			for(int i=j; i< 14; j++){
				Ladrillo miLadrillo = new Ladrillo(anchoLadrillo*i - anchoLadrillo*j/2, altoLadrillo*j + altoLadrillo, anchoLadrillo, altoLadrillo, Color.CYAN);
				add(miLadrillo);
				pause(7);
				
			}
		}
	}
}
