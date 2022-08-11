import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JOptionPane;
/*
 * Tutaj ma byæ import danych z pliku do ArrayListy
 */
public class Importer {
	
	//int index=0;
	String dir;
	File path;
	String fp;
	Boolean dupa = false;
	FileWriter write;
	PrintWriter outputFile;
	
	final ArrayList<String> lista = new ArrayList<>();
	
	public void debil (String dir){
		
		try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
			
				while (br.ready()) {
					lista.add(br.readLine());
				}
		}catch (NullPointerException e) {
			dupa = true;
			System.out.println("Ni chuja! Podaj plik txt z list¹!");
			JOptionPane.showMessageDialog
			(null, "Ni chuja! Podaj plik txt z list¹!","B³¹d wyszukiwania!", JOptionPane.ERROR_MESSAGE);
		}

		catch (IOException e) {
			e.printStackTrace();
					}
		}
	public void dubel() {
		Set<String> set = new LinkedHashSet<>(lista);
		lista.clear();
		lista.addAll(set);
	}
	public void saver(String fp) {
		try {
			try (FileWriter write = new FileWriter(fp)) {
				try (PrintWriter outputFile = new PrintWriter (fp)) {						
					for (int i=0;i<lista.size();i++) {
						outputFile.println(lista.get(i));						
						}
						outputFile.close();
				}
				write.close();
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}		
	public ArrayList<String> getLista() {
		// TODO Auto-generated method stub
		return lista;
	}
	public int dej() {
		return lista.size();
	}
	public final Boolean getDupa() {
		return dupa;
	}	
	
}



	

