package org.example.taller3.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoqaPage {
    private final WebDriver driver;

    // Selectores existentes
    private final By userNameField = By.id("userName");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login");
    private final By deleteAccountButton = By.xpath("//button[contains(text(), 'Delete Account')]");
    private final By confirmDeleteButton = By.id("closeSmallModal-ok");
    private final By errorMessage = By.id("name");

    public DemoqaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName) {
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButtonElement);
        loginButtonElement.click();
    }

    // Método para hacer clic en el botón de eliminar cuenta
    public void clickDeleteAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(deleteAccountButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteButton);
        deleteButton.click();
    }

    // Método para confirmar la eliminación en el modal emergente
    public void confirmDelete() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton));
        confirmButton.click();
    }

    // Método para aceptar el alert que aparece después de eliminar la cuenta
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // Nuevo método para obtener el mensaje de error
    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return errorMessageElement.getText();
    }
}
