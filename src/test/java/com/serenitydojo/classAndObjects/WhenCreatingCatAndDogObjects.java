package com.serenitydojo.classAndObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.serenitydojo.classAndObjects.CatEntity.usualFood;

public class WhenCreatingCatAndDogObjects {
	
    @Test
    public void creating_a_cat() {
    CatEntity felix = new CatEntity("Felix","Tuna", 4);
    
    Assert.assertEquals(felix.getName(), "Felix");
    Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
    Assert.assertEquals(felix.getAge(), 4);
    System.out.println("TC-01 - creating_a_cat() - Executed successfully.");
    }
    
    
    @Test
    public void creating_a_dog() {      
    DogEntity fido = new DogEntity("Fido","Bone", 5);
    
    Assert.assertEquals(fido.getName(), "Fido");
    Assert.assertEquals(fido.getFavoriteToy(), "Bone");
    Assert.assertEquals(fido.getAge(), 5);
    System.out.println("TC-02 - creating_a_dog() - Executed successfully.");
    }

    
    @Test
    public void cat_makes_noise() {
    CatEntity felix = new CatEntity("Felix", 4);
    CatEntity spot = new CatEntity("Spot","Salmon", 3);

    System.out.println("Cats like " + usualFood());
    System.out.println("TC-03 - cat_makes_noise() - Executed successfully.");
    }
   
    
	/**
	 * 
	 * TODO: implement a method in the Dog sound called makeNoise() that returns the
	 * sound a dog makes: "Woof"
	 * 
	 */
	@Test
	public void whenADogBarks() {
		DogEntity fido = new DogEntity("Fido", "Bone", 5);
		String dogSound = "";
		dogSound = fido.makeNoise();

		Assert.assertEquals(dogSound, "Woof");
		System.out.println("TC-04 - whenADogBarks() - Executed successfully.");
	}

    
	/**
	 * 
	 * TODO: implement a method in the Dog sound called feed() that sets the isFed
	 * variable to true:
	 * 
	 */
	@Test
	public void whenADogGetsFed() {
	DogEntity fido = new DogEntity("Fido", "Bone", 5);
	fido.feed();

	Assert.assertTrue(fido.isFed());
	System.out.println("TC-05 - whenADogGetsFed() - Executed successfully.");
	}
    
    
}