package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.SortOrder;

public class ApoReceptiPrikazSvih extends JPanel{
	
	public JLabel listar = new JLabel("<HTML><U>Lista recepata</U></HTML>");
	
	public JLabel lekovi = new JLabel(new ImageIcon("Images\\drugs2.png"));
    public JLabel recepti = new JLabel(new ImageIcon("Images\\bill2.png"));
    public JLabel prodaja = new JLabel(new ImageIcon("Images\\medical2.png"));
    private JTextField filterText;
	
public ApoReceptiPrikazSvih() {
		
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
	    
	    JLabel lblNewLabel = new JLabel("RECEPTI");
	    lblNewLabel.setFont(new Font("Montserrat", Font.PLAIN, 27));
	    lblNewLabel.setForeground(new Color(8,126,139));
	    
	    
	    listar.setHorizontalAlignment(SwingConstants.CENTER);
	    listar.setForeground(new Color(8, 126, 139));
	    listar.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    JLabel lekovitx_1_1_2_1 = new JLabel("Trazi:");
	    lekovitx_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2_1.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2_1.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    filterText = new JTextField();
	    filterText.setColumns(10);
	    
	    JLabel lekovitx_1_1_2 = new JLabel("Klikom na vrh svake kolone sortirate recepte po toj stavki.");
	    lekovitx_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lekovitx_1_1_2.setForeground(new Color(8, 126, 139));
	    lekovitx_1_1_2.setFont(new Font("Montserrat", Font.PLAIN, 14));
	    
	    
Cuvanje.Recepti = Cuvanje.UcitajRecepte("recepti.txt");
	    


	    JTable table = new JTable(new DefaultTableModel(null, new Object[]{"Sifra recepta", "ID lekara", "Datum", "Vreme", "JMBG", "Lek"}));
	    
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
                throw new UnsupportedOperationException("Nije podrzano."); 
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
	    table.getColumnModel().getColumn(0).setPreferredWidth(50);
	    table.getColumnModel().getColumn(1).setPreferredWidth(162);
	    table.getColumnModel().getColumn(2).setPreferredWidth(60);
	    table.getColumnModel().getColumn(3).setPreferredWidth(60);
	    table.getColumnModel().getColumn(4).setPreferredWidth(122);
	    table.getColumnModel().getColumn(5).setPreferredWidth(70);

	    
	    for(int i=0; i<Cuvanje.Recepti.size(); i++) {
	    	DefaultTableModel model = (DefaultTableModel) table.getModel();
	    	model.addRow(new Object[]{
	    			Cuvanje.Recepti.get(i).getSifrarecepta(),
	    			Cuvanje.Recepti.get(i).getIdlekara(),
	    			Cuvanje.Recepti.get(i).getDatum(),
	    			Cuvanje.Recepti.get(i).getVreme(),
	    			Cuvanje.Recepti.get(i).getJmbgpac(), 
	    			Cuvanje.Recepti.get(i).getNazivleka()});
	    }
	   
	    
	    
	    
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setViewportBorder(null);
	    scrollPane.getViewport().setBackground(new Color(194, 236, 235));
	    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    
	    
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addComponent(listar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lekovitx_1_1_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    					.addGap(4)
	    					.addComponent(filterText, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(lblNewLabel)
	    				.addComponent(lekovitx_1_1_2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 511, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(37, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(listar)
	    				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    					.addGroup(gl_panel_2.createSequentialGroup()
	    						.addGap(2)
	    						.addComponent(lekovitx_1_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    					.addComponent(filterText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lekovitx_1_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(61, Short.MAX_VALUE))
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
	    			.addGap(22))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    panel.setLayout(gl_panel);
		
	    
	    
	}
}
