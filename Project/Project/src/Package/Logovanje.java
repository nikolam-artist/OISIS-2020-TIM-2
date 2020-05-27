package Package;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Logovanje extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logovanje frame = new Logovanje();
					frame.setVisible(true);
					frame.setSize(700, 500);
					ImageIcon logoicon = new ImageIcon("logoicon.png");
					Image logo = logoicon.getImage();
					frame.setIconImage(logo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Logovanje() {
		setResizable(false);
		setTitle("Logovanje u sistem");
		setFont(new Font("Montserrat", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(194,236,235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(194,236,235));
		contentPane.add(panel, BorderLayout.CENTER);
		
		ImageIcon imageIcon = new ImageIcon("logoicon2.png");
	    JLabel logopoc = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\logoicon2.png"));
	    logopoc.setText("");
	    
	    JLabel lblNewLabel = new JLabel("PRIJAVA");
	    lblNewLabel.setForeground(new Color(8,126,139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1 = new JLabel("Korisničko ime");
	    lblNewLabel_1.setForeground(new Color(8,126,139));
	    lblNewLabel_1.setFont(new Font("Montserrat", Font.PLAIN, 12));
	    
	    JLabel lblNewLabel_1_1 = new JLabel("Lozinka");
	    lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_1_1.setForeground(new Color(8, 126, 139));
	    lblNewLabel_1_1.setFont(new Font("Montserrat", Font.PLAIN, 12));
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    
	    JButton btnNewButton = new JButton("Potvrdi");
	    btnNewButton.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnNewButton.setBackground(new Color(8,126,139));
	    btnNewButton.setForeground(new Color(194,236,235));
	    
	    JButton btnOtkai = new JButton("Otkaži");
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
