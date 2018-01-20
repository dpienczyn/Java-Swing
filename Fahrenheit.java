
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fahrenheit extends JFrame implements ActionListener{
	private JLabel lCelsjusz, lFahrenheit;
	private JTextField tCelsjusz, tFahrenheit;
	private JButton bKonwertuj;
	private JCheckBox checkbox;
	private double tempCelsjusz, tempFahrenheit;
	
	public Fahrenheit(){
		
		setSize(500, 400);
		setTitle("Przeliczanie stopni Celsjusza na Fahrenheita");
		setLayout(null);
		
		lCelsjusz = new JLabel("Stopnie Celsjusza: ");
		lCelsjusz.setBounds(30, 30, 150, 150);
		add(lCelsjusz);
		
		tCelsjusz = new JTextField("");
		tCelsjusz.setBounds(150, 100, 150, 20);
		add(tCelsjusz);
		tCelsjusz.addActionListener(this);
		
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
		
		checkbox = new JCheckBox("Wielkie lietry");
		checkbox.setBounds(280, 250, 100, 100);
		add(checkbox);
		//checkbox.addActionListener(this);
	}
	
	public static void main(String[] args){
		
		Fahrenheit c = new Fahrenheit();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		if(o==bKonwertuj||o==tCelsjusz){
			if(checkbox.isSelected()){
				tFahrenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
			}
			else{
				tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
		}
		tempCelsjusz = Double.parseDouble(tCelsjusz.getText()); //stopnie celcjusza ze stringa konwertujemy na liczbe double zmiennoprzecinkowa
		tempFahrenheit = 32.0 + (9.0/5.0)*tempCelsjusz;
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
		}
		}
}