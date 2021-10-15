package Controller;

import View.AtmRootPane;
import View.DepositViewPane;
import model.ATM;
import model.Bank;

public class AtmCOntroller {

	private AtmRootPane view;
	private ATM model;
	private DepositViewPane dp;
	
	public AtmCOntroller(AtmRootPane view, ATM model) {
		
		this.view = view;
		this.model = model;
		
		//dp.addCoursesToComboBox(b.getAccounts());
		
	}
	
}
