package com.collections;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Lists {

	public static void ArrayList() {
		
		Methods ob = new Methods();
		
		List animes = ob.addAnime();
		
		ob.displayAnime(animes);
		
		ob.searchAnime(animes);
		
		
	}

}

class Methods {
	public List addAnime() {
		List<String> animes = new ArrayList<String>();
		animes.add(0,"DeathNote");
		animes.add(1,"Naruto");
		animes.add(2,"One piece");
		animes.add(3,"Attack on titan");
		animes.add(4,"Nanatsu no taizai");
		animes.add(5,"Assassination classroom");
		
		return animes;
		
	}
	
	public int searchAnime(List animes) {
		Scanner scanner = new Scanner(System.in);
		
		boolean hasNextString = scanner.hasNextLine();
		
		if(hasNextString) {
			String animeName = scanner.nextLine();
			
			return animes.indexOf(animeName);
			
		}
		return 0;

	}
	
	public void displayAnime(List animes) {
		System.out.println(animes);
	}
}
