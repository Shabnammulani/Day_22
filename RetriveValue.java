import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveValue {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open target page
            driver.get("http://localhost:5500/Employee.html");
            driver.manage().window().maximize();

            // 2. Fill values in the form
            driver.findElement(By.id("Empid")).sendKeys("101");
            driver.findElement(By.id("Empname")).sendKeys("Scott");
            driver.findElement(By.id("Dob")).sendKeys("2002-01-11");
            driver.findElement(By.id("address")).sendKeys("123 ABC");
            driver.findElement(By.id("contactno")).sendKeys("5555555555");
            driver.findElement(By.id("email")).sendKeys("scott@gmail.com");

            // 3. Retrieve the filled values
            String empIdVal = driver.findElement(By.id("Empid")).getAttribute("value");
            String empNameVal = driver.findElement(By.id("Empname")).getAttribute("value");
            String dobVal = driver.findElement(By.id("Dob")).getAttribute("value");
            String addressVal = driver.findElement(By.id("address")).getAttribute("value");
            String contactVal = driver.findElement(By.id("contactno")).getAttribute("value");
            String emailVal = driver.findElement(By.id("email")).getAttribute("value");

            // 4. Print the values
            System.out.println("Retrieved Employee Form Values:");
            System.out.println("Employee ID: " + empIdVal);
            System.out.println("Employee Name: " + empNameVal);
            System.out.println("DOB: " + dobVal);
            System.out.println("Address: " + addressVal);
            System.out.println("Contact No: " + contactVal);
            System.out.println("Email: " + emailVal);

            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
