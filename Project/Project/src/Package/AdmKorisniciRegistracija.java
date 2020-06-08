package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
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

public class AdmKorisniciRegistracija extends JPanel{
	private JTextField imek;
	private JTextField prezk;
	private JTextField korime;
	private JTextField lozinka;
	
    public JLabel listak = new JLabel("Lista korisnika");
    public JLabel regi = new JLabel("<HTML><U>Registracija</U></HTML>");
    
    public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
    public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
    public JLabel korisnici = new JLabel(new ImageIcon("Images\\people2.png"));
    public JLabel izvestaj = new JLabel(new ImageIcon("Images\\medical-prescription2.png"));
    
public AdmKorisniciRegistracija() {
		
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
	    

	    korisnici.setText("");
	    korisnici.setBackground((Color) null);
	    
	    JLabel korisnicitx = new JLabel("Korisnici");
	    korisnicitx.setHorizontalAlignment(SwingConstants.CENTER);
	    korisnicitx.setForeground(new Color(8, 126, 139));
	    korisnicitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    

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
	    
	    JLabel lekovitx_1_2 = new JLabel("Korisnicko ime");
	    lekovitx_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1 = new JLabel("Ime korisnika");
	    lekovitx_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1 = new JLabel("Prezime korisnika");
	    lekovitx_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1_1 = new JLabel("Lozinka");
	    lekovitx_1_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    imek = new JTextField();
	    imek.setColumns(10);
	    
	    prezk = new JTextField();
	    prezk.setColumns(10);
	    
	    korime = new JTextField();
	    korime.setColumns(10);
	    
	    lozinka = new JTextField();
	    lozinka.setColumns(10);
	    
	    JButton kreiraj = new JButton("Kreiraj");
	    kreiraj.setForeground(new Color(194, 236, 235));
	    kreiraj.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    kreiraj.setBackground(new Color(8, 126, 139));
	    
	    JButton btnOtkai = new JButton("Otkazi");
	    btnOtkai.setForeground(new Color(194, 236, 235));
	    btnOtkai.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    btnOtkai.setBackground(new Color(255, 90, 95));
	    
	    JLabel lblNewLabel = new JLabel("KORISNICI");
	    lblNewLabel.setForeground(new Color(8, 126, 139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    
	    listak.setHorizontalAlignment(SwingConstants.CENTER);
	    listak.setForeground(new Color(8, 126, 139));
	    listak.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    regi.setHorizontalAlignment(SwingConstants.CENTER);
	    regi.setForeground(new Color(8, 126, 139));
	    regi.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1_1_1 = new JLabel("Tip");
	    lekovitx_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    ButtonGroup tip = new ButtonGroup();
	    
	    JRadioButton tipa = new JRadioButton("Apotekar");
	    tipa.setOpaque(false);
	    tipa.setForeground(new Color(8, 126, 139));
	    tipa.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JRadioButton tipl = new JRadioButton("Lekar");
	    tipl.setOpaque(false);
	    tipl.setForeground(new Color(8, 126, 139));
	    tipl.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    tip.add(tipa);
	    tip.add(tipl);
	    
	    JLabel lblkoristiceSePri = new JLabel("(Koristice se pri logovanju u sistem)");
	    lblkoristiceSePri.setHorizontalAlignment(SwingConstants.CENTER);
	    lblkoristiceSePri.setForeground(new Color(8, 126, 139));
	    lblkoristiceSePri.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JLabel lblkoristiceSePri_1 = new JLabel("<HTML><BODY>(Koristice se pri logovanju u sistem.<br>Koristiti slova A-Z i brojeve 0-9)</BODY></HTML>");
	    lblkoristiceSePri_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblkoristiceSePri_1.setForeground(new Color(8, 126, 139));
	    lblkoristiceSePri_1.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(listak, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
	    							.addGap(6)
	    							.addComponent(regi, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(28)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addGap(24)
	    							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
	    								.addComponent(lekovitx_1_2_1, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
	    								.addComponent(lekovitx_1_2_1_1, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
	    								.addComponent(lekovitx_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(lblkoristiceSePri)))
	    						.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblkoristiceSePri_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(lozinka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addGap(44))
	    						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    							.addComponent(imek, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
	    							.addComponent(prezk, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
	    							.addComponent(tipa, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
	    							.addComponent(tipl, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
	    							.addComponent(korime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
	    			.addGap(204))
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGap(150)
	    			.addComponent(kreiraj, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(btnOtkai, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(232, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(listak, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(regi, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addGap(71)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(imek, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(prezk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(tipa, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(tipl, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(korime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblkoristiceSePri))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(24)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lozinka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblkoristiceSePri_1)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(kreiraj)
	    				.addComponent(btnOtkai))
	    			.addContainerGap(117, Short.MAX_VALUE))
	    );
	    panel_2.setLayout(gl_panel_2);
	    panel.setLayout(gl_panel);
	    
	    
	    kreiraj.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				Korisnik k = new Korisnik();
				k.setImekorisnika(imek.getText());
				k.setKorisnickoime(korime.getText());
				k.setLozinka(lozinka.getText());
				k.setPrezimekorisnika(prezk.getText());
				if(tipa.isSelected()) {
					k.setTipkorisnika(TipKorisnika.APOTEKAR);
				}else {
					k.setTipkorisnika(TipKorisnika.LEKAR);
				}
				
				Cuvanje.Korisnici.add(k);
				Cuvanje.SacuvajKorisnike("korisnici.txt", Cuvanje.Korisnici);
			}
			
			public void mouseEntered(MouseEvent e){
				kreiraj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
	}
}
