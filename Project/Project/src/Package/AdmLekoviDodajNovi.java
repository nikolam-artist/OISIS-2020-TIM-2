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

public class AdmLekoviDodajNovi extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public JLabel listal = new JLabel("Lista lekova");
	public JLabel pretragal = new JLabel("Pretraga lekova");
	public JLabel dodajl = new JLabel("<HTML><U>Dodaj novi</U></HTML>");
	public JLabel izmenil = new JLabel("Izmeni postojeci");
public AdmLekoviDodajNovi() {
		
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
	    JLabel logomeni = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\medicine2.png"));
	    logomeni.setText("");
	    logomeni.setBackground(null);
	    
	    JLabel lekovi = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\drugs2.png"));
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
	    
	    JLabel recepti = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\bill2.png"));
	    recepti.setText("");
	    recepti.setBackground((Color) null);
	    
	    JLabel korisnici = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\people2.png"));
	    korisnici.setText("");
	    korisnici.setBackground((Color) null);
	    
	    JLabel korisnicitx = new JLabel("Korisnici");
	    korisnicitx.setHorizontalAlignment(SwingConstants.CENTER);
	    korisnicitx.setForeground(new Color(8, 126, 139));
	    korisnicitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel izvestaj = new JLabel(new ImageIcon("C:\\Users\\eleon\\eclipse-workspace\\Project\\Images\\medical-prescription2.png"));
	    izvestaj.setText("");
	    izvestaj.setBackground((Color) null);
	    
	    JLabel lblIzvestaj = new JLabel("Izvestaj");
	    lblIzvestaj.setHorizontalAlignment(SwingConstants.CENTER);
	    lblIzvestaj.setForeground(new Color(8, 126, 139));
	    lblIzvestaj.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    
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
	    							.addComponent(receptitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    							.addGroup(gl_panel_1.createSequentialGroup()
	    								.addGap(20)
	    								.addComponent(korisnici, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    							.addComponent(korisnicitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    								.addGroup(gl_panel_1.createSequentialGroup()
	    									.addComponent(izvestaj, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    									.addGap(19))
	    								.addComponent(lblIzvestaj, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))))))
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
	    			.addGap(18)
	    			.addComponent(korisnici, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(korisnicitx)
	    			.addGap(18)
	    			.addComponent(izvestaj, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblIzvestaj)
	    			.addContainerGap(105, Short.MAX_VALUE))
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
	    
	    JLabel lblNewLabel = new JLabel("LEKOVI");
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    lblNewLabel.setForeground(new Color(8,126,139));
	    
	    listal.setHorizontalAlignment(SwingConstants.CENTER);
	    listal.setForeground(new Color(8, 126, 139));
	    listal.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    pretragal.setHorizontalAlignment(SwingConstants.CENTER);
	    pretragal.setForeground(new Color(8, 126, 139));
	    pretragal.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    dodajl.setHorizontalAlignment(SwingConstants.CENTER);
	    dodajl.setForeground(new Color(8, 126, 139));
	    dodajl.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    izmenil.setHorizontalAlignment(SwingConstants.CENTER);
	    izmenil.setForeground(new Color(8, 126, 139));
	    izmenil.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2 = new JLabel("Proizvodjac");
	    lekovitx_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1 = new JLabel("Naziv");
	    lekovitx_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1 = new JLabel("Sifra");
	    lekovitx_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1_1 = new JLabel("Cena");
	    lekovitx_1_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    
	    textField_3 = new JTextField();
	    textField_3.setColumns(10);
	    
	    JButton btnNewButton = new JButton("Kreiraj");
	    btnNewButton.setForeground(new Color(194, 236, 235));
	    btnNewButton.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnNewButton.setBackground(new Color(8, 126, 139));
	    
	    JButton btnOtkai = new JButton("Otkazi");
	    btnOtkai.setForeground(new Color(194, 236, 235));
	    btnOtkai.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnOtkai.setBackground(new Color(255, 90, 95));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    								.addGroup(gl_panel_2.createSequentialGroup()
	    									.addComponent(listal, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    									.addPreferredGap(ComponentPlacement.RELATED)
	    									.addComponent(pretragal, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
	    								.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    								.addGroup(gl_panel_2.createSequentialGroup()
	    									.addComponent(dodajl, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
	    									.addPreferredGap(ComponentPlacement.RELATED)
	    									.addComponent(izmenil, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
	    								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(150)
	    					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    					.addGap(6)
	    					.addComponent(btnOtkai, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(109, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(listal)
	    				.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    					.addComponent(pretragal, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addComponent(dodajl, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addComponent(izmenil, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
	    			.addGap(81)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(btnNewButton)
	    				.addComponent(btnOtkai))
	    			.addContainerGap(202, Short.MAX_VALUE))
	    );
	    panel_2.setLayout(gl_panel_2);
	    panel.setLayout(gl_panel);
		
	}
}
