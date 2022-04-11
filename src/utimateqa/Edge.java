package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // Launch the URl
        driver.get(baseURL);
        //Maximisi window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get Current URl
        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginURL = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginURL);
        System.out.println("Current URl = " + driver.getCurrentUrl());

        //Find the email field element

        WebElement Username = driver.findElement(By.id("user[email]"));
        Username.sendKeys("nakranijalpa1987@gmail.com");
        // Find the password field element
        WebElement passwordField1 = driver.findElement(By.id("user[password]"));

        passwordField1.sendKeys("Jalpa123");

        //close the browser
        driver.close();

    }
}
