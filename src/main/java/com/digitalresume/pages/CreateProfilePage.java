package com.digitalresume.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProfilePage {
	
	WebDriver driver;
	public CreateProfilePage(WebDriver driver)
    {
        this.driver=driver;
    }
//login....................................................................................................................................
	
	public void Setusername(String Uname) 
	{
		WebElement usrname=driver.findElement(By.xpath("//input[@name='Username']"));
		usrname.sendKeys(Uname);
	}
	public void Setpassword(String Pssd)
	{
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(Pssd);
	}
	public void checkbox()
	{
		WebElement element = driver.findElement(By.xpath("//label[@for='checkbox']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	public void login()
	{
		
		WebElement element = driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
//create profile.......................................................................................................................
	
	public void myProfile()
	{
		
	WebElement element = driver.findElement(By.xpath("//a[normalize-space()='My Profile']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	public void create()
	{
		
	WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Create a Profile Now']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	
//Graduation............................................................................................................................
	
	public void setGcourse()
	{
		
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[9]/select[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//option[contains(text(),'BTECH')]")).click();	
	}
    
	public void setGstream()
	{
	
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[9]/select[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//option[contains(text(),'IT/CS')]")).click();	
	}

	public void setGpercentage(String per)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[9]/input[1]"));
        element.sendKeys(per);
    }
	
	public void setGcollege(String col)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[9]/input[2]"));
        element.sendKeys(col);
    }
	
	public void setGpassyear(String yr)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[9]/input[3]"));
        element.sendKeys(yr);
    }

//Post graduation.......................................................................................................................................
	
	public void setPGcourse()
	{
		
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[10]/select[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//option[contains(text(),'MTECH')]")).click();	
	}
    
	public void setPGstream()
	{
	
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[10]/select[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[10]/select[2]/option[2]")).click();	
	}

	public void setPGpercentage(String per)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[10]/input[1]"));
        element.sendKeys(per);
    }
	
	public void setPGcollege(String col)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[10]/input[2]"));
        element.sendKeys(col);
    }
	
	public void setPGpassyear(String yr)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/p[10]/input[3]"));
        element.sendKeys(yr);
    }
	
//Adding projects.......................................................................................................................
	
	public void setProAddClick() {
		WebElement element = driver.findElement(By.xpath("//table[@formarrayname='projects']//button[@type='button'][normalize-space()='Add']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
	

	public void setProTitle(String tle)
    {
        WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-sampleform[1]/div[1]/form[1]/table[1]/tr[2]/td[1]/input[1]"));
        element.sendKeys(tle);
		
    }
	
	public void setProDesc(String des)
    {
        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='desc']"));
        element.sendKeys(des);
		
    }
	
	public void setProRemoveClick() {
		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Remove']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
	
//Add additional qualifications...............................................................................................................
	
	public void setQualAddClick() {
		WebElement element = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
	

	public void setCourseType()
    {
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/table[2]/tr[2]/td[1]/select[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//option[@value='Short-term Course']")).click();	
		
    }
	
	public void setCourseName(String nam)
    {
        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='course_name']"));
        element.sendKeys(nam);
		
    }
	
	public void setCoursePercent(String per)
    {
        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='percentage']"));
        element.sendKeys(per);
		
    }
	
	public void setQualRemoveClick() {
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/table[2]/tr[2]/td[4]/button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
	
//Job experience......................................................................................................................................
	
	public void setJobAddClick() {
		WebElement element = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
	
	public void setJobTitle(String tle)
    {
        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='job_title']"));
        element.sendKeys(tle);
		
    }
	
	public void setFrom(String frm)
    {
        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='exp_from']"));
        element.sendKeys(frm);
		
    }
	
	public void setTo(String to)
    {
        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='exp_to']"));
        element.sendKeys(to);
		
    }
	public void setJobRemoveClick() {
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-sampleform[1]/div[1]/form[1]/table[3]/tr[2]/td[4]/button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
//Logging out....................................................................................................................................
	
	public void logout()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	public void signup()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Signup now']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
//Again login and enter to edit profile (existing user).................................................................................................
	public void editProfile()
	{
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	
//Edit High school.....................................................................................................................................................
	
	public void setHsTitle()
	{
		
		WebElement element = driver.findElement(By.xpath("//select[@id='edu_title']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.cssSelector("select[id='edu_title'] option[value='Board of Public Examination']")).click();	
	}
    

	public void setHspercentage(String per)
    {
        WebElement element=driver.findElement(By.xpath("//input[@id='edu_desc']"));
        element.clear();
        element.sendKeys(per);
    }
	
	public void setHsSchool(String s)
    {
        WebElement element=driver.findElement(By.xpath("//input[@id='edu_school']"));
        element.clear();
        element.sendKeys(s);
    }
	
	public void setHsYear(String yr)
    {
        WebElement element=driver.findElement(By.xpath("//input[@id='edu_year']"));
        element.clear();
        element.sendKeys(yr);
    }
//Edit Higher secondary.................................................................................................................................
	
	public void setHssTitle()
	{
		
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[8]/select[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[8]/select[1]/option[1]")).click();	
	}
    

	public void setHsspercentage(String per)
    {
        WebElement element=driver.findElement(By.xpath("//p[@formgroupname='higherschools']//input[@placeholder='Percentage Scored']"));
        element.clear();
        element.sendKeys(per);
    }
	
	public void setHssSchool(String s)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[8]/input[2]"));
        element.clear();
        element.sendKeys(s);
    }
	
	public void setHssYear(String yr)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[8]/input[3]"));
        element.clear();
        element.sendKeys(yr);
    }
// Edit graduation..................................................................................................................................
	public void seteGcourse()
	{
		
		WebElement element = driver.findElement(By.xpath("//p[@formgroupname='graduations']//select[@formcontrolname='edu_title']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//option[contains(text(),'BCOM')]")).click();	
	}
    
	public void seteGstream()
	{
	
		WebElement element = driver.findElement(By.xpath("//p[@formgroupname='graduations']//select[@formcontrolname='edu_stream']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[9]/select[2]/option[11]")).click();	
	}

	public void seteGpercentage(String per)
    {
        WebElement element=driver.findElement(By.xpath("//p[@formgroupname='graduations']//input[@placeholder='Percentage Scored']"));
        element.clear();
        element.sendKeys(per);
    }
	
	public void seteGcollege(String col)
    {
        WebElement element=driver.findElement(By.xpath("//p[@formgroupname='graduations']//input[@placeholder='Institution Name']"));
        element.clear();
        element.sendKeys(col);
    }
	
	public void seteGpassyear(String yr)
    {
        WebElement element=driver.findElement(By.xpath("//p[@formgroupname='graduations']//input[@placeholder='Year of Pass']"));
        element.clear();
        element.sendKeys(yr);
    }

// Edit Post graduation.......................................................................................................................................
	
	public void setePGcourse()
	{
		
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[10]/select[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//option[contains(text(),'MCOM')]")).click();	
	}
    
	public void setePGstream()
	{
	
		WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[10]/select[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[10]/select[2]/option[11]")).click();	
	}

	public void setePGpercentage(String per)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[10]/input[1]"));
        element.clear();
        element.sendKeys(per);
    }
	
	public void setePGcollege(String col)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[10]/input[2]"));
        element.clear();
        element.sendKeys(col);
    }
	
	public void setePGpassyear(String yr)
    {
        WebElement element=driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/p[10]/input[3]"));
        element.clear();
        element.sendKeys(yr);
    }
//Edit Adding projects.......................................................................................................................
	
		public void seteProAddClick() {
			WebElement element = driver.findElement(By.xpath("//table[@formarrayname='projects']//button[@type='button'][normalize-space()='Add']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		

		public void seteProTitle(String tle)
	    {
	        WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-editprofile[1]/div[1]/form[1]/table[1]/tr[2]/td[1]/input[1]"));
	        element.clear();
	        element.sendKeys(tle);
			
	    }
		
		public void seteProDesc(String des)
	    {
	        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='desc']"));
	        element.clear();
	        element.sendKeys(des);
			
	    }
		
		public void seteProRemoveClick() {
			WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Remove']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		
//Add additional qualifications...............................................................................................................
		
		public void seteQualAddClick() {
			WebElement element = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		

		public void seteCourseType()
	    {
			WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/table[2]/tr[2]/td[1]/select[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			driver.findElement(By.xpath("//option[@value='Short-term Course']")).click();	
			
	    }
		
		public void seteCourseName(String nam)
	    {
	        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='course_name']"));
	        element.clear();
	        element.sendKeys(nam);
			
	    }
		
		public void seteCoursePercent(String per)
	    {
	        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='percentage']"));
	        element.clear();
	        element.sendKeys(per);
			
	    }
		
		public void seteQualRemoveClick() {
			WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/table[2]/tr[2]/td[4]/button[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		
	//Job experience......................................................................................................................................
		
		public void seteJobAddClick() {
			WebElement element = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[3]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		
		public void seteJobTitle(String tle)
	    {
	        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='job_title']"));
	        element.clear();
	        element.sendKeys(tle);
			
	    }
		
		public void seteFrom(String frm)
	    {
	        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='exp_from']"));
	        element.clear();
	        element.sendKeys(frm);
			
	    }
		
		public void seteTo(String to)
	    {
	        WebElement element=driver.findElement(By.xpath("//input[@formcontrolname='exp_to']"));
	        element.clear();
	        element.sendKeys(to);
			
	    }
		public void seteJobRemoveClick() {
			WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-editprofile[1]/div[1]/form[1]/table[3]/tr[2]/td[4]/button[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
//logout and deleting a profile.............................................................................................................................	
		public void deleteClick() {
			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Delete Profile']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			alertWait();

	    }
		private void alertWait() {
	        // TODO Auto-generated method stub
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        try {
	            wait.until(ExpectedConditions.alertIsPresent());
	            Alert alert = driver.switchTo().alert();
	            String alertText = alert.getText();
	            System.out.println("Alert Text: " + alertText);
	            alert.accept();
	        } catch (Exception e) {
	            System.out.println("No alert present or unable to handle alert: " + e.getMessage());
	        }
	    }

		
}

	
	
