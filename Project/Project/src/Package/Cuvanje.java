package Package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cuvanje {
	
	public static ArrayList<Korisnik> Korisnici = new ArrayList<Korisnik>();
	public static ArrayList<Lek> Lekovi = new ArrayList<Lek>();
	
	public static void SacuvajKorisnike(String fileName, ArrayList<Korisnik> Korisnici) {
		// The name of the file to open.

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            
            for (int i=0; i<Korisnici.size(); i++) {
            	bufferedWriter.write(Korisnici.get(i).getKorisnickoime() + '|');
            	bufferedWriter.write(Korisnici.get(i).getLozinka() + '|');
            	bufferedWriter.write(Korisnici.get(i).getImekorisnika() + '|');
            	bufferedWriter.write(Korisnici.get(i).getPrezimekorisnika() + '|');
            	bufferedWriter.write(Korisnici.get(i).getTipkorisnika().toString());
            	bufferedWriter.newLine();
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
	}
	
	public static ArrayList<Korisnik> UcitajKorisnike(String fileName){
		try {
		      File myObj = new File(fileName);
		      Scanner myReader = new Scanner(myObj);
		      ArrayList<Korisnik> korisnik = new ArrayList<Korisnik>();
		
		      while (myReader.hasNextLine()) {
		    	 
		        String data = myReader.nextLine();
		        String[] niz = data.split("\\|");
		        Korisnik k = new Korisnik();
		        k.setKorisnickoime(niz[0]);
		        k.setLozinka(niz[1]);
		        k.setImekorisnika(niz[2]);
		        k.setPrezimekorisnika(niz[3]);
		        if(niz[4].equals("LEKAR")) {
		        	k.setTipkorisnika(TipKorisnika.LEKAR);
		        }else if(niz[4].equals("APOTEKAR")){
		        	k.setTipkorisnika(TipKorisnika.APOTEKAR);
		        }else {
		        	k.setTipkorisnika(TipKorisnika.ADMIN);
		        }
		        korisnik.add(k);
		        System.out.println(data);
		        
		      }
		      myReader.close();
		      
		      return korisnik;
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return null;
	}
	
	public static void SacuvajLekove(String fileName, ArrayList<Lek> Lekovi) {
		// The name of the file to open.

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            
            for (int i=0; i<Lekovi.size(); i++) {
            	bufferedWriter.write(Lekovi.get(i).getNazivleka() + '|');
            	bufferedWriter.write(Lekovi.get(i).getProizvodjac() + '|');
            	bufferedWriter.write(Lekovi.get(i).getSifraleka() + '|');
            	bufferedWriter.write(Lekovi.get(i).getCena().toString() + '|');
            	bufferedWriter.write(Lekovi.get(i).getNarecept().toString());
            	bufferedWriter.newLine();
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
	}
	
	public static ArrayList<Lek> UcitajLekove(String fileName){
		try {
		      File myObj = new File(fileName);
		      Scanner myReader = new Scanner(myObj);
		      ArrayList<Lek> lek = new ArrayList<Lek>();
		
		      while (myReader.hasNextLine()) {
		    	 
		        String data = myReader.nextLine();
		        String[] niz = data.split("\\|");
		        Lek l = new Lek();
		        l.setNazivleka(niz[0]);
		        l.setSifraleka(niz[1]);
		        l.setProizvodjac(niz[2]);
		        l.setCena(Float.parseFloat(niz[3]));
		        if(niz[4].equals("true")) {
		        	l.setNarecept(true);
		        }else {
		        	l.setNarecept(false);
		        }
		        lek.add(l);
		        System.out.println(data);
		        
		      }
		      myReader.close();
		      
		      return lek;
		      
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return null;
	}
}
