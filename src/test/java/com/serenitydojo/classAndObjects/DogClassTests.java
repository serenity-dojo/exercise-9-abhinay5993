package com.serenitydojo.classAndObjects;
import static org.assertj.core.api.StrictAssertions.assertThat;
import org.testng.annotations.Test;

public class DogClassTests {

	@Test
	public void theDogClassShouldExist() throws ClassNotFoundException {
	assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity")).isNotNull();
	System.out.println("\nTC-01 - theDogClassShouldExist() - Executed successfully.");	
	}

	
	@Test
	public void theDogClassShouldHaveAName() throws Exception {
	assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity")
			        .getDeclaredField("name")
			        .getGenericType()).isEqualTo(String.class);
	System.out.println("\nTC-02 - theDogClassShouldHaveAName() - Executed successfully.");	
	}

	
	@Test
	public void theDogClassShouldHaveAFavoriteToy() throws Exception {
	assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity")
				        .getDeclaredField("favoriteToy")
				        .getGenericType()).isEqualTo(String.class);
	System.out.println("\nTC-03 - theDogClassShouldHaveAFavoriteToy() - Executed successfully.");
	}

	
	@Test
	public void theDogClassShouldHaveAnAge() throws Exception {
	assertThat(Class.forName("com.serenitydojo.classAndObjects.DogEntity")
			        .getDeclaredField("age")
			        .getGenericType()).isEqualTo(int.class);
	System.out.println("\nTC-04 - theDogClassShouldHaveAnAge() - Executed successfully.");
	}

}