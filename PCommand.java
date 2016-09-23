package person;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class PCommand extends JPanel
{
	public PCommand() throws ClassNotFoundException, SQLException
	{
		setLayout(null);
		JMenu menu = new JMenu("File");
		menu.setBounds(1, 1, 100, 50);
		JMenuBar mBar = new JMenuBar();
		mBar.add(menu);

		add(mBar);
	}
}
