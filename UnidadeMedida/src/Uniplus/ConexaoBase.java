package Uniplus;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoBase {

	public static void main(String[] args) {

	try {
		Connection con = ConectarBase.criarConexao();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}


}
}