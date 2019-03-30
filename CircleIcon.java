package vecka1;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CircleIcon implements Icon{
	
	private int size;
	private Color c;
	
	public CircleIcon(int aSize){
		
		size = aSize;
		c = Color.RED;
		
	}
	
	public int getIconWidth(){
		
		return size;
		
	}
	
	public int getIconHeight(){
		
		return size;
		
	}
	
	public void paintIcon(Component a, Graphics g, int x, int y){

		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, size, size);
		g2.setColor(c);
		g2.fill(circle);
		
	}

}
