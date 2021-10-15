package View;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public class SelectOptionViewPane extends GridPane {

	private Label lblWelcome2;
	private Button btnDeposit;
	private Button btnWithdraw;
	private Button btnShowTransHistory;
	private Button btnShowBalance;
	private Button btnLogOut;
	
	public SelectOptionViewPane () {
		
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
		
		//set up the labels
		lblWelcome2 = new Label("Welcome, What would you like to do today?");
		lblWelcome2.setFont(new Font("Arial", 20));
		
		//set up the buttons
		btnDeposit = new Button("Deposit");
		btnWithdraw = new Button("Withdraw");
		btnShowTransHistory = new Button("Show Transaction History");
		btnShowBalance = new Button("Check Balance");
		btnLogOut = new Button("LogOut");
		
		//add controls and labels
		GridPane.setColumnSpan(lblWelcome2, 2);
		this.add(lblWelcome2, 0, 0);
		GridPane.setColumnSpan(btnDeposit, 2);
		this.add(btnDeposit, 0, 1);
		GridPane.setColumnSpan(btnWithdraw, 2);
		this.add(btnWithdraw, 0, 2);
		GridPane.setColumnSpan(btnShowTransHistory, 2);
		this.add(btnShowTransHistory, 0, 3);
		GridPane.setColumnSpan(btnShowBalance, 2);
		this.add(btnShowBalance, 0, 4);
		
		GridPane.setColumnSpan(btnLogOut, 2);
		this.add(btnLogOut, 0, 6);
		
		//this.setGridLinesVisible(true);
		
	}
	
}
