package entities;
public class Firma extends Proizvodac {
	private String PIB;
	
	public Firma(String naziv) {
		super(naziv);
	}
	
	public Firma(String naziv, String PIB) {
		super(naziv);
		this.PIB = PIB;
	}
	
	@Override
	public float getCena(String naziv) {
		
		for(int i = 0; i < this.prebroj(); i++) {
			if (this.getProizvodi()[i].compareTo(naziv) == 0) {
				return this.getCene()[i];
			}
		}
		return -1;
	}
}
