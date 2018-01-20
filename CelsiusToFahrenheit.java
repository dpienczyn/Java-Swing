import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CelsiusToFahrenheit extends JFrame implements ActionListener{
	private JLabel lCelsjusz, lFahrenheit;
	private JTextField tCelsjusz, tFahrenheit;
	private JButton bKonwertuj;
	private JRadioButton rCtoF, rFtoC;
	private ButtonGroup radioPanel;
	private double tempCelsjusz, tempFahrenheit;
	
	public CelsiusToFahrenheit(){
		
		setSize(700, 500);
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
		tFahrenheit.addActionListener(this);
		
		bKonwertuj = new JButton("Oblicz");
		bKonwertuj.setBounds(190, 250, 70, 30);
		add(bKonwertuj);
		bKonwertuj.addActionListener(this);
		
		radioPanel = new ButtonGroup();
		rCtoF = new JRadioButton("Celcius to Fahrenheit");
		rCtoF.setBounds(250, 290, 150, 100);
		rCtoF.setSelected(true);
		radioPanel.add(rCtoF);
		add(rCtoF);
		rFtoC = new JRadioButton("Fahrenheit to Celcius");
		rFtoC.setBounds(250, 350, 150, 100);
		radioPanel.add(rFtoC);
		add(rFtoC);
	}
	
	public static void main(String[] args){
		
		CelsiusToFahrenheit c = new CelsiusToFahrenheit();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		if(o==bKonwertuj){
			if(rCtoF.isSelected()){
				tempCelsjusz = Double.parseDouble(tCelsjusz.getText()); //stopnie celcjusza ze stringa konwertujemy na liczbe double zmiennoprzecinkowa
				tempFahrenheit = 32.0 + (9.0/5.0)*tempCelsjusz;
				tFahrenheit.setText(String.valueOf(tempFahrenheit));
			}
			else if(rFtoC.isSelected()){
				tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
				tempCelsjusz = (tempFahrenheit - 32.0) * (5.0/9.0);
				tCelsjusz.setText(String.valueOf(tempCelsjusz));
			}
		}
		if (o==tCelsjusz){
			tempCelsjusz = Double.parseDouble(tCelsjusz.getText()); //stopnie celcjusza ze stringa konwertujemy na liczbe double zmiennoprzecinkowa
			tempFahrenheit = 32.0 + (9.0/5.0)*tempCelsjusz;
			tFahrenheit.setText(String.valueOf(tempFahrenheit));
		}
		else if(o==tFahrenheit){
			tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
			tempCelsjusz = (tempFahrenheit - 32.0) * (5.0/9.0);
			tCelsjusz.setText(String.valueOf(tempCelsjusz));
		}
		}
}