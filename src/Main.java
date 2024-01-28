import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;



public class Main extends BaseDriver{
    @Test
    public void Us1(){
        WebElement courses=driver.findElement(By.cssSelector("[class='t228__list_item']"));

            new Actions(driver).moveToElement(courses).build().perform();
            driver.findElement(By.xpath("//*[@id=\"nav683676404\"]/div/div[3]/ul/li[1]/div/a/span")).click();
            wait.until(ExpectedConditions.textToBe(By.cssSelector("[field='tn_text_1622986948166']"), "Yazılım Test Mühendisi"));
            Assert.assertTrue("Failed", driver.findElement(By.cssSelector("[field='tn_text_1622986948166']")).getText().contains("Yazılım Test Mühendisi"));
            driver.navigate().back();

            new Actions(driver).moveToElement(courses).build().perform();
            driver.findElement(By.xpath("//*[@id=\"nav683676404\"]/div/div[3]/ul/li[3]/div/a/span")).click();
            wait.until(ExpectedConditions.textToBe(By.cssSelector("[field='tn_text_1622986948166']>[style='text-align: center;']>strong"), "Android Uygulama Geliştirme"));
            Assert.assertTrue("Failed", driver.findElement(By.cssSelector("[field='tn_text_1622986948166']>[style='text-align: center;']>strong")).getText().contains("Android Uygulama Geliştirme"));
            driver.navigate().back();

            new Actions(driver).moveToElement(courses).build().perform();
            driver.findElement(By.xpath("//*[@id=\"nav683676404\"]/div/div[3]/ul/li[4]/div/a/span")).click();
            wait.until(ExpectedConditions.textToBe(By.cssSelector("[field='tn_text_1622986948166']"), "Veri Bilimi Bootcamp"));
            Assert.assertTrue("Failed", driver.findElement(By.cssSelector("[field='tn_text_1622986948166']")).getText().contains("Bootcamp"));
            driver.navigate().back();

            new Actions(driver).moveToElement(courses).build().perform();
            driver.findElement(By.xpath("//*[@id=\"nav683676404\"]/div/div[3]/ul/li[5]/div/a/span")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"rec624635120\"]/div/div/div[6]/a")));
            WebElement btn=driver.findElement(By.xpath("//*[@id=\"rec624635120\"]/div/div/div[6]/a"));
            Assert.assertTrue("Failed",btn.getText().contains("bilgi"));
            driver.navigate().back();
    }
    @Test
    public void Us2(){
        driver.findElement(By.cssSelector("[class='t228__right_buttons_but']>[class='t-btn t-btn_md ']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("campus"));
        driver.navigate().back();
    }
    @Test
    public void Us3(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("[class='tn-atom js-click-zero-stat']")).click();
        WebElement sumbit=driver.findElement(By.cssSelector("[class='t-submit']"));
        js.executeScript("arguments[0].scrollIntoView(true);", sumbit);
        driver.findElement(By.cssSelector("[name='name']")).sendKeys("Deneme Amaçlıdır");
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("testing@gmail.com");
        driver.findElement(By.cssSelector("[name='tildaspec-phone-part[]']")).sendKeys("99999999999");
        Select countrySelect=new Select(driver.findElement(By.cssSelector("[name='country']")));
        countrySelect.selectByIndex(1);
        Select courseSelect=new Select(driver.findElement(By.cssSelector("[name='course']")));
        courseSelect.selectByIndex(1);
        Select surveySelect=new Select(driver.findElement(By.cssSelector("[name='survey']")));
        surveySelect.selectByIndex(1);
        driver.findElement(By.cssSelector("[class='t-checkbox__indicator']")).click();
        js.executeScript("arguments[0].click();", sumbit);
        driver.navigate().back();
    }
    @Test
    public void Us4(){

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement courses=driver.findElement(By.cssSelector("[field='tn_text_1702991410618']"));
        js.executeScript("arguments[0].scrollIntoView(true);", courses);
        js.executeScript("arguments[0].click();", courses);
        //This Us is a problem by a website. Cancel us !
    }
    @Test
    public void Us5(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement courses=driver.findElement(By.cssSelector("[field='tn_text_1702991410618']"));
        js.executeScript("arguments[0].scrollIntoView(true);", courses);
        driver.findElement(By.xpath("//*[@id=\"rec684017893\"]/div/div/div[4]/a/img")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.facebook.com/technostudy.turkiye"));
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"rec684017893\"]/div/div/div[5]/a/img")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.instagram.com/technostudy.tr/"));
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"rec684017893\"]/div/div/div[6]/a/img")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/@TechnoStudyTR"));
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"rec684017893\"]/div/div/div[7]/a/img")).click();
        wait.until(ExpectedConditions.urlToBe("https://www.linkedin.com/company/techno-study-tr/"));
        driver.navigate().back();
    }
    @Test
    public void Us6(){
        driver.findElement(By.cssSelector("[class='t228__imglogo ']")).click();
        wait.until(ExpectedConditions.urlToBe("https://techno.study/tr"));
    }
    @Test
    public void Us7(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement sdet=driver.findElement(By.xpath("//*[@id=\"rec515963420\"]/div/div/div[24]/a"));
        js.executeScript("arguments[0].scrollIntoView(true);", sdet);
        js.executeScript("arguments[0].click();", sdet);
        driver.navigate().back();
        WebElement android=driver.findElement(By.xpath("//*[@id=\"rec515963420\"]/div/div/div[25]/a"));
        js.executeScript("arguments[0].scrollIntoView(true);", android);
        js.executeScript("arguments[0].click();", android);
        driver.navigate().back();
        WebElement data=driver.findElement(By.xpath("//*[@id=\"rec515963420\"]/div/div/div[23]/a"));
        js.executeScript("arguments[0].scrollIntoView(true);", data);
        js.executeScript("arguments[0].click();", data);
        driver.navigate().back();
    }
    @Test
    public void Us8(){
        WebElement acces=driver.findElement(By.xpath("//*[@id=\"form515963431\"]/div[2]/div[9]/div/label/span/a"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", acces);
        js.executeScript("arguments[0].click();", acces);
        WebElement accessAccept=driver.findElement(By.cssSelector("[style='font-size: 52px;']"));
        Assert.assertTrue("Failed",accessAccept.getText().contains("Kullanım Şartları"));
        closeDriver();
    }
}
