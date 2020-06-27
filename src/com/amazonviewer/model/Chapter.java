package com.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie{
	
	private int id;
	private int sessionNumber;
	
	
	
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.setSessionNumber(sessionNumber);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}


	public int getSessionNumber() {
		return sessionNumber;
	}




	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :::CHAPTERS::::" +
			   "\n Title: " + getTitle() +
			   "\n Year: " + getYear() +
			   "\n Creator: " + getCreator() +
			   "\n Duration: " + getDuration();
	}
	
	public static ArrayList<Chapter> makeChapteList(){
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Capitulo " + i, "genero " + i, "creator " + i, 45, (short)(2017+i), i));
		}
		return chapters;
	}
	
}
