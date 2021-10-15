package View;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class LoginViewPane extends GridPane {

	private TextField  txtUserName, txtPassword;
	private Label lblWelcome, lblUserName, lblPassword;
	private Button btnLogin;
	
	public LoginViewPane() {

		//styling
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);
		
		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.CENTER);
		//column0.setHgrow(Priority.ALWAYS);
		
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setHalignment(HPos.CENTER);
		//column1.setHgrow(Priority.ALWAYS);
		
		RowConstraints row = new RowConstraints();
		row.setValignment(VPos.CENTER);
		//row.setVgrow(Priority.ALWAYS);

		RowConstraints row1 = new RowConstraints();
		row1.setValignment(VPos.CENTER);
		//row1.setVgrow(Priority.ALWAYS);
		
		RowConstraints row2 = new RowConstraints();
		row2.setValignment(VPos.CENTER);
		//row2.setVgrow(Priority.ALWAYS);

		this.getRowConstraints().addAll(row, row1, row2);

		this.getColumnConstraints().addAll(column0, column1);
		
		//set up labels
		lblWelcome = new Label("Welcome! ");
		lblWelcome.setFont(new Font("Arial", 40));
		lblUserName = new Label("Username:");
		lblPassword = new Label("Password:");
		
		//setup textfields
		txtUserName = new TextField();
		txtPassword = new TextField();

		//initialize button
		btnLogin = new Button("Login");
		btnLogin.setAlignment(Pos.CENTER);
		
		//add controls and labels to the container
		//this.add(new HBox(), 0, 0);
		GridPane.setColumnSpan(lblWelcome, 2);
		this.add(lblWelcome, 0, 0);
		
		
		this.add(lblUserName, 0, 1);
		this.add(txtUserName, 1, 1);
		
		this.add(lblPassword, 0, 2);
		this.add(txtPassword, 1, 2);
		
		this.add(new HBox(), 0, 3);
		this.add(btnLogin, 1, 3);
		
		
		this.setGridLinesVisible(true);
		
	}

}
