package vecka1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Colors{
	
	private static JLabel label;
	private static CircleIcon circle;
	
	public static void main(String[] args){
	
		JFrame frame = new JFrame();
	
		JButton red = new JButton("RED");
		JButton green = new JButton("GREEN");
		JButton blue = new JButton("BLUE");
		
		red.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event){

				label.repaint();
				
			}
			
		});
		
		green.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				label.repaint();
				
			}
			
		});
		
		blue.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				label.repaint();
				
			}
			
		});

		circle = new CircleIcon(100);
		label = new JLabel(circle);
		
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label.setBounds(150, 50, 200, 200);
		red.setBounds(100, 300, 100, 50);
		green.setBounds(200, 300, 100, 50);
		blue.setBounds(300, 300, 100, 50);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}

}

