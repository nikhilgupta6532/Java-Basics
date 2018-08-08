package com.collections;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// Lists -> ArrayLists
		List<Anime> animeList = new ArrayList<>();

		System.out.println("\n---------** Array list creation ** -----------");

		animeList.add(new Anime("DeathNote", 9.5, 1));
		animeList.add(new Anime("One piece", 9.2, 2));
		animeList.add(new Anime("Naruto", 9.0, 3));
		animeList.add(new Anime("Assassination classroom", 8.8, 4));
		animeList.add(new Anime("Nanatsu no taizai", 8.4, 5));
		animeList.add(new Anime("HunterXHunter", 8, 6));
		animeList.add(new Anime("DBZ", 9.8, 7));
		animeList.add(new Anime("Black Butler", 7.3, 8));
		animeList.add(new Anime("One Piece", 8.8, 9));
		animeList.add(new Anime("Naruto", 9.0, 3));

		System.out.println("List created");

		for (Anime anime : animeList) {
			System.out.println("Name : " + anime.getAnimeName() + "Rating :" + anime.getAnimeRating() + " Id : "
					+ anime.getAnimeId());
			// System.out.println(anime.toString());
		}

		System.out.println("\n--------** Finding the anime**-----------------");
		System.out.println("Now let's try to find the anime HunterXHunter");
		boolean animeResult = animeList.contains(new Anime("HunterXHunter", 8, 6));
		System.out.println("\nDid we found our anime ? " + animeResult);

		System.out.println("\n-----------** Linked list**--------");

		System.out.println("\nNow Let's try to create a Linked list from this array list ");
		LinkedList<Anime> linkedAnime = new LinkedList<>(animeList);

		System.out.println("\nConversion of array list to linked list is done");

		Iterator<Anime> linkedListItr = linkedAnime.iterator();

		while (linkedListItr.hasNext()) {
			System.out.print(linkedListItr.next().getAnimeName() + "-->");
		}

		System.out.println("null");

		System.out.println("\n-----------------**Remove a node**---------------");
		System.out.println("\nNow let's try to remove an anime ");

		Anime anime = new Anime("DBZ", 9.8, 7);
		linkedAnime.remove(anime);

		System.out.println("\nNew linked list is");

		Iterator<Anime> newLinkedListItr = linkedAnime.iterator();
		while (newLinkedListItr.hasNext()) {
			System.out.print(newLinkedListItr.next().getAnimeName() + "-->");
		}

		System.out.println("null");

		System.out.println("\n--------------*Hashed set*------------------");

		System.out.println("\nNow let's try to create an hashed set from array list");
		HashSet<Anime> hashSetAnime = new HashSet<>(animeList);
		System.out.println("\nConversion from array list to hash set is done");

		Iterator<Anime> listItr = animeList.iterator();
		System.out.println("\nArray list is ");
		while (listItr.hasNext()) {

			System.out.print(listItr.next().getAnimeName() + "-->");
		}

		System.out.println("null");

		System.out.println("\nSize of array list is " + animeList.size());

		Iterator<Anime> hashSetItr = hashSetAnime.iterator();
		System.out.println("\nHash set is ");
		while (hashSetItr.hasNext()) {

			System.out.print(hashSetItr.next().getAnimeName() + "-->");
		}

		System.out.println("null");

		System.out.println("\nSize of hash set is " + hashSetAnime.size());

		System.out.println("\n-------------------------**Tree set**--------------------");

		TreeSet<Anime> treeSetAnime = new TreeSet<>(animeList);

		System.out.println("\nConversion of array list to tree set is done");

		for (Anime anime2 : treeSetAnime) {
			System.out.print(anime2.getAnimeName() + "(" + anime2.getAnimeRating() + ")" + "-->");
		}

		System.out.println("null");

		System.out.println("\n---------------Sorting using comparator---------------------");

		Anime[] animeArr = new Anime[animeList.size()];
		animeArr = animeList.toArray(animeArr);

		System.out.println("\nCreation of arrays from list is done");

		System.out.println("\nUnsorted array is ");

		for (Anime anime2 : animeArr) {
			System.out.println("Name : " + anime2.getAnimeName() + " Rating : " + anime2.getAnimeRating() + " Id : "
					+ anime2.getAnimeId());
		}

		System.out.println("\nsorted array by anime name");

		Arrays.sort(animeArr, Anime.getAnimeName);
		for (Anime anime2 : animeArr) {
			System.out.println("Name : " + anime2.getAnimeName() + " Rating : " + anime2.getAnimeRating() + " Id : "
					+ anime2.getAnimeId());
		}

		System.out.println("\nsorted array by anime Rating");

		Arrays.sort(animeArr, Anime.getAnimeRating);
		for (Anime anime2 : animeArr) {
			System.out.println("Name : " + anime2.getAnimeName() + " Rating : " + anime2.getAnimeRating() + " Id : "
					+ anime2.getAnimeId());
		}

		System.out.println("\nsorted array by anime Id");

		Arrays.sort(animeArr, Anime.getAnimeId);
		for (Anime anime2 : animeArr) {
			System.out.println("Name : " + anime2.getAnimeName() + " Rating : " + anime2.getAnimeRating() + " Id : "
					+ anime2.getAnimeId());
		}

		System.out.println("----------------Hash Map---------------------------");

		HashMap<Integer, Anime> hashMapAnime = new HashMap<>();

		for (Anime anime2 : animeList) {
			hashMapAnime.put(anime2.getAnimeId(), anime2);
		}

		System.out.println("\nHash map is created");

		Set<Integer> mapSet = hashMapAnime.keySet();

		Iterator<Integer> mapItr = mapSet.iterator();
		while (mapItr.hasNext()) {
			System.out.println(hashMapAnime.get(mapItr.next()));
		}

		System.out.println("\n------------------Linked hash map-------------");

		LinkedHashMap<Integer, Anime> linkedHashMap = new LinkedHashMap<>(hashMapAnime);
		Set<Integer> linkMapSet = linkedHashMap.keySet();

		Iterator<Integer> linkMapItr = linkMapSet.iterator();
		while (linkMapItr.hasNext()) {
			System.out.println(linkedHashMap.get(linkMapItr.next()));
		}

	}

}
