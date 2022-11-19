import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste_senai {

	private WebDriver driver;
	
	@Before  
	
	public void abrirNavegador() {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test

	public void testeavegador() {
		
		//driver.get("https://informatica.sp.senai.br");
		//driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
		//driver.findElement(By.id("Busca1_btnBusca")).click();
		
		
		driver.get("https://megacanais.com/aovivo/");
		driver.findElement(By.className("search-icon")).click();
		driver.findElement(By.id("is-search-input-83817")).sendKeys("The big bang theory");
		driver.findElement(By.className("is-search-submit")).click();
		
		
	}
}

