package person;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PDriver
{

	public ArrayList<Person> read() throws ClassNotFoundException, SQLException
	{
		// ArrayList<Person> pp = new ArrayList<>();

		PCommand pp = new PCommand();
		pp.al = new ArrayList<>();

		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Person");

		while (rs.next())
		{
			pp.al.add(new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		}
		con.close();
		return pp.al;
	}

	public void create(Person p) throws ClassNotFoundException, SQLException
	{
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement st = con.createStatement();

		st.execute("insert into Person values('" + p.getId() + "','" + p.getlName() + "','" + p.getfName() + "','"
				+ p.getAge() + "')");
		con.close();
	}

	public void update(Person p) throws SQLException, ClassNotFoundException
	{
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement st = con.createStatement();

		st.executeUpdate("update Person set lName = '" + p.getlName() + "' where id = 2");

		con.close();
	}

	public void delete(Person p) throws SQLException, ClassNotFoundException
	{
		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement st = con.createStatement();

		st.execute("delete from Person where id = '" + p.getId() + "'");

		con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		PDriver drv = new PDriver();
		drv.update(new Person(2, "Vasya", "Pupkin1", 39));
//		drv.create(new Person(3, "Vasya", "Pupkin1", 39));
		System.out.println(drv.read());
	}
}
