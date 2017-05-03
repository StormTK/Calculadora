package Calculadora;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/****************
*** @StormTK  ***
*****************/

public class Panel_201212925 extends JPanel{
	
	private Image Fondo;//Imagen
	
	public Panel_201212925(Image img){//Constructor
		this.Fondo = img; //usar imagen
		Componentes();	
	}

	@Override
	public void paintComponent (Graphics g){
		g.drawImage(Fondo,0,0, null); 
	}
	
	public void Componentes(){
		Dimension dimension = new Dimension(Fondo.getWidth(null),Fondo.getHeight(null));//Que el jpanel tenga las dimesiones de la imagen
		this.setPreferredSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setMaximumSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setMaximumSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setSize(dimension);//Que el jpanel tenga las dimesiones de la imagen
		this.setLayout(null);//Se trabaje en coordenadas
	}
}
