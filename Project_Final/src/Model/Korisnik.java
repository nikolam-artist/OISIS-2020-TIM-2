package Package;

public class Korisnik {
	private String korisnickoime;
	private String lozinka;
	private String imekorisnika;
	private String prezimekorisnika;
	private TipKorisnika tipkorisnika;
	private Float idkorisnika;
	
	public Korisnik() {
		super();
	}
	
	public Korisnik(String korisnickoime, String lozinka, String imekorisnika, String prezimekorisnika, TipKorisnika tipkorisnika, Float idkorisnika) {
		super();
		this.korisnickoime = korisnickoime;
		this.lozinka = lozinka;
		this.imekorisnika = imekorisnika;
		this.prezimekorisnika = prezimekorisnika;
		this.tipkorisnika = tipkorisnika;
		this.idkorisnika = idkorisnika;
	}

	public Float getIdkorisnika() {
		return idkorisnika;
	}

	public void setIdkorisnika(Float idkorisnika) {
		this.idkorisnika = idkorisnika;
	}

	public String getKorisnickoime() {
		return korisnickoime;
	}

	public void setKorisnickoime(String korisnickoime) {
		this.korisnickoime = korisnickoime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getImekorisnika() {
		return imekorisnika;
	}

	public void setImekorisnika(String imekorisnika) {
		this.imekorisnika = imekorisnika;
	}

	public String getPrezimekorisnika() {
		return prezimekorisnika;
	}

	public void setPrezimekorisnika(String prezimekorisnika) {
		this.prezimekorisnika = prezimekorisnika;
	}

	public TipKorisnika getTipkorisnika() {
		return tipkorisnika;
	}

	public void setTipkorisnika(TipKorisnika tipkorisnika) {
		this.tipkorisnika = tipkorisnika;
	}
}
