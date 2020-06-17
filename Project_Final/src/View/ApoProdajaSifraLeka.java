
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
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.SortOrder;

public class ApoProdajaSifraLeka extends JPanel{
	private JTextField sifra;
	
	public JLabel prodajarec = new JLabel("Predji na siftu recepta");
	
	public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
    public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
    public JLabel prodaja = new JLabel(new ImageIcon("Images\\medical2.png"));
    private JTextField naziv;
	
    Lek novi = new Lek();
    Lek stari = new Lek();
    String narec = new String();
    JSpinner kolicina = new JSpinner();
    
    float ukupnacena = 0;
    private JTextField ukupno;
    
    String apoime = new String();
    String apoprez = new String();
    
    public JButton izlog = new JButton("Izloguj se");
    
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
	    
	    JLabel lekovitx_1_1_2_1 = new JLabel("Sifra leka");
	    lekovitx_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    sifra = new JTextField();
	    sifra.setColumns(5);
	    
	    JButton dodaj = new JButton("Dodaj");
	    dodaj.setForeground(new Color(194, 236, 235));
	    dodaj.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    dodaj.setBackground(new Color(8, 126, 139));
	    
	    JLabel lblNewLabel = new JLabel("PRODAJA");
	    lblNewLabel.setForeground(new Color(8, 126, 139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    
	   
	    prodajarec.setHorizontalAlignment(SwingConstants.LEFT);
	    prodajarec.setForeground(new Color(8, 126, 139));
	    prodajarec.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1_2_1_1 = new JLabel("Ukupna cena:");
	    lekovitx_1_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lekovitx_1_1_2_1_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2_1_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JButton kupi = new JButton("Potvrdi");
	    kupi.setForeground(new Color(194, 236, 235));
	    kupi.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    kupi.setBackground(new Color(8, 126, 139));
	    
	    JButton otkazi = new JButton("Otkazi");
	    otkazi.setForeground(new Color(194, 236, 235));
	    otkazi.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    otkazi.setBackground(new Color(255, 90, 95));
	    
	    naziv = new JTextField();
	    naziv.setEditable(false);
	    naziv.setColumns(10);
	    
	    
	    kolicina.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
	    Cuvanje.Lekovi = Cuvanje.UcitajLekove("lekovi.txt");
	  
	    


	    JTable table = new JTable(new DefaultTableModel(null, new Object[]{"Naziv", "Proizvodjac", "Sifra", "Na recept", "Cena"}));
	    
	    TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
	    table.setRowSorter(sorter);
	    
	    

	    List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
	    sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
	    sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
	    sorter.setSortKeys(sortKeys);
	   
	    
	    
	    JTableHeader header = table.getTableHeader();
	      header.setBackground(new Color(8,126,139));
	      header.setForeground(new Color(194,236,235));
	      header.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    
	    table.setShowVerticalLines(false);
	  
	    table.setForeground(new Color(8,126,139));
	    table.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    table.setBackground(new Color(194,236,235));
	    table.setFillsViewportHeight(true);
	    
	    
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    table.getColumnModel().getColumn(0).setPreferredWidth(178);
	    table.getColumnModel().getColumn(1).setPreferredWidth(190);
	    table.getColumnModel().getColumn(2).setPreferredWidth(35);
	    table.getColumnModel().getColumn(3).setPreferredWidth(70);
	    table.getColumnModel().getColumn(4).setPreferredWidth(54);

	    
	    
	   
	    
	    sifra.setText("0");
	    
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
            			
         				
         				Lek por = new Lek();
         				
         				
         				for(int i=0; i<Cuvanje.Lekovi.size(); i++) { 
         					
         					novi.setSifraleka(sifra.getText());
         					if (Cuvanje.Lekovi.get(i).getSifraleka().equals(novi.getSifraleka())) {
         						stari.setSifraleka(Cuvanje.Lekovi.get(i).getSifraleka());
         						stari.setCena(Cuvanje.Lekovi.get(i).getCena());
         						stari.setNarecept(Cuvanje.Lekovi.get(i).getNarecept());
         						stari.setNazivleka(Cuvanje.Lekovi.get(i).getNazivleka());
         						stari.setProizvodjac(Cuvanje.Lekovi.get(i).getProizvodjac());
         						
         						
         						naziv.setText(Cuvanje.Lekovi.get(i).getNazivleka());
         						kolicina.setValue(1);
         					}

         			    }


         				
         				if(sifra.getText().equals("")||sifra.getText().equals("0")) {
         					naziv.setText("");

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
	    
	    
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setViewportBorder(null);
	    scrollPane.getViewport().setBackground(new Color(194, 236, 235));
	    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    ukupno = new JTextField();
	    ukupno.setEditable(false);
	    ukupno.setColumns(10);
	    
	    
	    izlog.setForeground(new Color(194, 236, 235));
	    izlog.setFont(new Font("Montserrat", Font.PLAIN, 11));
	    izlog.setBackground(new Color(8, 126, 139));
        
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(lblNewLabel)
	    					.addPreferredGap(ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
	    					.addComponent(izlog, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
	    						.addComponent(prodajarec, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(lekovitx_1_1_2_1)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(sifra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(naziv, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(kolicina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(dodaj, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    					.addGroup(gl_panel_2.createSequentialGroup()
	    						.addComponent(lekovitx_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.UNRELATED)
	    						.addComponent(ukupno, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
	    					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
	    					.addGroup(gl_panel_2.createSequentialGroup()
	    						.addComponent(kupi, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
	    						.addGap(6)
	    						.addComponent(otkazi, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
	    			.addContainerGap())
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lekovitx_1_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(sifra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(naziv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(kolicina, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(dodaj))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(prodajarec, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(izlog))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
	    			.addGap(8)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lekovitx_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(ukupno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(kupi)
	    				.addComponent(otkazi))
	    			.addContainerGap(51, Short.MAX_VALUE))
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
		
	    
        
        dodaj.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
					int koliko = (int) kolicina.getValue();
					float sve = stari.getCena() * koliko;
			    	DefaultTableModel model = (DefaultTableModel) table.getModel();
			    	if (stari.getNarecept() == true) {
			    		
			    		UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.PLAIN, 14));
						UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));
					
						UIManager.put("OptionPane.background", new Color(194,236,235));
						UIManager.put("Panel.background", new Color(194,236,235));
						UIManager.put("OptionPane.messageForeground", new Color(8,126,139));
						UIManager.put("OptionPane.okButtonText", "Zatvori");
						UIManager.put("OptionPane.button.background", new Color(255,90,95));
				
						JOptionPane.showMessageDialog(panel,
							"Ovaj lek se prodaje samo na recept!",
					        "GRESKA!",
					        JOptionPane.ERROR_MESSAGE);
						
			            naziv.setText("");
						sifra.setText("0");
						kolicina.setValue(1);
						
			    		
			    	}else {
			    		narec = "NE";
			    		model.addRow(new Object[]{
				    			stari.getNazivleka(),
				    			stari.getProizvodjac(),
				    			stari.getSifraleka(), 
				    			narec, 
				    			sve});
				    	
				    	naziv.setText("");
						sifra.setText("0");
						kolicina.setValue(1);
				    	ukupnacena = ukupnacena + sve;
				    	ukupno.setText(String.valueOf(ukupnacena));
			    	}
			    	
			}
			
			public void mouseEntered(MouseEvent e){
				dodaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
	    
        Cuvanje.Ulogovan = Cuvanje.UcitajKorisnike("ulogovan.txt");
        
        for(int i=0; i<Cuvanje.Ulogovan.size(); i++) {
    		
			apoime = "" + (Cuvanje.Ulogovan.get(i).getImekorisnika());
			apoprez = "" + (Cuvanje.Ulogovan.get(i).getPrezimekorisnika());
			
        }
	    
        kupi.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				try {
		            // Assume default encoding.
		            FileWriter fileWriter =
		                new FileWriter("prodaja.txt");

		            // Always wrap FileWriter in BufferedWriter.
		            BufferedWriter bufferedWriter =
		                new BufferedWriter(fileWriter);
		            
		            	bufferedWriter.write(apoime + '|');
		            	bufferedWriter.write(apoprez + '|');
		            	bufferedWriter.write(String.valueOf(ukupnacena));
		            	bufferedWriter.newLine();

		            // Always close files.
		            bufferedWriter.close();
		            
		            ukupno.setText("");
		            DefaultTableModel model = (DefaultTableModel) table.getModel();
		            model.setRowCount(0);
		            naziv.setText("");
					sifra.setText("0");
					kolicina.setValue(1);
		        }
		        catch(IOException ex) {
		            System.out.println(
		                "Greska pri upisivanju u fajl 'prodaja.txt'");
		            // Or we could just do this:
		            // ex.printStackTrace();
		        }
			}
			
			public void mouseEntered(MouseEvent e){
				kupi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
        
	    
	    otkazi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				naziv.setText("");
				sifra.setText("0");
				kolicina.setValue(1);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
	            model.setRowCount(0);
	            ukupno.setText("");
			}
		});
	    
        
	}
}
