package entities;

public class Poljoprivrednik extends Proizvodac {

	private int brojHektara;

	public Poljoprivrednik(String naziv, int brojHektara) {
		super(naziv);
		this.brojHektara = brojHektara;
	}
	
	@Override
	public float getCena(String naziv) {
		
		for(int i = 0; i < this.prebroj(); i++) {
			if (this.getProizvodi()[i].compareTo(naziv) == 0) {
				return (float) (this.getCene()[i] * 0.98 * (this.brojHektara - 1));
			}
		}
		return -1;
	}

	public int getBrojHektara() {
		return brojHektara;
	}

	public void setBrojHektara(int brojHektara) {
		this.brojHektara = brojHektara;
	}
	
	
}
