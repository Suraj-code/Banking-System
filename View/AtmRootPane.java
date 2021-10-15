package View;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class AtmRootPane extends BorderPane {

	private LoginViewPane lp;
	private DepositViewPane dp;
	private SelectOptionViewPane sovp;
	private TabPane tp;
	
	
	public AtmRootPane () {
		
		//create tab pane and disable tabs from being closed
		tp = new TabPane();
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		//create panes
		lp = new LoginViewPane();
		sovp = new SelectOptionViewPane();
		dp = new DepositViewPane();
		
		//create tabs with panes added
		Tab t1 = new Tab("Login", lp);
		Tab t2 = new Tab("Select Option", sovp);
		Tab t3 = new Tab("Deposit tab", dp);
		
		//add tabs to tab pane
		tp.getTabs().addAll(t1, t2, t3);
		
		//add menu bar and tab pane to this root pane
		this.setCenter(tp);
		
	}
	
	
}
