package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private TextField campoSenha;

	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("aluno@ufpi.com.br");
		boolean senhaValida = campoSenha.getText().equals("aluno2022");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.CENTER)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		} else {
			Notifications.create()
			.position(Pos.CENTER)
			.title("Login FXML")
			.text("Usuário ou senha inválidos!")
			.showError();
		}
	}
}
