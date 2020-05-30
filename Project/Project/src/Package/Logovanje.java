package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Logovanje extends JPanel{
	
	public JButton btnNewButton = new JButton("Potvrdi");
	public JButton btnOtkai = new JButton("Otkazi");
	public JTextField textField = new JTextField();
	public JTextField textField_1 = new JTextField();
	
	public Logovanje() {
		
		this.setBackground(new Color(194,236,235));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setthis(this);
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(194,236,235));
		this.add(panel, BorderLayout.CENTER);
		
		ImageIcon imageIcon = new ImageIcon("logoicon2.png");
	    JLabel logopoc = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\logoicon2.png"));
	    logopoc.setText("");
	    
	    JLabel lblNewLabel = new JLabel("PRIJAVA");
	    lblNewLabel.setForeground(new Color(8,126,139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1 = new JLabel("Korisnicko ime");
	    lblNewLabel_1.setForeground(new Color(8,126,139));
	    lblNewLabel_1.setFont(new Font("Montserrat", Font.PLAIN, 12));
	    
	    JLabel lblNewLabel_1_1 = new JLabel("Lozinka");
	    lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_1_1.setForeground(new Color(8, 126, 139));
	    lblNewLabel_1_1.setFont(new Font("Montserrat", Font.PLAIN, 12));
	    
	    
	    textField.setColumns(10);
	    
	    
	    textField_1.setColumns(10);
	    
	    btnNewButton.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnNewButton.setBackground(new Color(8,126,139));
	    btnNewButton.setForeground(new Color(194,236,235));
	    
	    
	    btnOtkai.setForeground(new Color(194, 236, 235));
	    btnOtkai.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnOtkai.setBackground(new Color(255,90,95));
	    
	    
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGap(189)
	    			.addComponent(logopoc, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(184, Short.MAX_VALUE))
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGap(310)
	    			.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addGap(305))
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGap(236)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(10)
	    					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(btnOtkai, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(237, Short.MAX_VALUE))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGap(79)
	    			.addComponent(logopoc, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(lblNewLabel_1)
	    				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(btnNewButton)
	    				.addComponent(btnOtkai))
	    			.addContainerGap(151, Short.MAX_VALUE))
	    );
	    panel.setLayout(gl_panel);
		
	}
}
