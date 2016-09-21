package person;

import java.sql.SQLException;

import javax.swing.JFrame;

public class PFrame extends JFrame
{
	public PFrame() throws ClassNotFoundException, SQLException
	{
		setLayout(null);
		setBounds(100, 100, 800, 600);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		PPanel pp = new PPanel();
		pp.setBounds(50, 20, 700, 500);
		add(pp);

		setVisible(true);
	}

}
