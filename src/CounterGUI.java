import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CounterGUI
{

	/**
	 * @param args
	 */
	static int count = 0;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("counter");
		frame.setSize(600,200);

		frame.setLocation(300,300);
		frame.setResizable(false);
		FlowLayout flowlayout = new FlowLayout();
		frame.setLayout(flowlayout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JPanel panel = new JPanel();

		
		JButton buttonp = new JButton("+");
		JButton buttonm = new JButton("-");
		JButton buttonz = new JButton("set to zero");
		final JTextField txtfield = new JTextField();
		txtfield.setColumns(5);
		
		panel.add(buttonp);
		panel.add(buttonm);
		panel.add(buttonz);
		panel.add(txtfield);
		frame.add(panel);
	
		frame.setVisible(true);

	

		
		buttonp.addActionListener (new ActionListener() {
			   
			   public void actionPerformed(ActionEvent e) {
				   count++;
					final String counts = String.valueOf(count);
				   txtfield.setText(counts);
			   }
		});
		
		buttonm.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e){
				count--;
				final String counts = String.valueOf(count);
				txtfield.setText(counts);
				
			}
		});
		
		buttonz.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e){
				count=0;
				final String counts = String.valueOf(count);
				txtfield.setText(counts);
				
			}
		});
	
	
		}
}
