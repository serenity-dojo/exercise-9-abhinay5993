package com.serenitydojo.classAndObjects;

public class CatEntity {

	private String name;
	private String favoriteFood;
	private int age;
	public static final String CAT_NOISE = "Meow";

	public static String usualFood() {
		return "Tuna";
	}

	public CatEntity(String name, int age) {
		this.name = name;
		this.favoriteFood = usualFood();
		this.age = age;
	}

	public CatEntity(String name, String favoriteFood, int age) {
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the favoriteFood
	 */
	public String getFavoriteFood() {
		return favoriteFood;
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
	 * @param favoriteFood the favoriteFood to set
	 */
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public void makeNoise() {
		System.out.println(CAT_NOISE);
	}

	public void feed(String food) {
		System.out.println(name + " eats some " + food);
	}

	public void groom() {
		lickPaws();
		cleanFur();
	}

	private void cleanFur() {
		System.out.println(name + " cleans his fur");
	}

	private void lickPaws() {
		System.out.println(name + " licks his paws");
	}

}