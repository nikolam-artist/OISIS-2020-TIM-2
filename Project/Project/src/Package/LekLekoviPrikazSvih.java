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
import javax.swing.Icon;
import javax.swing.JRadioButton;

public class LekLekoviPrikazSvih extends JPanel{
public LekLekoviPrikazSvih() {
		
		this.setBackground(new Color(194,236,235));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setthis(this);
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(194,236,235));
		this.add(panel, BorderLayout.CENTER);
		
		ImageIcon imageIcon = new ImageIcon("logoicon2.png");
	    JPanel panel_1 = new JPanel();
	    panel_1.setBorder(null);
	    panel_1.setBackground(new Color(11,57,84));
	    JLabel logomeni = new JLabel(new ImageIcon("Images\\medicine2.png"));
	    logomeni.setText("");
	    logomeni.setBackground(null);
	    
	    JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
	    lekovi.setText("");
	    lekovi.setBackground((Color) null);
	    
	    JLabel lekovitx = new JLabel("Lekovi");
	    lekovitx.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx.setForeground(new Color(8,126,139));
	    lekovitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel receptitx = new JLabel("Recepti");
	    receptitx.setHorizontalAlignment(SwingConstants.CENTER);
	    receptitx.setForeground(new Color(8, 126, 139));
	    receptitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
	    recepti.setText("");
	    recepti.setBackground((Color) null);
	    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	    gl_panel_1.setHorizontalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
	    			.addGap(19)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addGap(20)
	    					.addComponent(recepti, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(receptitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    					.addGroup(gl_panel_1.createSequentialGroup()
	    						.addComponent(lekovi, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    						.addGap(20))
	    					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    						.addComponent(lekovitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(logomeni, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
	    			.addContainerGap(21, Short.MAX_VALUE))
	    );
	    gl_panel_1.setVerticalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(logomeni, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lekovi, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lekovitx)
	    			.addGap(18)
	    			.addComponent(recepti, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(receptitx)
	    			.addContainerGap(251, Short.MAX_VALUE))
	    );
	    panel_1.setLayout(gl_panel_1);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(194, 236, 235));
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(new Color(8, 126, 139));
	    
	    JLabel lblSifra = new JLabel("Sifra");
	    lblSifra.setHorizontalAlignment(SwingConstants.LEFT);
	    lblSifra.setForeground(new Color(194, 236, 235));
	    lblSifra.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblProizvodjac = new JLabel("Proizvodjac");
	    lblProizvodjac.setHorizontalAlignment(SwingConstants.LEFT);
	    lblProizvodjac.setForeground(new Color(194, 236, 235));
	    lblProizvodjac.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblNaRecept = new JLabel("Na recept");
	    lblNaRecept.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNaRecept.setForeground(new Color(194, 236, 235));
	    lblNaRecept.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblCena = new JLabel("Cena");
	    lblCena.setHorizontalAlignment(SwingConstants.LEFT);
	    lblCena.setForeground(new Color(194, 236, 235));
	    lblCena.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel tabelanaz = new JLabel("Naziv");
	    tabelanaz.setHorizontalAlignment(SwingConstants.LEFT);
	    tabelanaz.setForeground(new Color(194, 236, 235));
	    tabelanaz.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    GroupLayout gl_panel_4 = new GroupLayout(panel_4);
	    gl_panel_4.setHorizontalGroup(
	    	gl_panel_4.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 538, Short.MAX_VALUE)
	    		.addGroup(gl_panel_4.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(tabelanaz, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblSifra)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblProizvodjac, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNaRecept)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblCena, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    gl_panel_4.setVerticalGroup(
	    	gl_panel_4.createParallelGroup(Alignment.TRAILING)
	    		.addGap(0, 32, Short.MAX_VALUE)
	    		.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
	    			.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(tabelanaz, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
	    				.addComponent(lblCena, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNaRecept, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblProizvodjac, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblSifra, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	    			.addGap(38))
	    );
	    panel_4.setLayout(gl_panel_4);
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("Naziv");
	    rdbtnNewRadioButton.setOpaque(false);
	    rdbtnNewRadioButton.setForeground(new Color(8, 126, 139));
	    rdbtnNewRadioButton.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JRadioButton rdbtnProizvodjac = new JRadioButton("Proizvodjac");
	    rdbtnProizvodjac.setOpaque(false);
	    rdbtnProizvodjac.setForeground(new Color(8, 126, 139));
	    rdbtnProizvodjac.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JRadioButton rdbtnCena = new JRadioButton("Cena");
	    rdbtnCena.setOpaque(false);
	    rdbtnCena.setForeground(new Color(8, 126, 139));
	    rdbtnCena.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblNewLabel = new JLabel("LEKOVI");
	    lblNewLabel.setForeground(new Color(8, 126, 139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    
	    JLabel lekovitx_1 = new JLabel("<HTML><U>Lista lekova</U></HTML>");
	    lekovitx_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1 = new JLabel("Pretraga lekova");
	    lekovitx_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1_2 = new JLabel("Sortiraj po:");
	    lekovitx_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(rdbtnNewRadioButton)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(rdbtnProizvodjac)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(rdbtnCena))
	    				.addComponent(lblNewLabel)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(lekovitx_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lekovitx_1_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(lekovitx_1_1_2))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lekovitx_1)
	    				.addComponent(lekovitx_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lekovitx_1_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(rdbtnNewRadioButton)
	    				.addComponent(rdbtnProizvodjac, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(rdbtnCena, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(335, Short.MAX_VALUE))
	    );
	    panel_2.setLayout(gl_panel_2);
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 491, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    panel.setLayout(gl_panel);
		
	}
}
