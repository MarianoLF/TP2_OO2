package persistencia;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import modelo.Registro;

public class JdbcRegistro implements Registro{
	private String url;
	private String usuario;
	private String contraseña;
	
	public JdbcRegistro (String url, String usuario, String contraseña) {
		this.url = url;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	@Override
	public void registrar(String mensaje) {
		try (Connection miConexion = DriverManager.getConnection(this.url, this.usuario, this.contraseña);
                java.sql.PreparedStatement state = miConexion.prepareStatement(
                        "INSERT INTO registro (registro) VALUES (?)")) {

            state.setString(1, mensaje);

            state.executeUpdate();
        }catch (SQLException e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
	}
}
