package vecka1;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Colors {
	
	public Colors(){
	
		JFrame frame = new JFrame();
	
		//frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	
		JButton red = new JButton("RED");
		JButton green = new JButton("GREEN");
		JButton blue = new JButton("BLUE");
		
		JLabel label = new JLabel("hej"); //for the circle
		//Graphics2D g = null;
		//CircleIcon redCircle = null;
		//redCircle.paintIcon(label, g, 0, 0, Color.RED);
		//JLabel label = new JLabel(redCircle);
		
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setBounds(150, 50, 200, 200); //For the circle
		red.setBounds(100, 300, 100, 50);
		green.setBounds(200, 300, 100, 50);
		blue.setBounds(300, 300, 100, 50);
		frame.setSize(500, 500);
		//frame.pack();
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args){
		
		Colors a = new Colors();
		
	}

}

