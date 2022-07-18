import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Singleton {

    private static WebDriver driver;

    public static WebDriver getDriverInstance() throws Exception {
    if (driver == null)
    {System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
    driver = new ChromeDriver();
    String type = getData("URL");
    if (type.equals("Chrome"))
    {System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
    driver = new ChromeDriver();}
    else if (type.equals("FF"))
    {System.setProperty("webdriver.firefox.driver", "C:\\geckodriver\\geckodriver.exe");
    driver = new FirefoxDriver();}
    }
    return driver;}
    private static String getData (String keyName) throws Exception
    {ClassLoader classLoader = Singleton.class.getClassLoader();
    String xmlFilePath = String.valueOf(new File(classLoader.getResource("data.xml").getFile()));
    File fXmlFile = new File(xmlFilePath);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(fXmlFile);
    doc.getDocumentElement().normalize();
    return xmlFilePath;}}


