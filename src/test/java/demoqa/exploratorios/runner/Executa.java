package demoqa.exploratorios.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import demoqa.exploratorios.drivers.Driver;

public class Executa extends Driver{
	
	public static void iniciarTest(){
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
	
	}
}
