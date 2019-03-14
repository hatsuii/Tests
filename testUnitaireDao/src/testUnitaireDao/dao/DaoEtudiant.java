package testUnitaireDao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import testUnitaireDao.metier.Etudiant;

public class DaoEtudiant {
	protected String url = "jdbc:mysql://localhost/etudiant";
	protected String login = "root";
	protected String passwd = "";
	private Connection cn = null;
	private Statement st = null;

	public Etudiant readEtudiantbyId(int i) {
		// TODO Auto-generated method stub

		Etudiant etu = new Etudiant();
		int id;
		String nom;
		String prenom;
		String email;
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "SELECT * FROM etudianttable WHERE id = '" + i + "'";
			rs = st.executeQuery(sql);

			while (rs.next()) {
				id = rs.getInt("id");
				nom = rs.getString("nom");
				prenom = rs.getString("prenom");
				email = rs.getString("email");

				etu = new Etudiant(id, nom, prenom, email);
			}
			return etu;

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("errer");

		} finally {

			try {
				st.close();
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return etu;
	}

	public boolean insertEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		etu = new Etudiant();
		ResultSet rs;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = " INSERT INTO ";
			rs = st.executeQuery(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}