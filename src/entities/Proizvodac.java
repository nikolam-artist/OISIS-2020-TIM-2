package entities;
import java.util.Arrays;

public abstract class Proizvodac {
	public Proizvodac(String naziv) {
		this.naziv = naziv;
	}
	
	private String naziv;
	private String adresa;
	
	private String[] proizvodi = new String[20];
	private float[] cene = new float[20];
	private int broj = 0;
	
	public void dodajProizvod(String naziv, float cena) {
		
		for (int i = 0; i < 20; i++) {
			if (proizvodi[i] == null) {
				proizvodi[broj] = naziv;
				cene[broj] = cena;
				broj++;
				break;
			}
		}
	}
	
	public void izbaciProizvod(String naziv) {
		for (int i = 0; i < broj; i++) {
			if (proizvodi[i].compareTo(naziv) == 0) {
				proizvodi[i] = "";
				cene[broj] = 0;
				broj--;
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Proizvodac [naziv=" + naziv + ", adresa=" + adresa + ", proizvodi=" + Arrays.toString(proizvodi)
				+ ", cene=" + Arrays.toString(cene) + ", broj=" + broj + "]";
	}

	public int prebroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	
	public abstract float getCena(String naziv);

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String[] getProizvodi() {
		return proizvodi;
	}

	public void setProizvodi(String[] proizvodi) {
		this.proizvodi = proizvodi;
	}

	public float[] getCene() {
		return cene;
	}

	public void setCene(float[] cene) {
		this.cene = cene;
	}

	
}
