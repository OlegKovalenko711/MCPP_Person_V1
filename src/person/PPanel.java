package person;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PPanel extends JPanel
{
	public PPanel() throws ClassNotFoundException, SQLException
	{

		PDriver pd = new PDriver();
		PModel pm = new PModel(pd.read());

		setLayout(null);
		setBackground(Color.lightGray);
		JTable tab = new JTable(pm);
		JScrollPane jsp = new JScrollPane(tab);
		jsp.setBounds(25, 10, 650, 200);
		add(jsp);

		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(25, 450, 90, 30);
		add(btnCreate);

		btnCreate.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					pd.create(new Person(14, "Nika", "Biga", 26));

				}
				catch (ClassNotFoundException | SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});

	}

}
