
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

public class ApoProdajaSifraLeka extends JPanel{
	private JTextField textField;
	
	public JLabel listar = new JLabel("Predji na siftu recepta");
	
public ApoProdajaSifraLeka() {
		
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
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(new Color(8, 126, 139));
	    
	    JLabel lekovitx_1_1_2_1 = new JLabel("Sifra leka");
	    lekovitx_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    
	    JButton btnTrazi = new JButton("Dodaj");
	    btnTrazi.setForeground(new Color(194, 236, 235));
	    btnTrazi.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnTrazi.setBackground(new Color(8, 126, 139));
	    
	    JLabel lblNewLabel = new JLabel("PRODAJA");
	    lblNewLabel.setForeground(new Color(8, 126, 139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    
	   
	    listar.setHorizontalAlignment(SwingConstants.LEFT);
	    listar.setForeground(new Color(8, 126, 139));
	    listar.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1_2_1_1 = new JLabel("Ukupna cena:");
	    lekovitx_1_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_1_2_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lblNewLabel_1 = new JLabel("cdcdcdcdcdcdc");
	    lblNewLabel_1.setOpaque(true);
	    lblNewLabel_1.setForeground(Color.WHITE);
	    lblNewLabel_1.setBackground(Color.WHITE);
	    
	    JButton btnPotvrdi = new JButton("Potvrdi");
	    btnPotvrdi.setForeground(new Color(194, 236, 235));
	    btnPotvrdi.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnPotvrdi.setBackground(new Color(8, 126, 139));
	    
	    JButton btnOtkai = new JButton("Otkazi");
	    btnOtkai.setForeground(new Color(194, 236, 235));
	    btnOtkai.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnOtkai.setBackground(new Color(255, 90, 95));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblNewLabel)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
	    						.addComponent(listar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    						.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
	    							.addComponent(lekovitx_1_1_2_1)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(btnTrazi, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    		.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
	    			.addContainerGap(297, Short.MAX_VALUE)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(lekovitx_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
	    					.addGap(10)
	    					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(btnPotvrdi, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    					.addGap(6)
	    					.addComponent(btnOtkai, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
	    			.addGap(33))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnTrazi))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(listar, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(2)
	    					.addComponent(lekovitx_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(btnPotvrdi)
	    				.addComponent(btnOtkai))
	    			.addGap(59))
	    );
	    
	    JLabel tabelanaz = new JLabel("Naziv");
	    tabelanaz.setHorizontalAlignment(SwingConstants.LEFT);
	    tabelanaz.setForeground(new Color(194,236,235));
	    tabelanaz.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
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
	    GroupLayout gl_panel_4 = new GroupLayout(panel_4);
	    gl_panel_4.setHorizontalGroup(
	    	gl_panel_4.createParallelGroup(Alignment.LEADING)
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
	    panel_2.setLayout(gl_panel_2);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBorder(null);
	    panel_1.setBackground(new Color(11, 57, 84));
	    
	    JLabel korisnici = new JLabel(new ImageIcon("Images\\medical2.png"));
	    korisnici.setText("");
	    korisnici.setBackground((Color) null);
	    
	    JLabel korisnicitx = new JLabel("Prodaja");
	    korisnicitx.setHorizontalAlignment(SwingConstants.CENTER);
	    korisnicitx.setForeground(new Color(8, 126, 139));
	    korisnicitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
	    recepti.setText("");
	    recepti.setBackground((Color) null);
	    
	    JLabel receptitx = new JLabel("Recepti");
	    receptitx.setHorizontalAlignment(SwingConstants.CENTER);
	    receptitx.setForeground(new Color(8, 126, 139));
	    receptitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
	    lekovi.setText("");
	    lekovi.setBackground((Color) null);
	    
	    JLabel lekovitx = new JLabel("Lekovi");
	    lekovitx.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx.setForeground(new Color(8, 126, 139));
	    lekovitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel logomeni = new JLabel(new ImageIcon("Images\\medicine2.png"));
	    logomeni.setText("");
	    logomeni.setBackground((Color) null);
	    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	    gl_panel_1.setHorizontalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 130, Short.MAX_VALUE)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addGap(20)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addGap(20)
	    					.addComponent(korisnici, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(korisnicitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addGap(20)
	    					.addComponent(recepti, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(receptitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    					.addGroup(gl_panel_1.createSequentialGroup()
	    						.addComponent(lekovi, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    						.addGap(20))
	    					.addComponent(lekovitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    					.addComponent(logomeni, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(20, Short.MAX_VALUE))
	    );
	    gl_panel_1.setVerticalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 490, Short.MAX_VALUE)
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
	    			.addGap(18)
	    			.addComponent(korisnici, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(korisnicitx)
	    			.addContainerGap(178, Short.MAX_VALUE))
	    );
	    panel_1.setLayout(gl_panel_1);
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    panel.setLayout(gl_panel);
		
	}
}
