package com.serenitydojo.classAndObjects;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.serenitydojo.model.FeederEntity;

public class WhenFeedingTheAnimalsTests {

	@Test
	public void shouldFeedCatsTuna() {
	FeederEntity feeder = new FeederEntity();
	String food = feeder.feeds("Cat", false);
	
	Assert.assertEquals("Tuna", food);
	System.out.println("TC-01 - shouldFeedCatsTuna() - Executed successfully.");
	}

	
	@Test
	public void shouldFeedHamstersCabbage() {
	FeederEntity feeder = new FeederEntity();
	String food = feeder.feeds("Hamster", false);

	Assert.assertEquals("Cabbage", food);
	System.out.println("TC-02 - shouldFeedHamstersCabbage() - Executed successfully.");
	}

	
	@Test
	public void shouldFeedDogsDogFood() {
	FeederEntity feeder = new FeederEntity();
	String food = feeder.feeds("Dog", false);

	Assert.assertEquals("Dog Food", food);
	System.out.println("TC-03 - shouldFeedDogsDogFood() - Executed successfully.");
	}

	
	@Test
	public void shouldFeedPremiumCatsPremiumFood() {
	FeederEntity feeder = new FeederEntity();
	String food = feeder.feeds("Cat", true);

	Assert.assertEquals("Salmon", food);
	System.out.println("TC-04 - shouldFeedPremiumCatsPremiumFood() - Executed successfully.");
	}
	
	
	@Test
	public void shouldFeedPremiumDogsDeluxeDogFood() {
	FeederEntity feeder = new FeederEntity();
	String food = feeder.feeds("Dog", true);

	Assert.assertEquals("Deluxe Dog Food", food);
	System.out.println("TC-05 - shouldFeedPremiumDogsDeluxeDogFood() - Executed successfully.");
	}
	
	
	@Test
	public void shouldFeedPremiumHampstersLettuce() {
	FeederEntity feeder = new FeederEntity();
	String food = feeder.feeds("Hamster", true);

    Assert.assertEquals("Lettuce", food);
	System.out.println("TC-06 - shouldFeedPremiumHampstersLettuce() - Executed successfully.");
	}

}