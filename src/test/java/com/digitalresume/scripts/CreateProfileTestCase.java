
package com.digitalresume.scripts;

import org.testng.annotations.Test;

import com.digitalresume.pages.CreateProfilePage;

public class CreateProfileTestCase extends TestBase {

	CreateProfilePage tesobj=null;
	@Test(priority=1)
	public void Login() {
		tesobj=new CreateProfilePage(driver);
		tesobj.Setusername(prop.getProperty("Username"));
		tesobj.Setpassword(prop.getProperty("Password"));
		tesobj.checkbox();
		tesobj.login();
		
	}
	@Test(priority=2)
	public void CreateProfile() {
		tesobj=new CreateProfilePage(driver);
		tesobj.myProfile();
		tesobj.create();
		
	}
	@Test(priority=3)
	public void Graduation() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setGcourse();
		tesobj.setGstream();
		tesobj.setGpercentage(prop.getProperty("Gpercentage"));
		tesobj.setGcollege(prop.getProperty("Gcollege"));
		tesobj.setGpassyear(prop.getProperty("Gyearpass"));
		
	}
	
	@Test(priority=4)
	public void PostGraduation() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setPGcourse();
		tesobj.setPGstream();
		tesobj.setPGpercentage(prop.getProperty("PGpercentage"));
		tesobj.setPGcollege(prop.getProperty("PGcollege"));
		tesobj.setPGpassyear(prop.getProperty("PGyearpass"));
		
	}
	
	@Test(priority=5)
	public void Project() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setProAddClick();
		tesobj.setProTitle(prop.getProperty("ProjectTitle"));
		tesobj.setProDesc(prop.getProperty("ProjectDescription"));
		tesobj.setProRemoveClick();
	}

	@Test(priority=6)
	public void AdditionalQualification() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setQualAddClick();
		tesobj.setCourseType();
		tesobj.setCourseName(prop.getProperty("CourseName"));
		tesobj.setCoursePercent(prop.getProperty("CoursePercentage"));
		tesobj.setQualRemoveClick();
		
	}
	
	@Test(priority=7)
	public void JobExperience() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setJobAddClick();
		tesobj.setJobTitle(prop.getProperty("JobTitle"));
		tesobj.setFrom(prop.getProperty("From"));
		tesobj.setTo(prop.getProperty("To"));
		tesobj.setJobRemoveClick();
		
	}
	@Test(priority=8)
	public void enterToEditProfile() {
		tesobj=new CreateProfilePage(driver);
		tesobj.logout();
		tesobj.signup();
		
	}
	@Test(priority=9)
	public void eLogin() {
		tesobj=new CreateProfilePage(driver);
		tesobj.Setusername(prop.getProperty("eUsername"));
		tesobj.Setpassword(prop.getProperty("ePassword"));
		tesobj.checkbox();
		tesobj.login();
		tesobj.myProfile();
		tesobj.editProfile();
		
	}
	@Test(priority=10)
	public void highSchool() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setHsTitle();
		tesobj.setHspercentage(prop.getProperty("HSpercentage"));
		tesobj.setHsSchool(prop.getProperty("HSschool"));
		tesobj.setHsYear(prop.getProperty("HSyear"));
		
	}
	@Test(priority=11)
	public void highSecondarySchool() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setHssTitle();
		tesobj.setHsspercentage(prop.getProperty("HSSpercentage"));
		tesobj.setHssSchool(prop.getProperty("HSSschool"));
		tesobj.setHssYear(prop.getProperty("HSSyear"));
		
	}
	@Test(priority=12)
	public void eGraduation() {
		tesobj=new CreateProfilePage(driver);
		tesobj.seteGcourse();
		tesobj.seteGstream();
		tesobj.seteGpercentage(prop.getProperty("eGpercentage"));
		tesobj.seteGcollege(prop.getProperty("eGcollege"));
		tesobj.seteGpassyear(prop.getProperty("eGyearpass"));
		
	}
	
	@Test(priority=13)
	public void ePostGraduation() {
		tesobj=new CreateProfilePage(driver);
		tesobj.setePGcourse();
		tesobj.setePGstream();
		tesobj.setePGpercentage(prop.getProperty("ePGpercentage"));
		tesobj.setePGcollege(prop.getProperty("ePGcollege"));
		tesobj.setePGpassyear(prop.getProperty("ePGyearpass"));
		
	}
	@Test(priority=14)
	public void eProject() {
		tesobj=new CreateProfilePage(driver);
		tesobj.seteProAddClick();
		tesobj.seteProTitle(prop.getProperty("eProjectTitle"));
		tesobj.seteProDesc(prop.getProperty("eProjectDescription"));
		tesobj.seteProRemoveClick();
	}

	@Test(priority=15)
	public void eAdditionalQualification() {
		tesobj=new CreateProfilePage(driver);
		tesobj.seteQualAddClick();
		tesobj.seteCourseType();
		tesobj.seteCourseName(prop.getProperty("eCourseName"));
		tesobj.seteCoursePercent(prop.getProperty("eCoursePercentage"));
		tesobj.seteQualRemoveClick();
		
	}
	
	@Test(priority=16)
	public void eJobExperience() {
		tesobj=new CreateProfilePage(driver);
		tesobj.seteJobAddClick();
		tesobj.seteJobTitle(prop.getProperty("eJobTitle"));
		tesobj.seteFrom(prop.getProperty("eFrom"));
		tesobj.seteTo(prop.getProperty("eTo"));
		tesobj.seteJobRemoveClick();
		
	}
	
	@Test(priority=17)
	public void dLogin() {
		tesobj=new CreateProfilePage(driver);
		tesobj.logout();
		tesobj.signup();
		tesobj.Setusername(prop.getProperty("dUsername"));
		tesobj.Setpassword(prop.getProperty("dPassword"));
		tesobj.checkbox();
		tesobj.login();
		tesobj.myProfile();
	}
	
	@Test(priority=18)
	public void delete() {
		tesobj=new CreateProfilePage(driver);
		tesobj.deleteClick();
		
	}
}
