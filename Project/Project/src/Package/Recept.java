package Package;

public class Recept {
	private String sifrarecepta;
	private int idlekara;
	private String jmbgpac;
	private String datum;
	private String vreme;
	private String nazivleka;
	private int kolicina;
	private Float ukupnacena;
	
	public Recept() {
		super();
	}
	
	public Recept(String sifrarecepta, int idlekara, String jmbgpac, String datum, String vreme, String nazivleka, int kolicina, Float ukupnacena) {
		super();
		this.sifrarecepta = sifrarecepta;
		this.idlekara = idlekara;
		this.jmbgpac = jmbgpac;
		this.datum = datum;
		this.vreme = vreme;
		this.nazivleka = nazivleka;
		this.kolicina = kolicina;
		this.ukupnacena = ukupnacena;
	}

	public String getSifrarecepta() {
		return sifrarecepta;
	}

	public void setSifrarecepta(String sifrarecepta) {
		this.sifrarecepta = sifrarecepta;
	}

	public int getIdlekara() {
		return idlekara;
	}

	public void setIdlekara(int idlekara) {
		this.idlekara = idlekara;
	}

	public String getJmbgpac() {
		return jmbgpac;
	}

	public void setJmbgpac(String jmbgpac) {
		this.jmbgpac = jmbgpac;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public String getNazivleka() {
		return nazivleka;
	}

	public void setNazivleka(String nazivleka) {
		this.nazivleka = nazivleka;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public Float getUkupnacena() {
		return ukupnacena;
	}

	public void setUkupnacena(Float ukupnacena) {
		this.ukupnacena = ukupnacena;
	}
}
