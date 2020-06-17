package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

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
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SortOrder;

public class LekLekoviPrikazSvih extends JPanel{
	
	public JLabel listal = new JLabel("<HTML><U>Lista lekova</U></HTML>");
	
	public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
	public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
	private JTable table;
	private JTextField filterText;
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
	    
	    ButtonGroup sor = new ButtonGroup();
	    
	    JLabel lblNewLabel = new JLabel("LEKOVI");
	    lblNewLabel.setForeground(new Color(8, 126, 139));
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    
	    
	    listal.setHorizontalAlignment(SwingConstants.CENTER);
	    listal.setForeground(new Color(8, 126, 139));
	    listal.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1_2 = new JLabel("Klikom na vrh svake kolone sortirate lekove po toj stavki.");
	    lekovitx_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    
	    Cuvanje.Lekovi = Cuvanje.UcitajLekove("lekovi.txt");
	    


	    JTable table = new JTable(new DefaultTableModel(null, new Object[]{"Naziv", "Proizvodjac", "Sifra", "Na recept", "Cena"}));
	    
	    TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
	    table.setRowSorter(sorter);
	    
	    

	    List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
	    sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
	    sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
	    sorter.setSortKeys(sortKeys);
	    
	    filterText = new JTextField();
	    
	    
	    
	    filterText.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = filterText.getText();

                if (text.trim().length() == 0) {
                	sorter.setRowFilter(null);
                } else {
                	sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = filterText.getText();

                if (text.trim().length() == 0) {
                	sorter.setRowFilter(null);
                } else {
                	sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
	    
	    
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
	    String narec = new String();
	    
	    for(int i=0; i<Cuvanje.Lekovi.size(); i++) {
	    	DefaultTableModel model = (DefaultTableModel) table.getModel();
	    	if (Cuvanje.Lekovi.get(i).getNarecept() == true) {
	    		narec = "DA";
	    	}else {
	    		narec = "NE";
	    	}
	    	model.addRow(new Object[]{
	    			Cuvanje.Lekovi.get(i).getNazivleka(),
	    			Cuvanje.Lekovi.get(i).getProizvodjac(),
	    			Cuvanje.Lekovi.get(i).getSifraleka(), 
	    			narec, 
	    			Cuvanje.Lekovi.get(i).getCena()});
	    }
	   
	    
	    
	    
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setViewportBorder(null);
	    scrollPane.getViewport().setBackground(new Color(194, 236, 235));
	    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    
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
	    
	    
	    filterText.setColumns(10);
	    
	    JLabel lekovitx_1_1_2_1 = new JLabel("Trazi:");
	    lekovitx_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(10)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel)
	    						.addGroup(gl_panel_2.createSequentialGroup()
	    							.addComponent(listal, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(lekovitx_1_1_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(filterText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    						.addComponent(lekovitx_1_1_2)))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(19, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGap(11)
	    			.addComponent(lblNewLabel)
	    			.addGap(6)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(listal)
	    				.addComponent(lekovitx_1_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(filterText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(6)
	    			.addComponent(lekovitx_1_1_2)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
	    			.addGap(79))
	    );
	    
	    
	    
	    
	    
	    panel_2.setLayout(gl_panel_2);
	    panel.setLayout(gl_panel);
		
	}
}
