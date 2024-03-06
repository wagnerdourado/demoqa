package demoqa.exploratorios.metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import demoqa.exploratorios.drivers.Driver;

public class Metodos extends Driver{
	
	public static void clicar(String atributo, String texto) {
		driver.findElement(By.xpath("//"+atributo+"[text()='"+texto+"']")).click();
		
	}
	public static void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	public static void scroll(int px) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, "+px+")");
		
	}

}
