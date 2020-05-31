package Package;

import java.awt.Color;
import java.awt.Cursor;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




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
		
		AdmLekoviPrikazSvih admin = new AdmLekoviPrikazSvih();
		AdmLekoviPretragaLekova pret = new AdmLekoviPretragaLekova();
		AdmLekoviDodajNovi dodaj = new AdmLekoviDodajNovi();
		AdmLekoviIzmeniPostojeci izmeni = new AdmLekoviIzmeniPostojeci();
		
		ApoLekoviPrikazSvih apotekar = new ApoLekoviPrikazSvih();
		LekLekoviPrikazSvih lekar = new LekLekoviPrikazSvih();
		
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
		
		//************************************************************************************************VELIKI MENI
		//**************iz prikaza lekova 
		
		AdmReceptiPrikazSvih prikazsvihr = new AdmReceptiPrikazSvih();
		AdmReceptiPretragaRecepata pretr = new AdmReceptiPretragaRecepata();
		AdmKorisniciPrikazSvih prikazsvihk = new AdmKorisniciPrikazSvih();
		AdmKorisniciRegistracija reg = new AdmKorisniciRegistracija();
		AdmIzvestaj izv = new AdmIzvestaj();
		
		admin.recepti.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				admin.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		admin.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				admin.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		admin.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				admin.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		//*****************iz pretrage lekova
		
		pret.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				pret.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		pret.recepti.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				pret.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		pret.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				pret.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		pret.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				pret.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		//*****************iz dodavanja lekova
		
				dodaj.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				dodaj.recepti.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				dodaj.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				dodaj.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izvestaj prodaje");
						setContentPane(izv);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//*****************iz izmene lekova
				
				izmeni.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izmeni.recepti.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izmeni.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izmeni.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izvestaj prodaje");
						setContentPane(izv);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//**************iz prikaza recepata
				
				prikazsvihr.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihr.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				prikazsvihr.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihr.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				prikazsvihr.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izvestaj prodaje");
						setContentPane(izv);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihr.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//**************iz pretrage recepata 
				
				pretr.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pretr.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				pretr.recepti.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pretr.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				pretr.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pretr.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				pretr.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izvestaj prodaje");
						setContentPane(izv);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pretr.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//**************iz liste korisnika 
				
				prikazsvihk.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihk.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				prikazsvihk.recepti.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihk.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				prikazsvihk.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izvestaj prodaje");
						setContentPane(izv);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihk.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//**************iz registracije korisnika 
				
				reg.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						reg.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				reg.recepti.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						reg.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				reg.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						reg.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				reg.izvestaj.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izvestaj prodaje");
						setContentPane(izv);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						reg.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//**************iz izvestaja prodaje
				
				izv.lekovi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izv.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izv.recepti.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izv.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izv.korisnici.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izv.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
		
		//************************************************************************************PODMENI - LEKOVI
		
		//****************************************************************admin lista lekova
		
		admin.pretragal.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Pretraga lekova");
				setContentPane(pret);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				admin.pretragal.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		admin.dodajl.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Dodavanje novog leka");
				setContentPane(dodaj);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				admin.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		admin.izmenil.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Administrator: Izmena postojeceg leka");
				setContentPane(izmeni);
				revalidate();
				repaint();
			}
			
			public void mouseEntered(MouseEvent e){
				admin.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		//****************************************************************admin pretraga lekova
		
				pret.listal.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pret.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				pret.dodajl.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Dodavanje novog leka");
						setContentPane(dodaj);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pret.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				pret.izmenil.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izmena postojeceg leka");
						setContentPane(izmeni);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pret.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
		
				//****************************************************************admin dodavanje lekova
				
				dodaj.listal.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				dodaj.pretragal.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Pretraga lekova");
						setContentPane(pret);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.pretragal.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				dodaj.izmenil.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Izmena postojeceg leka");
						setContentPane(izmeni);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						dodaj.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//****************************************************************admin izmena lekova
				
				izmeni.listal.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih lekova");
						setContentPane(admin);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izmeni.pretragal.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Pretraga lekova");
						setContentPane(pret);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.pretragal.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				izmeni.dodajl.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Dodavanje novog leka");
						setContentPane(dodaj);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						izmeni.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//************************************************************************************PODMENI - RECEPTI
				
				prikazsvihr.pretragar.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Pretraga recepata");
						setContentPane(pretr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihr.pretragar.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				pretr.listar.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih recepata");
						setContentPane(prikazsvihr);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						pretr.listar.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				//************************************************************************************PODMENI - KORISNICI
				
				prikazsvihk.regi.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Registracija novog korisnika");
						setContentPane(reg);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						prikazsvihk.regi.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});
				
				reg.listak.addMouseListener((MouseListener) new MouseAdapter(){
					public void mouseClicked(MouseEvent e){
						setTitle("Administrator: Prikaz svih korisnika");
						setContentPane(prikazsvihk);
						revalidate();
						repaint();
					}
					
					public void mouseEntered(MouseEvent e){
						reg.listak.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					});

	}
}
