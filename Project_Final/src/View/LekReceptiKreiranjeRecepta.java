package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.Icon;
import javax.swing.JRadioButton;

public class LekReceptiKreiranjeRecepta extends JPanel{
	
	public JLabel listar = new JLabel("Lista recepata");
	public JLabel pretragar = new JLabel("Pretraga recepata");
	public JLabel kreiranjer = new JLabel("<HTML><U>Kreiranje recepta</U></HTML>");
	
	public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
	public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
	
	private JTextField jmbg;
	private JTextField datum;
	private JTextField sifralek;
	private JTextField kolicina;
	private JTextField vreme;
	private JTextField sifralekar;
	private JTextField cena;
	private JTextField sifrarec;
	
	String idulog = new String("");
	String kojilek = new String("");
	float koliko = 0;
	
	float ukup;
	int suma = 0;
	
	public JButton izlog = new JButton("Izloguj se");
	
public LekReceptiKreiranjeRecepta() {
		
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
	    lblNewLabel.setForeground(new Color(8, 126, 139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    
	   
	    listar.setHorizontalAlignment(SwingConstants.CENTER);
	    listar.setForeground(new Color(8, 126, 139));
	    listar.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    
	    pretragar.setHorizontalAlignment(SwingConstants.CENTER);
	    pretragar.setForeground(new Color(8, 126, 139));
	    pretragar.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    
	    kreiranjer.setHorizontalAlignment(SwingConstants.CENTER);
	    kreiranjer.setForeground(new Color(8, 126, 139));
	    kreiranjer.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1 = new JLabel("JMBG pacijenta");
	    lekovitx_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    jmbg = new JTextField();
	    jmbg.setColumns(10);
	    
	    datum = new JTextField();
	    datum.setColumns(10);
	    
	    JLabel lekovitx_1_2_1_1 = new JLabel("Datum izdavanja recepta");
	    lekovitx_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2 = new JLabel("Sifra leka");
	    lekovitx_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    sifralek = new JTextField();
	    sifralek.setColumns(10);
	    
	    JLabel lekovitx_1_2_1_1_1 = new JLabel("Kolicina");
	    lekovitx_1_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    kolicina = new JTextField();
	    kolicina.setColumns(10);
	    
	    JButton kreiraj = new JButton("Kreiraj");
	    kreiraj.setForeground(new Color(194, 236, 235));
	    kreiraj.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    kreiraj.setBackground(new Color(8, 126, 139));
	    
	    JButton otkazi = new JButton("Otkazi");
	    otkazi.setForeground(new Color(194, 236, 235));
	    otkazi.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    otkazi.setBackground(new Color(255, 90, 95));
	    
	    vreme = new JTextField();
	    vreme.setColumns(10);
	    
	    JLabel lekovitx_1_2_1_1_2 = new JLabel("Vreme kreiranja recepta");
	    lekovitx_1_2_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_2 = new JLabel("Sifra lekara");
	    lekovitx_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    sifralekar = new JTextField();
	    sifralekar.setEditable(false);
	    sifralekar.setColumns(10);
	    
	    JLabel lekovitx_1_2_2_2 = new JLabel("Cena");
	    lekovitx_1_2_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_2_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_2_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    cena = new JTextField();
	    cena.setEditable(false);
	    cena.setColumns(10);
	    
	    JLabel lekovitx_1_2_2_1 = new JLabel("Sifra recepta");
	    lekovitx_1_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    sifrarec = new JTextField();
	    sifrarec.setEditable(false);
	    sifrarec.setColumns(10);
	    
	    
	    izlog.setForeground(new Color(194, 236, 235));
	    izlog.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    izlog.setBackground(new Color(8, 126, 139));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
	    							.addComponent(izlog, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(listar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(pretragar, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(kreiranjer, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(90)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
	    							.addGap(4)
	    							.addComponent(jmbg, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    							.addGroup(gl_panel_2.createSequentialGroup()
	    								.addComponent(lekovitx_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
	    								.addGap(4)
	    								.addComponent(vreme, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(gl_panel_2.createSequentialGroup()
	    								.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(datum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(gl_panel_2.createSequentialGroup()
	    								.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
	    								.addGap(4)
	    								.addComponent(sifralek, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(gl_panel_2.createSequentialGroup()
	    								.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(kolicina, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
	    								.addGap(41))
	    							.addGroup(gl_panel_2.createSequentialGroup()
	    								.addComponent(lekovitx_1_2_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
	    								.addGap(4)
	    								.addComponent(sifralekar, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    									.addGroup(gl_panel_2.createSequentialGroup()
	    										.addComponent(kreiraj, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    										.addGap(6)
	    										.addComponent(otkazi, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
	    									.addGroup(gl_panel_2.createSequentialGroup()
	    										.addComponent(lekovitx_1_2_2_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
	    										.addGap(4)
	    										.addComponent(cena, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
	    								.addGroup(gl_panel_2.createSequentialGroup()
	    									.addComponent(lekovitx_1_2_2_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
	    									.addGap(4)
	    									.addComponent(sifrarec, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))))))
	    			.addContainerGap())
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(izlog)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    					.addGap(6)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(listar, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(pretragar, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(kreiranjer, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    					.addGap(61)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(jmbg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addGap(6)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(datum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(vreme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(sifralek, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(kolicina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(sifralekar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(sifrarec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addGap(44)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lekovitx_1_2_2_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(cena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(kreiraj)
	    						.addComponent(otkazi))))
	    			.addContainerGap(87, Short.MAX_VALUE))
	    );
	    panel_2.setLayout(gl_panel_2);
	    panel.setLayout(gl_panel);
	    
	    Cuvanje.Ulogovan = Cuvanje.UcitajKorisnike("ulogovan.txt");
	    Cuvanje.Lekovi = Cuvanje.UcitajLekove("lekovi.txt");
	    
	    for(int i=0; i<Cuvanje.Ulogovan.size(); i++) {
	    		
				idulog = "" + (Cuvanje.Ulogovan.get(i).getIdkorisnika().intValue());
				
	    }
	    
	    Lek novi = new Lek();
	    novi.setSifraleka(sifralek.getText());
	    
	    
	    
	   
		
	    
	    for(int i=0; i<Cuvanje.Recepti.size(); i++) {
    		
	    	suma = i;
			
        }
	    suma++;
	    
	    
	    DocumentListener dl = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateFieldState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateFieldState();
            }

            private void updateFieldState() {
            	
            	Runnable doUpdateFieldState = new Runnable() {
            		 @Override
            	     public void run() {	
            			 if(kolicina.getText().equals("")) kolicina.setText("1");
            	
            			 for(int i=0; i<Cuvanje.Lekovi.size(); i++) {
            		
            				 if (Cuvanje.Lekovi.get(i).getSifraleka().equals(sifralek.getText())) {
            					 kojilek = (Cuvanje.Lekovi.get(i).getNazivleka());
            					 koliko = (Cuvanje.Lekovi.get(i).getCena());
            					 System.out.println(koliko);
            				 }
                	
            			 }
            			 if(kolicina.getText().equals("")||sifralek.getText().equals("")) {
            				 cena.setText("");
            			 }else {
            				 ukup = (koliko)*Float.parseFloat(kolicina.getText());
            				 String text = String.valueOf(ukup);
            				 cena.setText(text);
            				 System.out.println("ovo "+ukup);
            			 }
            		 }		
            	};
	    
            	SwingUtilities.invokeLater(doUpdateFieldState);
            }
	    };
        sifralek.getDocument().addDocumentListener(dl);
	    kolicina.getDocument().addDocumentListener(dl);
	    suma++;
	    String svi=String.valueOf(suma);
	    sifralekar.setText(idulog);
	    sifrarec.setText(svi);
	    
	    kreiraj.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				Recept r = new Recept();

				r.setSifrarecepta(sifrarec.getText());
		        r.setIdlekara(Float.parseFloat(idulog));
		        r.setJmbgpac(jmbg.getText());
		        r.setDatum(datum.getText());
		        r.setVreme(vreme.getText());  
		        
		        r.setNazivleka(kojilek);
		        r.setKolicina(Float.parseFloat(kolicina.getText()));
		        r.setUkupnacena(Float.parseFloat(cena.getText()));
				
				Cuvanje.Recepti.add(r);
				Cuvanje.SacuvajRecepte("recepti.txt", Cuvanje.Recepti);
				
				suma++;
				String svi=String.valueOf(suma);
				jmbg.setText("");
				datum.setText("");
				vreme.setText("");
				sifralek.setText("");
				kolicina.setText("1");
				cena.setText("");
				sifrarec.setText(svi);
			}
			
			public void mouseEntered(MouseEvent e){
				kreiraj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
	    
	    otkazi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sifrarec.setText("");
				sifralekar.setText("");
				jmbg.setText("");
				datum.setText("");
				vreme.setText("");
				sifralek.setText("");
				kolicina.setText("");
				cena.setText("");
			}
		});
		
	}
}
