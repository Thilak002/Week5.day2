package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	
	@BeforeClass
	public void setUp() {
		FileName = "createLead1";
	}
	
	@Test(dataProvider ="fetch data")
	public void createlead(String Cname,String Fname,String Lname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		driver.findElement(By.name("submitButton")).click();
		
}
}
	//@DataProvider(name = "fetch data")
	//public String[][] senddata() throws IOException {
		
		
		//return ReadExcel.readExcel();
       // String[][] data = new String[2][3];
        
       // data[0][0] = "TestLeaf";
       // data[0][1] = "Hari";
       // data[0][2] = "R";
        
       // data[1][0] = "Qeagle";
       // data[1][1] = "Thilak";
      //  data[1][2] = "G";
        
       
	







