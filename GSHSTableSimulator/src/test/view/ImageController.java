package test.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import test.main.*;

public class ImageController implements Initializable {
	@FXML
	Canvas canvas;
	GraphicsContext gc;
	Property properties[];

	public void initialize(URL location, ResourceBundle resources) {
		gc = canvas.getGraphicsContext2D();
		draw();
	}

	void draw() {
		File chk;
		while (true) {
			gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
			for (int i = 0; i < 13; i++) {
				for (int j = 0; j < 6; j++){
					chk = new File("src/test/image/hwatu/0_0.jpg");
					if(chk.isFile()){
						Hwatu testHwatu = new Hwatu(i * 35 + 50, j * 53 + 50, 0, true, i, j);
						testHwatu.flipCard();
						testHwatu.getCardImage();
					}
				}
			}
		}
	}

}