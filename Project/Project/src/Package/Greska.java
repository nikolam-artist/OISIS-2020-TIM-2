package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Greska extends JFrame{
public Greska() {
	setResizable(false);
	getContentPane().setBackground(new Color(194,236,235));
	
	JLabel lblNewLabel = new JLabel("GRESKA!");
	lblNewLabel.setForeground(new Color(255,90,95));
	lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 16));
	
	JLabel lblNePostojiRegistrivani = new JLabel("Ne postoji registrivani korisnik sa tim podacima.");
	lblNePostojiRegistrivani.setHorizontalAlignment(SwingConstants.CENTER);
	lblNePostojiRegistrivani.setForeground(new Color(8, 126, 139));
	lblNePostojiRegistrivani.setFont(new Font("Montserrat", Font.PLAIN, 12));
	GroupLayout groupLayout = new GroupLayout(getContentPane());
	groupLayout.setHorizontalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(119)
						.addComponent(lblNewLabel))
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblNePostojiRegistrivani, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
				.addContainerGap())
	);
	groupLayout.setVerticalGroup(
		groupLayout.createParallelGroup(Alignment.LEADING)
			.addGroup(groupLayout.createSequentialGroup()
				.addGap(64)
				.addComponent(lblNewLabel)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblNePostojiRegistrivani, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(81, Short.MAX_VALUE))
	);
	getContentPane().setLayout(groupLayout);
	Greska frame = new Greska();
	frame.setVisible(true);
	frame.setSize(400, 200);
	ImageIcon logoicon = new ImageIcon("logoicon.png");
	Image logo = logoicon.getImage();
	frame.setIconImage(logo);	
	}
}
