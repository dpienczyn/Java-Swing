import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame{
	
	JTable table;
	
	public Table(){
		setSize(600, 600);
		setTitle("Tabelka");
		setLayout(new FlowLayout());
		
		String[] columnNames = {"Nazwisko", "Imie", "Wiek"};
		Object[][] data = {
				{"Kowalski", "Piotr", "55"},
				{"Pol", "Ola", "99"},
				{"Martyna", "Parchem", "77"},
				{"Artur", "Kochany", "88"}
		};
		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}

	public static void main(String[] argv){
		Table t = new Table();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setVisible(true);
	}
}
