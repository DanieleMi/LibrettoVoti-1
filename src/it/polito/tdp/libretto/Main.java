package it.polito.tdp.libretto;
	
import it.polito.tdp.libretto.model.Libretto;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LibrettoVoti.fxml")) ;
			BorderPane root = (BorderPane)loader.load();
			Scene scene = new Scene(root);
			
			Libretto libretto = new Libretto() ;
			LibrettoController controller = loader.getController() ;
			controller.setModel(libretto);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
