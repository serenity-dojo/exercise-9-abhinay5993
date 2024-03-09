package com.serenitydojo.classAndObjects;

public class DogEntity {
	
	private String name;
	private String favoriteToy;
	private int age;
	
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

}