import java.awt.*;
import java.awt.event.*;

public class party{

	public static void main(String args[]) {
		buildInvite();
	}
	
	buildInvite(){
		Frame f = new Frame();
		Label l = new Label("Hoy hay Development Party: Java and Python are our guests");
		Button b = new Button("Python Rocks!!!");
		Button c = new Button("Java Rules!!!");
		Panel p = new Panel();
		p.add(l);
	}
}