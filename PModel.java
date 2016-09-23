package person;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PModel extends AbstractTableModel
{

	public ArrayList<Person> pp = new ArrayList();

	public PModel(ArrayList<Person> pp)
	{
		this.pp = pp;
	}

	@Override
	public int getColumnCount()
	{
		return 4;
	}

	@Override
	public int getRowCount()
	{
		return pp.size();
	}

	@Override
	public String getColumnName(int c)
	{
		String result = "";
		switch (c)
		{
		case 0:
			result = "id";
			break;
		case 1:
			result = "fName";
			break;
		case 2:
			result = "lName";
			break;
		case 3:
			result = "age";
			break;
		}
		return result;
	}

	@Override
	public Object getValueAt(int row, int col)
	{
		switch (col)
		{
		case 0:
			return pp.get(row).getId();
		case 1:
			return pp.get(row).getfName();
		case 2:
			return pp.get(row).getlName();
		case 3:
			return pp.get(row).getAge();
		default:
			return "";
		}
	}
}
