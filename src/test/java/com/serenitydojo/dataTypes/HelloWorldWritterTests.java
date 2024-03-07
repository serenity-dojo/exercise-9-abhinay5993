package com.serenitydojo.dataTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldWritterTests {

	@Test
	public void shouldWriteHelloWorldToConsole() {
		HelloWorldWritter writterObj = new HelloWorldWritter();
		Assert.assertEquals(writterObj.writeHelloWorldMessage("Hello World!!.. from Java-8"),"Hello World!!.. from Java-8");
	}
	
}