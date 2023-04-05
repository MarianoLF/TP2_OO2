package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import modelo.Registro;

public class ArchivoTextoRegistro implements Registro{
	private File archivo;
	private FileWriter escritura;
	private PrintWriter linea;
	
	public ArchivoTextoRegistro(String nombreArchivo) throws IOException {
		this.archivo = new File(nombreArchivo);
	}
	
	
	@Override
	public void registrar(String mensaje) {
			if(this.archivo.exists()) {
				try {
					this.escritura = new FileWriter(archivo, true);
					this.linea = new PrintWriter(this.escritura);
					this.linea.println(mensaje);
					this.escritura.close();
					this.linea.close();
				} catch (IOException e) {
				}
		}else {
			try {
				this.archivo.createNewFile();
				this.escritura = new FileWriter(archivo, true);
				this.linea = new PrintWriter(this.escritura);
				this.linea.println(mensaje);
				this.escritura.close();
				this.linea.close();
			} catch (IOException e) {
			}
		}
	}
}
