import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
    public static void main(String[] args) {

        // sample
        WebDriver driver = new ChromeDriver();

        Faker faker = new Faker();

        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.chuckNorris().fact());

    }
}
