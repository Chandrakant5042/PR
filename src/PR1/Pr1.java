package PR1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
	}

}
