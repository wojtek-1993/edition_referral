package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Actions {

    public static void click(WebElement element) {

        System.out.println("Clicking on element: " + element.toString());
        element.click();
    }

    public static void sendKeys(WebElement element, String text) {

        click(element);
        System.out.println("Sending keys: " + text + " to element: " + element.toString());
        element.clear();
        element.sendKeys(text);

    }

    public static void waitForElementToBeClickable(WebElement element) {

        System.out.println("Waiting for text: " + " to be present in element: " + element.toString());
        WebDriverWait wait = new WebDriverWait(WebDriverSingleton.getInstance(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void windowHandleSwitchTo(WebDriver driver) {

        String windowHandleBefore = driver.getWindowHandle(); // Magazynuje bieżący uchwyt okna
        for(String eachwindow : driver.getWindowHandles()) { // przełączenie się na nowo otwarte okno


            driver.switchTo().window(eachwindow); // podaję nazwę okna
        }

        //click(element);
        //driver.switchTo().window(windowHandleBefore);
    }

    public static void setDatePicker(WebDriver driver) { //DatePicker do analizy metoda przechwycenia jQuery calender

       List<WebElement> list = driver.findElements(By.xpath("//tr[@class=\"DynarchCalendar-week\"]/td/div"));

       //Pobranie daty z DatePicker, ustawienie Daty z kalendarza jQuery. (po xpath), Lista WebElementów czyli daty.

       for(WebElement element : list) {
           String date = element.getAttribute("dyc-date"); // podaję w metodzie nazwę atrybutu daty

           //Convert String to Integer
           int dateInt = Integer.parseInt(date);

           if (dateInt == (10)) {
               element.click();
               break;
           }

       }

    }
}
