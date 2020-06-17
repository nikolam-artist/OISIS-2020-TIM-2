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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
import javax.swing.table.DefaultTableModel;


import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class ApoLekoviIzmeniPostojeci extends JPanel{
	private JTextField sifra;
	private JTextField naziv;
	private JTextField proizv;
	private JTextField cena;
	
	public JLabel listal = new JLabel("Lista lekova");
	public JLabel dodajl = new JLabel("Dodaj novi");
	public JLabel izmenil = new JLabel("<HTML><U>Izmeni postojeci</U></HTML>");
	
	public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
    public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
    public JLabel prodaja = new JLabel(new ImageIcon("Images\\medical2.png"));
    
    Lek novi = new Lek();
    Lek sad = new Lek();
    int pro = 0;
    int svi = 0;
public ApoLekoviIzmeniPostojeci() {
		
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
	    
	    JLabel lblNewLabel = new JLabel("LEKOVI");
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    lblNewLabel.setForeground(new Color(8,126,139));
	    
	    listal.setHorizontalAlignment(SwingConstants.CENTER);
	    listal.setForeground(new Color(8, 126, 139));
	    listal.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
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
	    
	    JLabel lekovitx_1_2_1 = new JLabel("Sifra");
	    lekovitx_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1 = new JLabel("Naziv");
	    lekovitx_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_2_1_1_1 = new JLabel("Cena");
	    lekovitx_1_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_2_1_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_2_1_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    sifra = new JTextField();
	    sifra.setColumns(10);
	    
	    naziv = new JTextField();
	    naziv.setColumns(10);
	    
	    proizv = new JTextField();
	    proizv.setColumns(10);
	    
	    cena = new JTextField();
	    cena.setColumns(10);
	    
	    JButton izmeni = new JButton("Izmeni");
	    izmeni.setForeground(new Color(194, 236, 235));
	    izmeni.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    izmeni.setBackground(new Color(8, 126, 139));
	    
	    JButton otkazi = new JButton("Otkazi");
	    otkazi.setForeground(new Color(194, 236, 235));
	    otkazi.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    otkazi.setBackground(new Color(255, 90, 95));
	    
	    
	    JLabel lekovitx = new JLabel("<html><body>Nakon unete sifre leka unesite nove vrednosti stavki.</body></html>");
	    lekovitx.setHorizontalAlignment(SwingConstants.LEFT);
	    lekovitx.setForeground(new Color(8,126,139));
	    lekovitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    JCheckBox narecept = new JCheckBox("Na recept");
	    narecept.setForeground(new Color(8, 126, 139));
	    narecept.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    narecept.setBackground(new Color(194, 236, 235));
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
	    							.addComponent(listal, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(dodajl, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(izmenil, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(116)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    						.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(cena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(narecept, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    							.addComponent(sifra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addComponent(naziv, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    						.addComponent(proizv, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lekovitx))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(153)
	    					.addComponent(izmeni, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    					.addGap(6)
	    					.addComponent(otkazi, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
	    			.addGap(117))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(listal)
	    				.addComponent(dodajl, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(izmenil, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lekovitx)
	    			.addGap(61)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(sifra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lekovitx_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(naziv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(proizv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lekovitx_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(cena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(narecept, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
	    			.addGap(24)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(izmeni)
	    				.addComponent(otkazi))
	    			.addContainerGap(129, Short.MAX_VALUE))
	    );
	    panel_2.setLayout(gl_panel_2);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBorder(null);
	    panel_1.setBackground(new Color(11, 57, 84));
	    
	    prodaja.setText("");
	    prodaja.setBackground((Color) null);
	    
	    JLabel korisnicitx = new JLabel("Prodaja");
	    korisnicitx.setHorizontalAlignment(SwingConstants.CENTER);
	    korisnicitx.setForeground(new Color(8, 126, 139));
	    korisnicitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    recepti.setText("");
	    recepti.setBackground((Color) null);
	    
	    JLabel receptitx = new JLabel("Recepti");
	    receptitx.setHorizontalAlignment(SwingConstants.CENTER);
	    receptitx.setForeground(new Color(8, 126, 139));
	    receptitx.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    lekovi.setText("");
	    lekovi.setBackground((Color) null);
	    
	    JLabel lekovitx_1 = new JLabel("Lekovi");
	    lekovitx_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
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
	    					.addComponent(prodaja, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(korisnicitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addGap(20)
	    					.addComponent(recepti, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(receptitx, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    					.addGroup(gl_panel_1.createSequentialGroup()
	    						.addComponent(lekovi, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    						.addGap(20))
	    					.addComponent(lekovitx_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
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
	    			.addComponent(lekovitx_1)
	    			.addGap(18)
	    			.addComponent(recepti, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(receptitx)
	    			.addGap(18)
	    			.addComponent(prodaja, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
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
	    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
	    			.addGap(22))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 479, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    panel.setLayout(gl_panel);
	    
	    Cuvanje.Lekovi = Cuvanje.UcitajLekove("lekovi.txt");
	    
	    sifra.setText("0");
	    svi = Cuvanje.Lekovi.size();
	    
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
            			
         				Lek stari = new Lek();
         				Lek por = new Lek();
         				
         				
         				for(int i=0; i<Cuvanje.Lekovi.size(); i++) { 
         					
         					novi.setSifraleka(sifra.getText());
         					if (Cuvanje.Lekovi.get(i).getSifraleka().equals(novi.getSifraleka())) {
         						stari.setSifraleka(Cuvanje.Lekovi.get(i).getSifraleka());
         						stari.setCena(Cuvanje.Lekovi.get(i).getCena());
         						stari.setNarecept(Cuvanje.Lekovi.get(i).getNarecept());
         						stari.setNazivleka(Cuvanje.Lekovi.get(i).getNazivleka());
         						stari.setProizvodjac(Cuvanje.Lekovi.get(i).getProizvodjac());
         						
         						por.setSifraleka(Cuvanje.Lekovi.get(i).getSifraleka());
         						por.setCena(Cuvanje.Lekovi.get(i).getCena());
         						por.setNarecept(Cuvanje.Lekovi.get(i).getNarecept());
         						por.setNazivleka(Cuvanje.Lekovi.get(i).getNazivleka());
         						por.setProizvodjac(Cuvanje.Lekovi.get(i).getProizvodjac());
         						
         						naziv.setText(stari.getNazivleka());
         						proizv.setText(stari.getProizvodjac());
         						cena.setText(String.valueOf(stari.getCena()));
         						
         						
         						
         					}
         					pro = 1;
         			    }

         				
         				if(pro==1) {
         		        	novi.setNazivleka(naziv.getText());		
         					novi.setProizvodjac(proizv.getText());
         					novi.setSifraleka(sifra.getText());
         					novi.setCena(Float.parseFloat(cena.getText()));

         					
         					if(narecept.isSelected()) {
         						novi.setNarecept(true);
         					}else {
         						novi.setNarecept(false);
         					}
         		        }
         				
         				if(sifra.getText().equals("")||sifra.getText().equals("0")) {
         					naziv.setText("");
     						proizv.setText("");
     						cena.setText("");
         				}
         				if(sifra.getText().equals("")) {
         					sifra.setText("0");
         				}
         				
            		 }		
            	};

            	SwingUtilities.invokeLater(doUpdateFieldState);
            }
	    };
        sifra.getDocument().addDocumentListener(dl);
        
	    
        
        
	    izmeni.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				
				novi.setNazivleka(naziv.getText());		
				novi.setProizvodjac(proizv.getText());
				novi.setSifraleka(sifra.getText());
				novi.setCena(Float.parseFloat(cena.getText()));
				
				if(narecept.isSelected()) {
					novi.setNarecept(true);
				}else {
					novi.setNarecept(false);
				}
				
				for(int i=0; i<svi; i++) { 

                    if (Cuvanje.Lekovi.get(i).getSifraleka().equals(novi.getSifraleka())) {
                        Cuvanje.Lekovi.remove(i);
                         Cuvanje.Lekovi.add(novi);
                         Cuvanje.SacuvajLekove("lekovi.txt", Cuvanje.Lekovi);
                     }else{


                     }
				
				}
					
				naziv.setText("");
				sifra.setText("");
				proizv.setText("");
				cena.setText(null);
				narecept.setSelected(false);
			}
			
			public void mouseEntered(MouseEvent e){
				izmeni.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
	    
	    
	    
	    
	    otkazi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				naziv.setText("");
				sifra.setText("");
				proizv.setText("");
				cena.setText("");
				narecept.setSelected(false);
			}
		});
		
	}
}
