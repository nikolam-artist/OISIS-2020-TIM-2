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

public class LekReceptiPrikazSvih extends JPanel{
	
	public JLabel listar = new JLabel("<HTML><U>Lista recepata</U></HTML>");
	public JLabel pretragar = new JLabel("Pretraga recepata");
	public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
	
	public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
	
public LekReceptiPrikazSvih() {
		
		this.setBackground(new Color(194,236,235));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setthis(this);
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(194,236,235));
		this.add(panel, BorderLayout.CENTER);
		
		ImageIcon imageIcon = new ImageIcon("logoicon2.png");
	   
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(194,236,235));
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(11,57,84));
	    
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
	    				.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 491, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    JPanel panel_1 = new JPanel();
	    panel_1.setBorder(null);
	    panel_1.setOpaque(false);
	    JLabel logomeni = new JLabel(new ImageIcon("Images\\medicine2.png"));
	    logomeni.setText("");
	    logomeni.setBackground(null);
	    
	    
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
	    
	    
	    recepti.setText("");
	    recepti.setBackground((Color) null);
	    
	    
	    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	    gl_panel_1.setHorizontalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addGap(41)
	    					.addComponent(lekovi, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
	    					.addGroup(gl_panel_1.createSequentialGroup()
	    						.addGap(21)
	    						.addComponent(lekovitx, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    					.addGroup(gl_panel_1.createSequentialGroup()
	    						.addGap(19)
	    						.addComponent(logomeni, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
	    					.addGroup(gl_panel_1.createSequentialGroup()
	    						.addContainerGap()
	    						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
	    							.addGroup(gl_panel_1.createSequentialGroup()
	    								.addGap(20)
	    								.addComponent(recepti, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    							.addComponent(receptitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))))
	    			.addContainerGap())
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
	    GroupLayout gl_panel_3 = new GroupLayout(panel_3);
	    gl_panel_3.setHorizontalGroup(
	    	gl_panel_3.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_3.createSequentialGroup()
	    			.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    gl_panel_3.setVerticalGroup(
	    	gl_panel_3.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_3.createSequentialGroup()
	    			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(89, Short.MAX_VALUE))
	    );
	    panel_3.setLayout(gl_panel_3);
	    
	    JLabel lblNewLabel = new JLabel("RECEPTI");
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    lblNewLabel.setForeground(new Color(8,126,139));
	    
	    
	    listar.setHorizontalAlignment(SwingConstants.CENTER);
	    listar.setForeground(new Color(8, 126, 139));
	    listar.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    
	    pretragar.setHorizontalAlignment(SwingConstants.CENTER);
	    pretragar.setForeground(new Color(8, 126, 139));
	    pretragar.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1_2 = new JLabel("Sortiraj po:");
	    lekovitx_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("Sifra");
	    rdbtnNewRadioButton.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    rdbtnNewRadioButton.setForeground(new Color(8, 126, 139));
	    rdbtnNewRadioButton.setOpaque(false);
	    
	    JRadioButton rdbtnProizvodjac = new JRadioButton("Lekar");
	    rdbtnProizvodjac.setOpaque(false);
	    rdbtnProizvodjac.setForeground(new Color(8, 126, 139));
	    rdbtnProizvodjac.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JRadioButton rdbtnCena = new JRadioButton("Datum");
	    rdbtnCena.setOpaque(false);
	    rdbtnCena.setForeground(new Color(8, 126, 139));
	    rdbtnCena.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(new Color(8, 126, 139));
	    
	    JLabel lblKreiranjeRecepta = new JLabel("Kreiranje recepta");
	    lblKreiranjeRecepta.setHorizontalAlignment(SwingConstants.CENTER);
	    lblKreiranjeRecepta.setForeground(new Color(8, 126, 139));
	    lblKreiranjeRecepta.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblNewLabel)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(listar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(pretragar)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblKreiranjeRecepta, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(175, Short.MAX_VALUE))
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lekovitx_1_1_2)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(rdbtnNewRadioButton)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(rdbtnProizvodjac)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(rdbtnCena)))
	    			.addContainerGap())
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(listar, 0, 0, Short.MAX_VALUE)
	    				.addComponent(pretragar, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblKreiranjeRecepta, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lekovitx_1_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(rdbtnNewRadioButton)
	    				.addComponent(rdbtnProizvodjac, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(rdbtnCena, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    			.addGap(335))
	    );
	    
	    JLabel tabelanaz = new JLabel("Sifra");
	    tabelanaz.setHorizontalAlignment(SwingConstants.LEFT);
	    tabelanaz.setForeground(new Color(194,236,235));
	    tabelanaz.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblSifra = new JLabel("Lekar");
	    lblSifra.setHorizontalAlignment(SwingConstants.LEFT);
	    lblSifra.setForeground(new Color(194, 236, 235));
	    lblSifra.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblProizvodjac = new JLabel("Datum i vreme");
	    lblProizvodjac.setHorizontalAlignment(SwingConstants.LEFT);
	    lblProizvodjac.setForeground(new Color(194, 236, 235));
	    lblProizvodjac.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblNaRecept = new JLabel("Pacijent");
	    lblNaRecept.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNaRecept.setForeground(new Color(194, 236, 235));
	    lblNaRecept.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblCena = new JLabel("Lek");
	    lblCena.setHorizontalAlignment(SwingConstants.LEFT);
	    lblCena.setForeground(new Color(194, 236, 235));
	    lblCena.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    GroupLayout gl_panel_4 = new GroupLayout(panel_4);
	    gl_panel_4.setHorizontalGroup(
	    	gl_panel_4.createParallelGroup(Alignment.LEADING)
	    		.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(tabelanaz)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblSifra, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblProizvodjac)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(lblNaRecept, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(lblCena, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    			.addGap(38))
	    );
	    gl_panel_4.setVerticalGroup(
	    	gl_panel_4.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_4.createSequentialGroup()
	    			.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(tabelanaz, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
	    				.addComponent(lblSifra, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblProizvodjac, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNaRecept, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblCena, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	    			.addGap(38))
	    );
	    panel_4.setLayout(gl_panel_4);
	    panel_2.setLayout(gl_panel_2);
	    panel.setLayout(gl_panel);
		
	    
	    
	}
}
