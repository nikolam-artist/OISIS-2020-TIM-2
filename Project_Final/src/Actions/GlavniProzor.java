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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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

		Cuvanje.Korisnici = Cuvanje.UcitajKorisnike("korisnici.txt");

		setResizable(false);
		setTitle("Logovanje u sistem");
		setFont(new Font("Montserrat", Font.PLAIN, 12));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		Logovanje pocetni = new Logovanje();
		setContentPane(pocetni);

		AdmLekoviPrikazSvih admin = new AdmLekoviPrikazSvih();
		AdmLekoviDodajNovi dodaj = new AdmLekoviDodajNovi();
		AdmLekoviIzmeniPostojeci izmeni = new AdmLekoviIzmeniPostojeci();

		ApoLekoviPrikazSvih apoprikazl = new ApoLekoviPrikazSvih();
		LekLekoviPrikazSvih lekprikazl = new LekLekoviPrikazSvih();

		pocetni.potvrdi.addActionListener(new ActionListener() {
			String ad = new String("admin");
			String ime = new String();
			String prez = new String();
			TipKorisnika k;

			Korisnik ulogovan = new Korisnik();

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int sajz = Cuvanje.Korisnici.size() - 1;

				for (int i = 0; i < Cuvanje.Korisnici.size(); i++) {
					if (pocetni.korime.getText().equals(Cuvanje.Korisnici.get(i).getKorisnickoime())
							&& pocetni.lozinka.getText().equals(Cuvanje.Korisnici.get(i).getLozinka())) {
						k = Cuvanje.Korisnici.get(i).getTipkorisnika();
						ime = Cuvanje.Korisnici.get(i).getImekorisnika();
						prez = Cuvanje.Korisnici.get(i).getPrezimekorisnika();

						ulogovan.setIdkorisnika(Cuvanje.Korisnici.get(i).getIdkorisnika());
						ulogovan.setImekorisnika(Cuvanje.Korisnici.get(i).getImekorisnika());
						ulogovan.setKorisnickoime(Cuvanje.Korisnici.get(i).getKorisnickoime());
						ulogovan.setLozinka(Cuvanje.Korisnici.get(i).getLozinka());
						ulogovan.setPrezimekorisnika(Cuvanje.Korisnici.get(i).getPrezimekorisnika());
						ulogovan.setTipkorisnika(Cuvanje.Korisnici.get(i).getTipkorisnika());

						Cuvanje.Korisnici.add(ulogovan);
						ArrayList<Korisnik> arrr = new ArrayList<Korisnik>();
						arrr.add(ulogovan);
						Cuvanje.SacuvajKorisnike("ulogovan.txt", arrr);

						switch (k) {
						case ADMIN:
							setTitle("Administrator: Prikaz svih lekova");
							setContentPane(admin);
							revalidate();
							repaint();
							break;
						case APOTEKAR:
							setTitle("Apotekar " + ime + " " + prez + ": Prikaz svih lekova");
							setContentPane(apoprikazl);
							revalidate();
							repaint();
							break;
						case LEKAR:
							setTitle("Lekar " + ime + " " + prez + ": Prikaz svih lekova");
							setContentPane(lekprikazl);
							revalidate();
							repaint();
							break;
						default:
							break;
						}
						break;
					} else {
						if (sajz == i)
							greska(pocetni);
					}
				}
			}

		});

		pocetni.btnOtkai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				PrintWriter writer = null;
				try {
					writer = new PrintWriter("ulogovan.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				writer.print("");
				writer.close();
			}
		});

		// ************************************************************************************************VELIKI
		// MENI
		// **************iz prikaza lekova

		AdmReceptiPrikazSvih prikazsvihr = new AdmReceptiPrikazSvih();
		AdmKorisniciPrikazSvih prikazsvihk = new AdmKorisniciPrikazSvih();
		AdmKorisniciRegistracija reg = new AdmKorisniciRegistracija();
		AdmIzvestaj izv = new AdmIzvestaj();

		ApoLekoviDodajNovi apododajl = new ApoLekoviDodajNovi();
		ApoLekoviIzmeniPostojeci apoizmenil = new ApoLekoviIzmeniPostojeci();
		ApoReceptiPrikazSvih apoprikazr = new ApoReceptiPrikazSvih();
		ApoProdajaSifraLeka apoprodajal = new ApoProdajaSifraLeka();
		ApoProdajaSifraRecepta apoprodajar = new ApoProdajaSifraRecepta();

		LekReceptiPrikazSvih lekprikazr = new LekReceptiPrikazSvih();
		LekReceptiKreiranjeRecepta lekkreiranjer = new LekReceptiKreiranjeRecepta();

		admin.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				admin.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		admin.korisnici.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				admin.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		admin.izvestaj.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				admin.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// apotekar

		apoprikazl.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih recepata");
				setContentPane(apoprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprikazl.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoprikazl.prodaja.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prodaja po sifri leka");
				setContentPane(apoprodajal);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprikazl.prodaja.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// lekar

		lekprikazl.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Lekar: Prikaz svih recepata");
				setContentPane(lekprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				lekprikazl.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// apotekar

		// *****************iz dodavanja lekova

		dodaj.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				dodaj.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		dodaj.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				dodaj.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		dodaj.korisnici.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				dodaj.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		dodaj.izvestaj.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				dodaj.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// apotekar

		apododajl.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih recepata");
				setContentPane(apoprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apododajl.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apododajl.prodaja.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prodaja po sifri leka");
				setContentPane(apoprodajal);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apododajl.prodaja.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// *****************iz izmene lekova

		izmeni.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izmeni.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		izmeni.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izmeni.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		izmeni.korisnici.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izmeni.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		izmeni.izvestaj.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izmeni.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// apotekar

		apoizmenil.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih recepata");
				setContentPane(apoprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoizmenil.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoizmenil.prodaja.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prodaja po sifri leka");
				setContentPane(apoprodajal);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoizmenil.prodaja.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// **************iz prikaza recepata

		prikazsvihr.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihr.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		prikazsvihr.korisnici.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihr.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		prikazsvihr.izvestaj.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihr.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// apotekar

		apoprikazr.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih lekova");
				setContentPane(apoprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprikazr.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoprikazr.prodaja.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prodaja po sifri leka");
				setContentPane(apoprodajal);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprikazr.prodaja.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// lekar

		lekprikazr.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Lekar: Prikaz svih lekova");
				setContentPane(lekprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				lekprikazr.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		lekkreiranjer.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Lekar: Prikaz svih lekova");
				setContentPane(lekprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				lekkreiranjer.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// **************iz pretrage recepata

		// apotekar

		// apotekar

		apoprodajal.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih lekova");
				setContentPane(apoprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprodajal.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoprodajal.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih recepata");
				setContentPane(apoprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprodajal.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// apotekar

		apoprodajar.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih lekova");
				setContentPane(apoprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprodajar.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoprodajar.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih recepata");
				setContentPane(apoprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprodajar.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// **************iz liste korisnika

		prikazsvihk.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihk.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		prikazsvihk.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihk.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		prikazsvihk.izvestaj.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihk.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// **************iz registracije korisnika

		reg.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				reg.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		reg.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				reg.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		reg.korisnici.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				reg.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		reg.izvestaj.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izvestaj prodaje");
				setContentPane(izv);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				reg.izvestaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// **************iz izvestaja prodaje

		izv.lekovi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izv.lekovi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		izv.recepti.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih recepata");
				setContentPane(prikazsvihr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izv.recepti.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		izv.korisnici.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izv.korisnici.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ************************************************************************************PODMENI
		// - LEKOVI

		// ****************************************************************admin lista
		// lekova

		admin.dodajl.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Dodavanje novog leka");
				setContentPane(dodaj);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				admin.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		admin.izmenil.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izmena postojeceg leka");
				setContentPane(izmeni);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				admin.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ****************************************************************apotekar
		// lista lekova

		apoprikazl.dodajl.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Dodavanje novog leka");
				setContentPane(apododajl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprikazl.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoprikazl.izmenil.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Izmena postojeceg leka");
				setContentPane(apoizmenil);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprikazl.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ****************************************************************lekar lekovi

		// ****************************************************************admin
		// pretraga lekova

		// ****************************************************************apotekar
		// pretraga lekova

		// ****************************************************************admin
		// dodavanje lekova

		dodaj.listal.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				dodaj.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		dodaj.izmenil.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Izmena postojeceg leka");
				setContentPane(izmeni);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				dodaj.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ****************************************************************apotekar
		// dodavanje lekova

		apododajl.listal.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih lekova");
				setContentPane(apoprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apododajl.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apododajl.izmenil.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Izmena postojeceg leka");
				setContentPane(apoizmenil);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apododajl.izmenil.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ****************************************************************admin izmena
		// lekova

		izmeni.listal.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih lekova");
				setContentPane(admin);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izmeni.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		izmeni.dodajl.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Dodavanje novog leka");
				setContentPane(dodaj);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				izmeni.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ****************************************************************apotekar
		// izmena lekova

		apoizmenil.listal.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prikaz svih lekova");
				setContentPane(apoprikazl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoizmenil.listal.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoizmenil.dodajl.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Dodavanje novog leka");
				setContentPane(apododajl);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoizmenil.dodajl.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ************************************************************************************PODMENI
		// - RECEPTI

		// admin

		// apotekar

		// lekar - lista recepata

		lekprikazr.kreiranjer.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Lekar: Kreiranje recepta");
				setContentPane(lekkreiranjer);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				lekprikazr.kreiranjer.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// lekar - pretraga recepata

		// lekar - kreiranje recepta
		lekkreiranjer.listar.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Lekar: Prikaz svih recepata");
				setContentPane(lekprikazr);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				lekkreiranjer.listar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ************************************************************************************PODMENI
		// - KORISNICI

		prikazsvihk.regi.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Registracija novog korisnika");
				setContentPane(reg);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				prikazsvihk.regi.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		reg.listak.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Administrator: Prikaz svih korisnika");
				setContentPane(prikazsvihk);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				reg.listak.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		// ************************************************************************************PODMENI
		// - PRODAJA

		apoprodajal.prodajarec.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prodaja po sifri recepta");
				setContentPane(apoprodajar);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprodajal.prodajarec.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		apoprodajar.prodajalek.addMouseListener((MouseListener) new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setTitle("Apotekar: Prodaja po sifri leka");
				setContentPane(apoprodajal);
				revalidate();
				repaint();
			}

			public void mouseEntered(MouseEvent e) {
				apoprodajar.prodajalek.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		
		
		//IZLOGOVAN

		izv.izlog.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Logovanje u sistem");
				setContentPane(pocetni);
				revalidate();
				repaint();
				pocetni.korime.setText("");
				pocetni.lozinka.setText("");
				
				PrintWriter writer = null;
				try {
					writer = new PrintWriter("ulogovan.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				writer.print("");
				writer.close();
			}
			
			public void mouseEntered(MouseEvent e){
				izv.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
		prikazsvihk.izlog.addMouseListener((MouseListener) new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				setTitle("Logovanje u sistem");
				setContentPane(pocetni);
				revalidate();
				repaint();
				pocetni.korime.setText("");
				pocetni.lozinka.setText("");
				
				PrintWriter writer = null;
				try {
					writer = new PrintWriter("ulogovan.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				writer.print("");
				writer.close();
			}
			
			public void mouseEntered(MouseEvent e){
				prikazsvihk.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			});
		
			reg.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					reg.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			dodaj.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					dodaj.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			izmeni.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					izmeni.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			admin.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					admin.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			prikazsvihr.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					prikazsvihr.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			apododajl.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					apododajl.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			apoizmenil.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					apoizmenil.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			apoprikazl.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					apoprikazl.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			apoprodajal.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					apoprodajal.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			apoprikazr.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					apoprikazr.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			lekprikazl.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					lekprikazl.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			lekkreiranjer.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					lekkreiranjer.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			lekprikazr.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					lekprikazr.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
			apoprodajar.izlog.addMouseListener((MouseListener) new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					setTitle("Logovanje u sistem");
					setContentPane(pocetni);
					revalidate();
					repaint();
					pocetni.korime.setText("");
					pocetni.lozinka.setText("");
					
					PrintWriter writer = null;
					try {
						writer = new PrintWriter("ulogovan.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					writer.print("");
					writer.close();
				}
				
				public void mouseEntered(MouseEvent e){
					apoprodajar.izlog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				});
			
	}

	public void greska(Logovanje pocetni) {
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
			pocetni.korime.setText("");
			pocetni.lozinka.setText("");
			
			
	}
}
