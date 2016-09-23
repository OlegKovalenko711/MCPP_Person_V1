package person;

import java.awt.Color;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class PFrame extends JFrame
{
	public PFrame() throws ClassNotFoundException, SQLException
	{
		setLayout(null);
		setBounds(100, 100, 800, 600);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		PPanel pp = new PPanel();
		PCommand pc = new PCommand();

		pc.setBounds(1, 1, 800, 30);
		add(pc);

		pp.setBounds(50, 20, 700, 500);
		pp.setBorder(BorderFactory.createLoweredBevelBorder());
		add(pp);

		setVisible(true);
	}

}
