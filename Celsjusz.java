import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Celsjusz extends JFrame implements ActionListener{


	JLabel lCelsjusz, lFahrenheit;
	JTextField tCelsjusz, tFahrenheit;
	JButton bKonwertuj;
	double tempCelsjusz, tempFahrenheit;
	
	public Celsjusz(){
		
		setSize(500, 400);
		setTitle("Przeliczanie stopni Celsjusza na Fahrenheita");
		setLayout(null);
		
		lCelsjusz = new JLabel("Stopnie Celsjusza: ");
		lCelsjusz.setBounds(30, 30, 150, 150);
		add(lCelsjusz);
		
		tCelsjusz = new JTextField("");
		tCelsjusz.setBounds(150, 100, 150, 20);
		add(tCelsjusz);
		
		lFahrenheit = new JLabel("Stopnie Fahrenheit: ");
		lFahrenheit.setBounds(30, 60, 300, 300);
		add(lFahrenheit);
		
		tFahrenheit = new JTextField("");
		tFahrenheit.setBounds(150, 200, 150, 20);
		add(tFahrenheit);
		
		bKonwertuj = new JButton("Oblicz");
		bKonwertuj.setBounds(190, 250, 70, 30);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
	}
	
	public static void main(String arg[]){
		
		Celsjusz c = new Celsjusz();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		tempCelsjusz = Double.parseDouble(tCelsjusz.getText()); //stopnie celcjusza ze stringa konwertujemy na liczbe double zmiennoprzecinkowa
		tempFahrenheit = 32.0 + (9.0/5.0)*tempCelsjusz;
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
	}
}
