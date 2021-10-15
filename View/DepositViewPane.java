package View;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import model.Account;

public class DepositViewPane extends GridPane{

	private Label lblChooseAccount, lblChooseAmount, lblNote;
	private TextField txtAmount, txtNote1;
	private Button btnDeposit;
	private ComboBox<Account> cAccount;
	
	public DepositViewPane () {
		
		//styling
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);

		ColumnConstraints column0 = new ColumnConstraints();
		column0.setHalignment(HPos.RIGHT);
		//column0.setHgrow(Priority.ALWAYS);

		ColumnConstraints column1 = new ColumnConstraints();
		column1.setHalignment(HPos.LEFT);
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
		
		//set up the labels
		lblChooseAccount = new Label("Choose account to deposit: ");
		lblChooseAmount = new Label("Enter Amount: ");
		lblNote = new Label("Note: ");
		
		//set up text fields
		txtAmount = new TextField();
		txtNote1 = new TextField();
		
		//set up the button
		btnDeposit = new Button("Deposit");
		
		//set up the combo box
		cAccount = new ComboBox<Account>();
		
		//add to the container
		this.add(lblChooseAccount, 0, 0);
		this.add(cAccount, 1, 0);
		
		this.add(lblChooseAmount, 0, 1);
		this.add(txtAmount, 1, 1);
		
		this.add(lblNote, 0, 2);
		this.add(txtNote1, 1, 2);
		
		//GridPane.setColumnSpan(btnDeposit, 2);
		btnDeposit.setAlignment(Pos.CENTER);
		this.add(btnDeposit, 0, 3);
		
		
		this.setGridLinesVisible(true);
		
	}
	
	//method to allow the controller to add accounts to the combobox
	public void addCoursesToComboBox(Account[] accounts) {
		cAccount.getItems().addAll(accounts);
		cAccount.getSelectionModel().select(0); //select first course by default
	}

}
