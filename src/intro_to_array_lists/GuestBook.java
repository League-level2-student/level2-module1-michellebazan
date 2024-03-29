package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	public static void main(String[] args) {
	GuestBook guestbook = new GuestBook();
	guestbook.start();
	}
	
	JButton addNames = new JButton("Add Name");
	JButton viewNames = new JButton("View Names");
	
	public void start() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(300, 300);
		
		panel.setVisible(true);
		frame.setVisible(true);
		
		panel.add(addNames);
		panel.add(viewNames);
		
		addNames.addActionListener(this);
		viewNames.addActionListener(this);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton)e.getSource();
		if (buttonClicked==addNames) {
			names.add(JOptionPane.showInputDialog("enter a name"));
			}else if(buttonClicked == viewNames) {
		
		//for loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println("Guest #" + i + ": " + s);
		}
		
		
		
			
		
		//https://central.jointheleague.org/levels/Level2/Mod1Recipes/index.html
				
		}
	}
	
	
}
