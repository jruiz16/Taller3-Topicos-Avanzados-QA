package org.example.taller3.tests;

import io.restassured.response.Response;
import org.example.taller3.models.User;
import org.example.taller3.pages.DemoqaPage;
import org.example.taller3.services.UserService;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTests {

    private UserService userService;
    private User testUser;
    private WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64/chromedriver.exe");
    }

    @BeforeEach
    public void setup() {
        userService = new UserService();

        String dynamicUsername = "testUser_" + UUID.randomUUID().toString();
        testUser = new User(dynamicUsername, "Password123!");

        driver = new ChromeDriver();
    }

    @Test
    @Order(1)
    public void testCreateUser() throws InterruptedException {

        Response response = userService.createUser(testUser);
        assertEquals(201, response.getStatusCode(), "Creación de Usuario Fallida");

        driver.get("https://demoqa.com/login");

        DemoqaPage demoqaPage = new DemoqaPage(driver);
        demoqaPage.enterUserName(testUser.getUserName());
        demoqaPage.enterPassword(testUser.getPassword());
        demoqaPage.clickLogin();

        Thread.sleep(2000);
        demoqaPage.clickDeleteAccount();
        Thread.sleep(2000);
        demoqaPage.confirmDelete();
        Thread.sleep(2000);
        demoqaPage.acceptAlert();

        demoqaPage.enterUserName(testUser.getUserName());
        demoqaPage.enterPassword(testUser.getPassword());
        demoqaPage.clickLogin();

        String expectedErrorMessage = "Invalid username or password!";
        String actualErrorMessage = demoqaPage.getErrorMessage();
        assertEquals(expectedErrorMessage, actualErrorMessage, "El mensaje de error de usuario elimnado no corresponde.");

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
