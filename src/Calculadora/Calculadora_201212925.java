package Calculadora;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculadora_201212925 extends JFrame {
	
	public JTextField txt_display;
	public JButton num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_0, btn_signo, btn_pt, btn_suma, btn_resta, btn_mult, btn_div, btn_cos, btn_sen, btn_tan, btn_fib, btn_bin, btn_fac, btn_C, btn_Mplus, btn_enter, btn_Mminum, btn_MR; 
	public JRadioButton Mem_A, Mem_B, Mem_C; 
	public ButtonGroup Memoria;
	public boolean Estado_Pt = true, Iniciar = true;
	public float dato = 0, memory_A = 0, memory_B = 0, memory_C = 0;
	public int tip_operador = 0, memory_pos = 0;
	
	Calculadora_201212925(){
		Image Icono = new ImageIcon(getClass().getResource("/Imagenes/calculadora.png")).getImage(); //imagen icono de la calculadora
		this.setIconImage(Icono);
		setTitle("Calculadora by Kebyn");
		setSize(465,325);//El tamaño es de 800x600
		setResizable(false);//No permite cambiar el tamaño de la pantalla 
		setLocationRelativeTo(null);//Lo coloca en el centro de la pantalla
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Poder cerrar la aplicacion
		getContentPane().setLayout(null);
		IniciarComponentes();//Metodo de los componentes
	}
	
	public void IniciarComponentes(){
		txt_display = new JTextField();
		num_0 = new JButton();
		num_1 = new JButton();
		num_2 = new JButton();
		num_3 = new JButton();
		num_4 = new JButton();
		num_5 = new JButton();
		num_6 = new JButton();
		num_7 = new JButton();
		num_8 = new JButton();
		num_9 = new JButton();
		btn_signo = new JButton();
		btn_pt = new JButton();
		btn_suma = new JButton();
		btn_resta = new JButton();
		btn_mult = new JButton();
		btn_div = new JButton();
		btn_fib = new JButton();
		btn_fac = new JButton();
		btn_bin = new JButton();
		btn_C = new JButton();
		btn_Mplus = new JButton();
		btn_Mminum = new JButton();
		btn_enter = new JButton();
		btn_sen = new JButton();
		btn_cos = new JButton();
		btn_tan = new JButton();
		btn_MR = new JButton();
		Memoria = new ButtonGroup();
		Mem_A = new JRadioButton();
		Mem_B = new JRadioButton();
		Mem_C = new JRadioButton();
		
		//Modificando el Display
		txt_display.setHorizontalAlignment(JTextField.RIGHT);
		txt_display.setFont(new Font("Consolas", Font.PLAIN, 26));
		txt_display.setForeground(Color.BLACK);
		txt_display.setText("0");
		txt_display.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		txt_display.setFocusable(false);
		txt_display.setBounds(20,20,420,40);
		
		//La primera fila de botones
		btn_Mplus.setText("M+");
		btn_Mplus.setBounds(20,80,55,30);
		btn_Mplus.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_fib.setText("Fib");
		btn_fib.setBounds(80,80,55,30);
		btn_fib.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_bin.setText("Bin");
		btn_bin.setBounds(140,80,55,30);
		btn_bin.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_fac.setText("Fac");
		btn_fac.setBounds(200,80,55,30);
		btn_fac.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_C.setText("C");
		btn_C.setBounds(260, 80, 55, 30);
		btn_C.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_MR.setText("MR");
		btn_MR.setBounds(360, 100, 55, 30);
		btn_MR.setFont(new Font("Helvetica", Font.BOLD, 12));
		
		//La segunda fila de botones
		btn_Mminum.setText("M-");
		btn_Mminum.setBounds(20,120,55,30);
		btn_Mminum.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_7.setText("7");
		num_7.setBounds(80,120,55,30);
		num_7.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_8.setText("8");
		num_8.setBounds(140,120,55,30);
		num_8.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_9.setText("9");
		num_9.setBounds(200,120,55,30);
		num_9.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_suma.setText("+");
		btn_suma.setBounds(260, 120, 55, 30);
		btn_suma.setFont(new Font("Helvetica", Font.BOLD, 12));
		Mem_A.setText("Memoria A");
		Mem_A.setBounds(335, 140, 100, 30);
		
		//La tercera fila de botones
		btn_tan.setText("tan");
		btn_tan.setBounds(20,160,55,30);
		btn_tan.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_4.setText("4");
		num_4.setBounds(80,160,55,30);
		num_4.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_5.setText("5");
		num_5.setBounds(140,160,55,30);
		num_5.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_6.setText("6");
		num_6.setBounds(200,160,55,30);
		num_6.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_resta.setText("-");
		btn_resta.setBounds(260, 160, 55, 30);
		btn_resta.setFont(new Font("Helvetica", Font.BOLD, 12));
		Mem_B.setText("Memoria B");
		Mem_B.setBounds(335, 180, 100, 30);

		//La cuarta fila de botones
		btn_cos.setText("cos");
		btn_cos.setBounds(20,200,55,30);
		btn_cos.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_1.setText("1");
		num_1.setBounds(80,200,55,30);
		num_1.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_2.setText("2");
		num_2.setBounds(140,200,55,30);
		num_2.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_3.setText("3");
		num_3.setBounds(200,200,55,30);
		num_3.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_mult.setText("x");
		btn_mult.setBounds(260, 200, 55, 30);
		btn_mult.setFont(new Font("Helvetica", Font.BOLD, 12));
		Mem_C.setText("Memoria C");
		Mem_C.setBounds(335, 220, 100, 30);
		
		//La quinta fila de botones
		btn_sen.setText("sen");
		btn_sen.setBounds(20,240,55,30);
		btn_sen.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_pt.setText(".");
		btn_pt.setBounds(80,240,55,30);
		btn_pt.setFont(new Font("Helvetica", Font.BOLD, 12));
		num_0.setText("0");
		num_0.setBounds(140,240,55,30);
		num_0.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_enter.setText("=");
		btn_enter.setBounds(200,240,55,30);
		btn_enter.setFont(new Font("Helvetica", Font.BOLD, 12));
		btn_div.setText("/");
		btn_div.setBounds(260, 240, 55, 30);
		btn_div.setFont(new Font("Helvetica", Font.BOLD, 12));
		
		Memoria.add(Mem_A);
		Memoria.add(Mem_B);
		Memoria.add(Mem_C);
		this.getContentPane().add(txt_display);
		this.getContentPane().add(btn_Mplus);
		this.getContentPane().add(btn_fib);
		this.getContentPane().add(btn_bin);
		this.getContentPane().add(btn_fac);
		this.getContentPane().add(btn_C);
		this.getContentPane().add(btn_MR);//Primera Fila
		this.getContentPane().add(btn_Mminum);
		this.getContentPane().add(num_7);
		this.getContentPane().add(num_8);
		this.getContentPane().add(num_9);
		this.getContentPane().add(btn_suma);
		this.getContentPane().add(Mem_A);//Segunda fila
		this.getContentPane().add(btn_tan);
		this.getContentPane().add(num_4);
		this.getContentPane().add(num_5);
		this.getContentPane().add(num_6);
		this.getContentPane().add(btn_resta);
		this.getContentPane().add(Mem_B);//Tercera fila
		this.getContentPane().add(btn_cos);
		this.getContentPane().add(num_1);
		this.getContentPane().add(num_2);
		this.getContentPane().add(num_3);
		this.getContentPane().add(btn_mult);
		this.getContentPane().add(Mem_C);//Cuarta fila
		this.getContentPane().add(btn_sen);
		this.getContentPane().add(btn_pt);
		this.getContentPane().add(num_0);
		this.getContentPane().add(btn_enter);
		this.getContentPane().add(btn_div);
		
		num_1.addActionListener(new ActionListener() {//Boton no. 1
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
            		if(txt_display.getText().equals("0")){
	            		txt_display.setText("1");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"1");
	            	}
            	}
            }
        });
		
		num_2.addActionListener(new ActionListener() {//Boton no. 2
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("2");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"2");
	            	}
            	}
            }
        });
		
		num_3.addActionListener(new ActionListener() {//Boton no. 3
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("3");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"3");
	            	}
            	}
            }
        });
		
		num_4.addActionListener(new ActionListener() {//Boton no. 4
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("4");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"4");
	            	}
            	}
            }
        });
		
		num_5.addActionListener(new ActionListener() {//Boton no. 5
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("5");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"5");
	            	}
            	}
            }
        });
		
		num_6.addActionListener(new ActionListener() {//Boton no. 6
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("6");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"6");
	            	}
            	}
            }
        });
		
		num_7.addActionListener(new ActionListener() {//Boton no. 7
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("7");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"7");
	            	}
            	}
            }
        });
		
		num_8.addActionListener(new ActionListener() {//Boton no. 8
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("8");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"8");
	            	}
            	}
            }
        });
		
		num_9.addActionListener(new ActionListener() {//Boton no. 9
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("9");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"9");
	            	}
            	}
            }
        });
		
		
		num_0.addActionListener(new ActionListener() {//Boton no. 0
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22)){
	            	if(txt_display.getText().equals("0")){
	            		txt_display.setText("0");
	            	}else{	
	            		txt_display.setText(txt_display.getText()+"0");
	            	}
            	}
            }
        });
		
		btn_suma.addActionListener(new ActionListener() {//Boton suma
            public void actionPerformed(ActionEvent e){
            	if(Iniciar == true){
            		dato = Float.parseFloat(txt_display.getText());
            		tip_operador = 1;
            		Iniciar = false;
            	} else {
            		switch(tip_operador){
	            		case 1:{
	            			dato = dato + Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 2:{
	            			dato = dato - Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 3:{
	            			dato = dato * Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 4:{
	            			dato = dato / Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            	}      	
            	}
            	txt_display.setText("0");
            	Estado_Pt = true;
            	tip_operador = 1;
            }
        });
		
		btn_resta.addActionListener(new ActionListener() {//Boton resta
            public void actionPerformed(ActionEvent e){
            	if(Iniciar == true){
            		dato = Float.parseFloat(txt_display.getText());
            		tip_operador = 2;
            		Iniciar = false;
            	} else {
            		switch(tip_operador){
	            		case 1:{
	            			dato = dato + Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 2:{
	            			dato = dato - Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 3:{
	            			dato = dato * Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 4:{
	            			dato = dato / Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            	}    	
            	}
            	txt_display.setText("0");
            	Estado_Pt = true;
            	tip_operador = 2;
            }
        });
		
		btn_mult.addActionListener(new ActionListener() {//Boton multiplicacion
            public void actionPerformed(ActionEvent e){
            	if(Iniciar == true){
            		dato = Float.parseFloat(txt_display.getText());
            		tip_operador = 3;
            		Iniciar = false;
            	} else {
            		switch(tip_operador){
	            		case 1:{
	            			dato = dato + Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 2:{
	            			dato = dato - Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 3:{
	            			dato = dato * Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 4:{
	            			dato = dato / Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            	}
            	}
            	txt_display.setText("0");
            	Estado_Pt = true;
            	tip_operador = 3;
            }
        });
		
		btn_div.addActionListener(new ActionListener() {//Boton division
            public void actionPerformed(ActionEvent e){

            	if(Iniciar == true){
            		dato = Float.parseFloat(txt_display.getText());
            		tip_operador = 4;
            		Iniciar = false;
            	} else {
            		switch(tip_operador){
	            		case 1:{
	            			dato = dato + Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 2:{
	            			dato = dato - Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 3:{
	            			dato = dato * Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            		case 4:{
	            			dato = dato / Float.parseFloat(txt_display.getText());
	            			break;
	            		}
	            	}	            	
            	}
            	txt_display.setText("0");
            	Estado_Pt = true;
            	tip_operador = 4;
            }
        });
		
		btn_enter.addActionListener(new ActionListener() {//Boton Enter
            public void actionPerformed(ActionEvent e){
            	switch(tip_operador){
            		case 1:{
            			dato = dato + Float.parseFloat(txt_display.getText());
            			break;
            		}
            		case 2:{
            			dato = dato - Float.parseFloat(txt_display.getText());
            			break;
            		}
            		case 3:{
            			dato = dato * Float.parseFloat(txt_display.getText());
            			break;
            		}
            		case 4:{
            			dato = dato / Float.parseFloat(txt_display.getText());
            			break;
            		}
            	}
            	txt_display.setText(String.valueOf(dato));
            	dato = 0;
            	Estado_Pt = true;
            	Iniciar = true;
            }
        });
		
		btn_pt.addActionListener(new ActionListener() {//Boton no. 0
            public void actionPerformed(ActionEvent e){
            	if(!(txt_display.getText().length() == 22) && (Estado_Pt == true)){
	            	txt_display.setText(txt_display.getText()+".");
	            	Estado_Pt = false;
            	}
            }
        });
		
		btn_C.addActionListener(new ActionListener() {//Boton C
            public void actionPerformed(ActionEvent e){
            	dato = 0;
            	txt_display.setText("0");
            	Estado_Pt = true;
            	Iniciar = true;
            }
        });
		
		btn_cos.addActionListener(new ActionListener() {//Boton Coseno
            public void actionPerformed(ActionEvent e){
            	txt_display.setText(String.valueOf((float) Math.cos((Float.parseFloat(txt_display.getText()) * ((2 * Math.PI)/360)))));
            	Estado_Pt = true;
            }
        });
		
		btn_sen.addActionListener(new ActionListener() {//Boton seno
            public void actionPerformed(ActionEvent e){
            	txt_display.setText(String.valueOf((float) Math.sin((Float.parseFloat(txt_display.getText()) * ((2 * Math.PI)/360)))));
            	Estado_Pt = true;
            }
        });
		
		btn_tan.addActionListener(new ActionListener() {//Boton tangente
            public void actionPerformed(ActionEvent e){
            	txt_display.setText(String.valueOf((float) Math.tan((Float.parseFloat(txt_display.getText()) * ((2 * Math.PI)/360)))));
            	Estado_Pt = true;
            }
        });
		
		btn_Mplus.addActionListener(new ActionListener() {//Boton M+
            public void actionPerformed(ActionEvent e){
            	switch(memory_pos){
            		case 1:{
            			memory_A = Float.parseFloat(txt_display.getText());
            			break;
            		}
            		case 2:{
            			memory_B = Float.parseFloat(txt_display.getText());
            			break;
            		}
            		case 3:{
            			memory_C = Float.parseFloat(txt_display.getText());
            			break;
            		}
                }
            }
        });
		
		btn_Mminum.addActionListener(new ActionListener() {//Boton M+
            public void actionPerformed(ActionEvent e){
            	switch(memory_pos){
            		case 1:{
            			memory_A = 0;
            			break;
            		}
            		case 2:{
            			memory_B = 0;
            			break;
            		}
            		case 3:{
            			memory_C = 0;
            			break;
            		}
                }
            }
        });
		
		btn_MR.addActionListener(new ActionListener() {//Boton M+
            public void actionPerformed(ActionEvent e){
            	switch(memory_pos){
            		case 1:{
            			txt_display.setText(String.valueOf(memory_A));
            			break;
            		}
            		case 2:{
            			txt_display.setText(String.valueOf(memory_B));
            			break;
            		}
            		case 3:{
            			txt_display.setText(String.valueOf(memory_C));
            			break;
            		}
                }
            }
        });
		
		Mem_A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	memory_pos = 1;
            }
        });
		
		Mem_B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	memory_pos = 2;
            }
        });
		
		Mem_C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	memory_pos = 3;
            }
        });
		
		btn_fac.addActionListener(new ActionListener() {//Boton M+
            public void actionPerformed(ActionEvent e){
            	int temp = (int)Float.parseFloat(txt_display.getText());
            	Factorial_201212925 NumFac = new Factorial_201212925();
            	temp = NumFac.Recursivo(temp);
            	if(temp > 0) {
                	txt_display.setText(String.valueOf(temp));
            	}else{
                	txt_display.setText("No es un # Entero Positivo");
            	}
            }
        });
		
		btn_bin.addActionListener(new ActionListener() {//Boton M+
            public void actionPerformed(ActionEvent e){
            	int temp = (int)Float.parseFloat(txt_display.getText());
            	DecBin_201212925 Bin = new DecBin_201212925();
            	temp = Bin.DecABin(temp);
            	txt_display.setText(String.valueOf(temp));
            }
        });
		
		btn_fib.addActionListener(new ActionListener() {//Boton M+
            public void actionPerformed(ActionEvent e){
            	int temp = (int)Float.parseFloat(txt_display.getText());
            	Fibonacci_201212925 NumFib = new Fibonacci_201212925();
            	temp = NumFib.ResolverFibo(temp);
                txt_display.setText(String.valueOf(temp));
            }
        });
	}
}
