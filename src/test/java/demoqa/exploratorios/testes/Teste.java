package demoqa.exploratorios.testes;

import org.junit.Test;
import org.openqa.selenium.By;

import demoqa.exploratorios.drivers.Driver;
import demoqa.exploratorios.metodos.Metodos;
import demoqa.exploratorios.runner.Executa;

public class Teste extends Driver{
	
	By fullName = By.id ("userName");
	By userEmail = By.id("userEmail");
	By currentAddress = By.id("currentAddress");
	By permanentAddress = By.id("permanentAddress");
	

	@Test
	
	public void entrarEmElementesPreencheTexbox(){
		Executa.iniciarTest();
		Metodos.scroll(200);	
		Metodos.clicar("h5","Elements");
		Metodos.clicar("span", "Text Box");
		Metodos.scroll(200);
		Metodos.preencher(fullName, "Dourado");
		Metodos.preencher(userEmail, "wag@Dourado.com");
		Metodos.preencher(currentAddress, "Rua Chafariz");
		Metodos.preencher(permanentAddress, "Chafariz");
		Metodos.scroll(200);
		Metodos.clicar("button", "Submit");			
		
	}
	@Test
	
	public void entrarEmElementsEClicarEmCheckBox() {
		Executa.iniciarTest();
		Metodos.scroll(200);
		Metodos.clicar("h5","Elements");
		Metodos.clicar("span", "Check Box");
		
	}
	
}
