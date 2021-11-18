package test.main;

import java.io.File;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.DoublePropertyBase;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

abstract class CardIdentity{
	private ImageView image;
	private final double width,height;
	CardIdentity(double width,double height,ImageView image){
		this.width = width;
		this.height = height;
		this.image = image;
        image.setFitHeight(height);
        image.setFitWidth(width);
	}
	
	public double getWidth() {return this.width;}
	public double getHeight() {return this.height;}
	public ImageView getImage() {return image;}
	
}
public abstract class Card{
	
	private boolean isShowFront = false;
	private CardIdentity front,back;
	private SimpleDoubleProperty x;
	private SimpleDoubleProperty y;
	private SimpleDoubleProperty angle;
	
	Card(double x,double y,double angle,boolean isShowPublic, CardIdentity front, CardIdentity back){
		this.x = new SimpleDoubleProperty(x);
		this.y = new SimpleDoubleProperty(y);
		this.angle = new SimpleDoubleProperty(angle);
		this.front = front;
		this.back = back;
	}
	
	public double getX() {return this.x.doubleValue();}
	public double getY() {return this.y.doubleValue();}
	public double getAngle() {return this.angle.doubleValue();}
	public double getWidth() {return this.front.getWidth();}
	public double getHeight() {return this.front.getHeight();}
	
	public DoubleProperty getXProperty() {return this.x;}
	public DoubleProperty getYProperty() {return this.y;}
	public DoubleProperty getAngleProperty() {return this.angle;}
	
	public void flipCard() {this.isShowFront = !this.isShowFront;}
	public void openCard() {this.isShowFront = true;}
	public void closeCard() {this.isShowFront = false;}
	
	public ImageView getCardImage() {
		if(isShowFront)
			return front.getImage();
		else
			return back.getImage();
	}
}
