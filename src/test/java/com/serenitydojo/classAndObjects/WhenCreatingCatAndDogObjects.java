package com.serenitydojo.classAndObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    

}