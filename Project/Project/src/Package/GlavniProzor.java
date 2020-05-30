package Package;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class GlavniProzor extends JFrame {

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniProzor frame = new GlavniProzor();
					frame.pack();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.setSize(700, 500);
					ImageIcon logoicon = new ImageIcon("logoicon.png");
					Image logo = logoicon.getImage();
					frame.setIconImage(logo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		setResizable(false);
		setTitle("Logovanje u sistem");
		setFont(new Font("Montserrat", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		Logovanje pocetni = new Logovanje();
		setContentPane(pocetni);
		
		Administrator admin = new Administrator();
		Apotekar apotekar = new Apotekar();
		Lekar lekar = new Lekar();
		
		pocetni.btnNewButton.addActionListener(new ActionListener() {
			String ad = new String("admin");
			String ap = new String("apotekar");
			String le = new String("lekar");
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(pocetni.textField.getText().equals(ad) && pocetni.textField_1.getText().equals(ad)) {
					setTitle("Ulogovan: Administrator");
					setContentPane(admin);
					revalidate();
					repaint();
				}else if(pocetni.textField.getText().equals(ap) && pocetni.textField_1.getText().equals(ap)){
					setTitle("Ulogovan: Apotekar");
					setContentPane(apotekar);
					revalidate();
					repaint();
				}else if(pocetni.textField.getText().equals(le) && pocetni.textField_1.getText().equals(le)){
					setTitle("Ulogovan: Lekar");
					setContentPane(lekar);
					revalidate();
					repaint();
				}else {
					UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.PLAIN, 14));
					UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));
					
					UIManager.put("OptionPane.background", new Color(194,236,235));
					UIManager.put("Panel.background", new Color(194,236,235));
					UIManager.put("OptionPane.messageForeground", new Color(8,126,139));
					UIManager.put("OptionPane.okButtonText", "Zatvori");
					UIManager.put("OptionPane.button.background", new Color(255,90,95));
				
					JOptionPane.showMessageDialog(pocetni,
							"Ne postoji registrivani korisnik sa tim podacima.",
					        "GRESKA!",
					        JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		pocetni.btnOtkai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
