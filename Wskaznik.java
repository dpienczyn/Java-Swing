import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Wskaznik extends JFrame implements ActionListener {

	 JLabel waga, wzrost, lwynik, sum;
	  JTextField twaga, twzrost, wynik;
	  double tempwaga, tempwzrost, twynik;
	  JButton oblicz;
	 
	  public Wskaznik(){
	 
	    setSize(600, 600);
	    setTitle("Oblicz swój wskaŸnik BMI");
	    setLayout(null);
	 
	    waga = new JLabel("Wpisz swoj¹ wage w kg");
	    waga.setBounds(50, 50, 200, 200);
	    add(waga);
	 
	    wzrost = new JLabel("Wpisz swój wzrost w cm");
	    wzrost.setBounds(50, 60, 200, 100);
	    add(wzrost);
	 
	    twaga = new JTextField(" ");
	    twaga.setBounds(200, 140, 130, 20);
	    add(twaga);
	    twaga.addActionListener(this);
	 
	    twzrost = new JTextField(" ");
	    twzrost.setBounds(200, 100, 130, 20);
	    add(twzrost);
	    twzrost.addActionListener(this);
	 
	    lwynik = new JLabel("Wynik ");
	    lwynik.setBounds(160, 170, 130, 20);
	    add(lwynik);
	 
	    wynik = new JTextField(" ");
	    wynik.setBounds(200, 170, 130, 20);
	    add(wynik);
	    wynik.addActionListener(this);
	 
	    oblicz = new JButton("Oblicz");
	    oblicz.setBounds(200, 200, 70, 20);
	    add(oblicz);
	    oblicz.addActionListener(this);
	    
	    sum = new JLabel("");
	    sum.setBounds(210, 210, 200, 200);
	    sum.setForeground(Color.MAGENTA);
	    add(sum);
	 
	  }
	 
	  public static void main(String arg[]){
	    Wskaznik b = new Wskaznik();
	    b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    b.setVisible(true);
	  }
	 
	  @Override
	  public void actionPerformed(ActionEvent e) {
	    tempwaga = Double.parseDouble(twaga.getText());
	    tempwzrost = Double.parseDouble(twzrost.getText());
	    tempwzrost = tempwzrost/100;
	    twynik = tempwaga/(tempwzrost*tempwzrost);
	 
	    wynik.setText(String.format("%.2f",twynik));
	    if(twynik<18.0){
	    	sum.setText("NIEDOWAGA");
	    }
	    else if(twynik>=18.5 && twynik<=25.0){
	    	sum.setText("WAGA JEST PRAWID£OWA");
	    }
	    else if(twynik>25.0&&twynik<=30){
	    	sum.setText("NADWAGA");
	    }
	    else if(twynik>30.0&&twynik<=35.0){
	    	sum.setText("I STOPIEÑ OTY£OŒCI");
	    }
	    else if(twynik>35.0&&twynik<=40.0){
	    	sum.setText("II STOPIEÑ OTY£OŒCI");
	    }
	    else if(twynik>40.0){
	    	sum.setText("III STOPIEÑ OTY£OŒCI");
	    }
	  }
	 
	}

