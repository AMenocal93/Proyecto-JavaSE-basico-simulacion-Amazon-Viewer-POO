package com.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;


//Movie clase que hereda de la clase Film (extends Film)
//implements, indica que se esta implementando la interface IVisualizable
public class Movie extends Film implements IVisualizable{
	
	//Atributos propios de Movie
	private int id;
	private int timeViewed;
	
	
	
	//Metodo constructor que proviene de Film, permite la creacion de objetos de tipo Movie, 
	//requiere los parametros que hereda de la clase Film (Super) 

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}




	public void showData() {
		//System.out.println("Title: " + title);
		//System.out.println("Genere: " + genre);
		//System.out.println("Year: " + year);
	}
	


	//Metodos get y set (Encapsulamiento)
	//permiten el acceso y la modificacion del valor de variables private 

	public int getId() {
		return id;
	}



	public int getTimeViewed() {
		return timeViewed;
	}


	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	//Sobreescribiendo al metodo ToString de la clase object 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n ::::MOVIES::::" +
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() + 
				"\n Duration: " + getDuration();
	}



	//Metodos sobreescritos provenientes de la interface, es aqui en donde se establse el comportamiento de los metodos.
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}




	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime() > dateI.getTime()) {//Validacion para determonar el tiempo de lectura y asignarlo al metodo timeViewed
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
		
	}
	//Metodo para crear objetos Movie, almacenador en una coleccion de objetos (ArrayList)
	public static ArrayList<Movie> makeMuvieList(){
		ArrayList<Movie> movies = new ArrayList();
		
		for (int i = 1; i <= 10; i++) {
			movies.add(new Movie("Movie " + i, "Genero " + i, "Creador " + i, 120+i, (short)(2020+i)));
		}
		
		return movies;
	}
}
