package com.serenitydojo.classAndObjects;

public class DogEntity {
	
	private String name;
	private String favoriteToy;
	private int age;
	private static final String DOG_NOISE = "Woof";
    private boolean isFed; 

	public DogEntity(String name, String favoriteToy, int age) {
		this.name = name;
		this.favoriteToy = favoriteToy;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the favoriteToy
	 */
	public String getFavoriteToy() {
		return favoriteToy;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param favoriteToy the favoriteToy to set
	 */
	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/**
	 * implementation of Exercise 4
	 * 
	 */
	public String makeNoise() {
		return DOG_NOISE;
	}
	
	public boolean isFed() {
		return isFed;
	}

	
	/**
	 * 
	 * @param isFed the isFed to set
	 */
	public void feed() {
		this.isFed = true;
	}

}