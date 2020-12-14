import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BDDOriginalPage {
WebDriver driver;
	
	public void site () {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.original.com.br/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

		public void criarconta () {
			driver.findElement(By.xpath("html/body/div[2]/nav[2]/div[2]/div[3]/a")).click();
			
		}
		
		
		
		public void camponome (String nome) {
			driver.findElement(By.id("nome")).sendKeys(nome);
			
		}
		
		public void campocelular (String celular) {
			driver.findElement(By.id("telefone")).sendKeys(celular);
		}
		
		public void campoemail (String email) {
			driver.findElement(By.id("email")).sendKeys(email);
		}
		
		public void campocpf (String cpf) {
			driver.findElement(By.id("cpf")).sendKeys(cpf);
		}
		
		public void enviar () {
			driver.findElement(By.id("btnEnviar")).click();
		}
		
		public void msgfinal () {
			assertTrue(driver.findElement(By.xpath("//*[@id=\"send-sms\"]/label")).getText().contains("Agora você receberá um SMS para baixar o app Banco Original e concluir sua solicitação de abertura de conta!"));
			driver.quit();
		}
		
		public void campoobrigatorio () {
			assertTrue(driver.findElement(By.xpath("//*[@id=\"nomeMsgErrorEmpty\"]")).getText().contains("Preencha nome e sobrenome"));
			driver.quit();
			
			
		}
		
		
}
