package test.main;

import java.io.File;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public abstract class Property {
	//fields
	private DoubleProperty x;
	private DoubleProperty y;
	private double angle;
	private boolean isShowPublic;
	
	//constructor
	Property(double x,double y,double angle,boolean isShowPublic){
		this.x = new SimpleDoubleProperty(x);
		this.y = new SimpleDoubleProperty(y);
		this.angle = angle;
		this.isShowPublic = isShowPublic;
	}
	
	//getters
	public double getX() {return this.x.doubleValue();}
	public double getY() {return this.y.doubleValue();}
	public DoubleProperty getXProperty() {return x;}
	public DoubleProperty getYProperty() {return y;}
	public double getAngle() {return this.angle;}
	
	//setters
	public void setAngle(double angle) {this.angle = angle;}
	
	
	
}
