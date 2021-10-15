package Main;

import Controller.AtmCOntroller;
import View.AtmRootPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ATM;

public class ApplicationLoader extends Application {

	private AtmRootPane view;
	
	@Override
	public void init() {
		//create view and model and pass their references to the controller
		view = new AtmRootPane();
		ATM model = new ATM();
		new AtmCOntroller(view, model);	
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		//sets min width and height for the stage window
		stage.setMinWidth(530); 
		stage.setMinHeight(500);
		
		stage.setTitle("Bank of Arusha");
		stage.setScene(new Scene(view));
		stage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
