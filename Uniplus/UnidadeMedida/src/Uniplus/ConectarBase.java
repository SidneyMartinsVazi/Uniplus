package Uniplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarBase {

	static final String URL = "jdbc:postgresql://localhost:5432/unico"; //incica o caminho do banco de dados
	static final String USER = "postgres"; // aqui vai o nome usuario que vc quer acessar
	static final String PASS = "postgres"; // aqui a senha do seu banco
	public static Object nome;

	public static Connection criarConexao() throws ClassNotFoundException, SQLException{
	Class.forName("org.postgresql.Driver");
	Connection conecta = DriverManager.getConnection(URL, USER, PASS);
	if (conecta != null){
	//System.out.print("Conexão efetuada com sucesso...");
	
	
	String query = "SELECT * FROM unidademedida";
	Statement stm = conecta.createStatement();
	ResultSet rs = stm.executeQuery(query);
	
	
	while(rs.next()){
		int id = rs.getInt("id");
		String nome = rs.getString("nome");
//		System.out.println(id + " - " + nome);
	
	
	}

	}
	return conecta;
	//}
	//return null;


	}
	
	SQL(){
		
	}

}
