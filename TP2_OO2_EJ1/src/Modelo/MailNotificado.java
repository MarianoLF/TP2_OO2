package Modelo;

import java.security.KeyStore.PasswordProtection;
import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailNotificado {
	
		public void NotificarUsuario(String destinatario, String asunto, String mensaje) {
			String to = destinatario;
			
			String from = ""; 
			
			final String usuario = ""; 
			final String contraseña = "";
			
			String host = "smtp.mailtrap.io";
			
			Properties props = new Properties();
		    props.put("mail.smtp.auth", "true");
		    props.put("mail.smtp.starttls.enable", "true");
		    props.put("mail.smtp.host", host);
		    props.put("mail.smtp.port", "587");
		    
		    Session session = Session.getInstance(props,
			         new jakarta.mail.Authenticator() {
			            protected PasswordProtection getPasswordAuthentication() {
			               return new PasswordAuthentication(usuario, contraseña);
			    }
			         });
			try {
		    	  Message message = new MimeMessage(session);
		    	  message.setFrom(new InternetAddress(from));
		    	  message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		    	  message.setSubject(asunto); // Asunto del correo
		    	  message.setText(mensaje); // mensaje del correo
		    	  Transport.send(message);
	      }catch (MessagingException e) {
		         throw new RuntimeException(e);
	      }
		}
	

}
