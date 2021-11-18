package test.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application{
	public void start(Stage primaryStage) throws Exception{
		Parent root=(Parent)FXMLLoader.load(getClass().getResource("../view/testTable.fxml"));
		
		
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 6; j++) {
				Hwatu testHwatu = new Hwatu(i * 35 + 50, j * 53 + 50, 0, true, i, j);
				testHwatu.flipCard();
				testHwatu.getCardImage();
			}
		}
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("Event01");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
