package com.nikhilgupta.lambda.practice;

public class Anime {

	private String animeName;
	private double animeRating;
	
	public Anime(String animeName, double animeRating) {
		this.animeName = animeName;
		this.animeRating = animeRating;
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
	
	public void setAnimeRating(double animeRating) {
		this.animeRating = animeRating;
	}
	
}
