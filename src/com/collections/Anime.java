package com.collections;

import java.util.Comparator;

public class Anime implements Comparable<Anime> {
	private String animeName;
	private double animeRating;
	private int animeId;
	
	public Anime() {
		
	}

	public Anime(String animeName, double animeRating, int animeId) {
		this.animeName = animeName;
		this.animeRating = animeRating;
		this.animeId = animeId;
	}

	public String getAnimeName() {
		return animeName;
	}

	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}

	public double getAnimeRating() {
		return animeRating;
	}

	public void setAnimeRating(int animeRating) {
		this.animeRating = animeRating;
	}

	public int getAnimeId() {
		return animeId;
	}

	public void setAnimeId(int animeId) {
		this.animeId = animeId;
	}
	
	@Override
	public boolean equals(Object obj) {
		Anime anime = (Anime) obj;
		if(animeId == anime.getAnimeId() && animeRating == anime.getAnimeRating() && animeName.equals(anime.getAnimeName())) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return "Anime name is "+animeName+" and rating is "+animeRating+" and  id is "+animeId;
	}
	
	@Override
	public int hashCode() {
	 int hash = getAnimeId(); 
		return hash;
	}

	@Override
	public int compareTo(Anime o) {
		int CompareValue = animeName.compareTo(o.getAnimeName());
		if(CompareValue == 0) {
			CompareValue = (int) (animeRating - o.getAnimeRating());
		}
		return CompareValue;
	}
	
	public static Comparator<Anime> getAnimeId = new Comparator<Anime>() {

		@Override
		public int compare(Anime o1, Anime o2) {
			return o1.getAnimeId() - o2.getAnimeId();
		}
		
	};
	
	public static Comparator<Anime> getAnimeName = new Comparator<Anime>() {

		@Override
		public int compare(Anime o1, Anime o2) {
			return o1.getAnimeName().compareTo(o2.getAnimeName());
		}
	};
	
	public static Comparator<Anime> getAnimeRating = new Comparator<Anime>() {

		@Override
		public int compare(Anime o1, Anime o2) {
			return (int) (o1.getAnimeRating() - o2.getAnimeRating());
		}
	};

}
