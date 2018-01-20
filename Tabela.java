import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Tabela {

	public static void main(String[] args){
		JFrame frame = new JFrame();
		JTable table = new JTable();
		
		Object[] columns = {"Id", "First Name", "Last Name", "Age"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		table.setModel(model);
		
		table.setBackground(Color.blue);
		table.setForeground(Color.black);
		Font font = new Font("Sans Serif", Font.BOLD, 13);
		table.setFont(font);
		table.setRowHeight(30);
		
		JLabel Id = new JLabel("Id");
		JLabel FirstName = new JLabel("First Name");
		JLabel LastName = new JLabel("Last Name");
		JLabel Age = new JLabel("Age");
		
		Id.setBounds(20, 200, 100, 50);
		frame.add(Id);
		FirstName.setBounds(20, 230, 100, 50);
		frame.add(FirstName);
		LastName.setBounds(20, 260, 100, 50);
		frame.add(LastName);
		
		
		JTextField textId = new JTextField();
		JTextField textFname = new JTextField();
		JTextField textLname = new JTextField();
		JTextField textAge = new JTextField ();
		
		JButton btnAdd = new JButton("Add");
		JButton btnDelete = new JButton("Delete");
		JButton btnUpdate = new JButton("Update");
		
		textId.setBounds(100, 220, 100, 25);
		textFname.setBounds(100, 250, 100, 25);
		textLname.setBounds(100, 280, 100, 25);
		textAge.setBounds(100, 310, 100, 25);
		
		frame.add(textId);
		frame.add(textFname);
		frame.add(textLname);
		frame.add(textAge);
		
		btnAdd.setBounds(240, 220, 100, 25);
		btnDelete.setBounds(240, 220, 100, 25);
		btnUpdate.setBounds(240, 220, 100, 25);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 0, 880, 200);
		
		frame.setLayout(null);
		
		frame.add(pane);
		
		frame.add(btnAdd);
		frame.add(btnDelete);
		frame.add(btnUpdate);
		
		Object[] row = new Object[4];
		
		btnAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				row[0]=textId.getText();
				row[1]=textFname.getText();
				row[2]=textLname.getText();
				row[3]=textAge.getText();
				
				model.addRow(row);
				
			}
			
		});
		
		btnDelete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0){
					model.removeRow(i);
				}
				else{
					System.out.println("Delete error");
				}
			}
			
		});
		
		table.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				
				textId.setText(model.getValueAt(i, 0).toString());
				textFname.setText(model.getValueAt(i, 1).toString());
				textLname.setText(model.getValueAt(i, 2).toString());
				textAge.setText(model.getValueAt(i, 3).toString());
			}
		});
		
		btnUpdate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				
				if(i>=0){
					model.setValueAt(textId.getText(), i, 0);
					model.setValueAt(textFname.getText(), i, 1);
					model.setValueAt(textLname.getText(), i, 2);
					model.setValueAt(textAge.getText(), i, 3);
				}
				else{
					System.out.println("Update Error");
				}
				
			}
			
		});
		
		frame.setSize(900, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
