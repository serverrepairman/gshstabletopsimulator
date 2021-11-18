package test.main;

import java.io.File;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

class HwatuIdentity extends CardIdentity{
	public static final int HwatuWidth = 35;
	public static final int HwatuHeight = 53;
	private int month;
	private int num;
	HwatuIdentity(int month, int num){
		super(HwatuWidth,HwatuHeight,new ImageView(new File("src/test/image/hwatu/"+month+"_"+num+".png").toURI().toString()));
		this.month = month;
		this.num = num;
	}
	HwatuIdentity(){
		super(HwatuWidth,HwatuHeight,new ImageView(new File("src/test/image/hwatu/0_0.jpg").toURI().toString()));
		this.month = this.num = 0;
	}
}
public class Hwatu extends Card{
	public Hwatu(double x,double y,double angle,boolean isShowPublic, int month,int num){
		super(x,y,angle,isShowPublic,new HwatuIdentity(month,num),new HwatuIdentity());
	}
}
