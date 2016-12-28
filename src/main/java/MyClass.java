import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

    public static void main(String[] args) {

        //Definimos el navegador que queremos usar
        WebDriver driver = new FirefoxDriver();
        //Indicamos donde se encuentra el fichero webdriver
        System.setProperty("webdriver.gecko.driver","geckodriver");

        //Abrimos una página en el navegador
        driver.get("https://seleniumenespanol.wordpress.com/");

        //Cerramos el navegador
        driver.close();
        driver.quit();
    }
}
