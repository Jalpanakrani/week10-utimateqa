package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 for Chrome");
        System.out.println("Press 2 for Edge");
        System.out.println("Press 3 for Firefox");
        int num1 = in.nextInt();
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        if(num1==1){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
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
        else if(num1==2){
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
        else if (num1==3){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
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
        else{
            System.out.println("Invalid Selection");
        }
    }
}
