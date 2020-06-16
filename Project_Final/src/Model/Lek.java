package Package;

public class Lek {
	private String nazivleka;
	private String sifraleka;
	private String proizvodjac;
	private Boolean narecept;
	private Float cena;
	
	public Lek() {
		super();
	}
	
	public Lek(String nazivleka, String sifraleka, String proizvodjac, Boolean narecept, Float cena) {
		super();
		this.nazivleka = nazivleka;
		this.sifraleka = sifraleka;
		this.proizvodjac = proizvodjac;
		this.narecept = narecept;
		this.cena = cena;
	}

	public String getNazivleka() {
		return nazivleka;
	}

	public void setNazivleka(String nazivleka) {
		this.nazivleka = nazivleka;
	}

	public String getSifraleka() {
		return sifraleka;
	}

	public void setSifraleka(String sifraleka) {
		this.sifraleka = sifraleka;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public Boolean getNarecept() {
		return narecept;
	}

	public void setNarecept(Boolean narecept) {
		this.narecept = narecept;
	}

	public Float getCena() {
		return cena;
	}

	public void setCena(Float cena) {
		this.cena = cena;
	}
}
