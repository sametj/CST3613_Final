package James.GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import James.CLASSES.Network;
import James.INTERFACES.NetworkBuilding;

public class Gui extends JFrame {
	private JLabel networkLbl;
	private JButton networkBtn;
	private JTextField netName;
	private JLabel displayNetwork;
	
	
	public Gui() {
		
		this.setTitle("Network GUI");
		this.setSize(300,300);
		this.setLayout(new FlowLayout());
		
		this.networkLbl = new JLabel("NETWORKS");
		this.networkBtn = new JButton("Build All Networks");
		this.netName = new JTextField("Enter Network Name",15);
		this.displayNetwork = new JLabel("******NETWORK INFORMATION******");
		
		
		Container C = this.getContentPane();
		C.add(this.networkLbl);
		C.add(this.networkBtn);
		C.add(this.netName);
		C.add(this.displayNetwork);
		
		this.networkBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					TreeMap<String,Network> NET = NetworkBuilding.buildNetwork();
					displayNetwork.setText(NET.get(netName.getText()).toString().replace("{", "").replace("}", "").replace("=", " | ").replace(",", " "));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
