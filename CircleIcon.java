package vecka1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;

public abstract class CircleIcon implements Icon{
	
	private int size;
	
	public CircleIcon(int aSize){
		
		size = aSize;
		
	}

	public interface Icon{
		
		int getIconWidth();
		int getIconHeight();
		void paintIcon(Component a, Graphics g, int x, int y, Color c);
		
	}
	
	public int getIconWidth(){
		
		return size;
		
	}
	
	public int getIconHeight(){
		
		return size;
		
	}
	
	public void paintIcon(Component a, Graphics g, int x, int y, Color c){

		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 1, 1);
		g2.setColor(c);
		g2.fill(circle);
		
	}
	
	/*public void repaint(CircleIcon a, Color c){
		
		if(c == Color.RED){
			
			a.paintIcon(Color.RED);
			
		}
		else if(c == Color.GREEN){
		
			a.paintIcon(Color.GREEN);
			
		}
		else{
			
			a.paintIcon(Color.BLUE);
			
		}
		
	}*/

}
