package com.nikhilgupta.lambda.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		
		Anime deathNote = new Anime("DeathNote",9.0);
		Anime naruto = new Anime("Naruto",9.4);
		Anime onePeice = new Anime("One Piece", 9.8);
		
		
		List<Anime> animes = new ArrayList<>();
		animes.add(deathNote);
		animes.add(naruto);
		animes.add(onePeice);
		
		Collections.sort(animes,(anime1,anime2)->anime1.getAnimeName().compareTo(anime2.getAnimeName()));
		
		for (Anime anime : animes) {
			System.out.println(anime.getAnimeName());
		}
		
		
		System.out.println("----------------------------------------------------------");
		
		DoSomething<Anime> dSomething = (anime) -> System.out.println(anime.getAnimeName()); 
				
				
//				new DoSomething<Anime>() {
//
//			@Override
//			public void doSomething(Anime obj) {
//				System.out.println(obj.getAnimeName());
//			}
//		};
		
		for (Anime anime : animes) {
			dSomething.doSomething(anime);
		}
	}
}

