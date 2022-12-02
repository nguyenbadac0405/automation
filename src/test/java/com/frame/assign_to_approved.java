package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Common;

public class assign_to_approved {
	protected WebDriver driver;

	public assign_to_approved(WebDriver driver) {
		this.driver = driver;
	}

	public void ass_to_app_MDR() {
		// find case by id
		driver.findElement(By.xpath(".//span[text()='Medical History']")).click();

		// Medical History
		System.out.println("-----------------Assign to Approve-------------------------");
		System.out.println("Provider check Medical History");
		driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
		Common.waitSec(3);
		driver.findElement(By.xpath("//*[@name='data[patient_personal_history_progress_note_phmx]']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(2);

		// Family History
		System.out.println("Provider check Family History");
		Common.waitSec(3);
		driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// exiting medications
		System.out.println("Provider check Exiting Medications");
		driver.findElement(By.xpath("//input[@name='shipped']")).click();
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[5]/button")).click();
		Common.waitSec(5);

		// review of systems
		System.out.println("Provider Review of Systems");
		driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(5);

		// Diagnosis
		System.out.println("Provider select Diagnosis");
		driver.findElement(By.xpath(".//span[text()='Diagnosis']")).click();
		Common.waitSec(3);
		driver.findElement(By.xpath("//*[@value='2 Year License']")).click();
		driver.findElement(
				By.xpath("//*[@id=\"patient-dashboard\"]/div[5]/div[3]/div[4]/div[2]/div/div[2]/div[1]/input"))
				.sendKeys("a");
		Common.waitSec(2);
		driver.findElement(
				By.xpath("//*[@id=\"patient-dashboard\"]/div[5]/div[3]/div[4]/div[2]/div/div[2]/div[3]/ul/li[1]"))
				.click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(2);

		// asseessment & plan
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
				.sendKeys("There is all plan that the provider is setting for you.");
		System.out.println("Provider set Asseessment & Plan");
		Common.waitSec(3);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// billing button
		System.out.println("check billing");
		WebElement element = driver.findElement(By.className("gk-pos-relative"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		Common.waitSec(2);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/input")).sendKeys("1");
		Common.waitSec(1);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[3]/div[1]/input")).sendKeys("1");
		Common.waitSec(1);
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//button[text()='OK']")).click();
		Common.waitSec(5);

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);

	}

	public void assign_to_approved_MDL() {
		System.out.println("-----------------Assign to Approve-------------------------");
		// patient's Medical History
		System.out.println("Provider check Patient's Medical History");
		driver.findElement(By.xpath(".//span[text()=\"Patient's Medical History\"]")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath("//*[@name='data[patient_personal_history_progress_note_phmx]']")).sendKeys("test");
//		System.out.println("check 2");
		driver.findElement(By.xpath("//*[@name='data[patient_personal_history_progress_note_confirm_doctor]']"))
				.click();
		Common.waitSec(1);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// exiting medications
		System.out.println("Provider check Exiting Medications");
		driver.findElement(By.xpath("//*[@name='data[medication_confirm_patient]']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='data[medication_note]']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='shipped']")).click();
//		System.out.println("check 3");
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(3);

		// Diagnosis
		System.out.println("Provider set Diagnosis");
		driver.findElement(By.xpath(".//span[text()='Diagnosis']")).click();
//		System.out.println("check 4");
		Common.waitSec(2);
//		driver.findElement(By.xpath("//*[@value='2 Year License']")).click();
		driver.findElement(
				By.xpath("//*[@id=\"patient-dashboard\"]/div[5]/div[3]/div[4]/div[2]/div/div[2]/div[1]/input"))
				.sendKeys("a");
		Common.waitSec(3);
//		System.out.println("check 5");
		driver.findElement(
				By.xpath("//*[@id=\"patient-dashboard\"]/div[5]/div[3]/div[4]/div[2]/div/div[2]/div[3]/ul/li[1]"))
				.click();
//		System.out.println("check 6");
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(3);

		// review of systems
		System.out.println("Provider Review of Systems");
		driver.findElement(By.xpath("//input[@name='data[review_of_system_confirm]']")).click();
//		System.out.println("check 7");
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(2);

		// assessment & plan
		System.out.println("Provider set Assessment & Plan");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
				.sendKeys("There is all plan that the provider is setting for you.");
//		System.out.println("check 9");s
		Common.waitSec(2);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// billing button
		System.out.println("check billing");
		WebElement element = driver.findElement(By.className("gk-pos-relative"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		Common.waitSec(2);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/input")).sendKeys("1");
		Common.waitSec(1);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[3]/div[1]/input")).sendKeys("1");
		Common.waitSec(1);
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//button[text()='OK']")).click();
		Common.waitSec(5);

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);
	}

	public void EEG_to_approve1() {
		// patient infor
		System.out.println("Check Patient Information");
		driver.findElement(By.xpath(".//input[@value='No']")).click();
		Common.waitSec(1);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

//		//Medical History
		System.out.println("Check Medical History");
		driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
				.sendKeys("test");
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

//		//Screen questionnaire
		System.out.println("Check Screening Questionnaire");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[8]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[9]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[10]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[11]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[12]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[13]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[14]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[15]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[16]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[17]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[18]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[21]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[22]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[23]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[24]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[25]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[26]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[27]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[5]/div[3]/div[3]/div/div/div[1]/div[28]/div[1]/div[2]/label/input"))
				.click();
		driver.findElement(By.xpath(".//*[@name='data[screening_questionnaire_confirm1]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(5);

		// Family History
		System.out.println("Check Family History");
		driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);
		// Diagnosis
		System.out.println("Set Diagnosis");
		driver.findElement(By.xpath(".//div[text()='G40.209']")).click();
		driver.findElement(By.xpath(".//div[text()='G40.309']")).click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(5);

		// medication
		System.out.println("Check Medications");
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
				.click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(5);

		// review of systems
		System.out.println("Review of Systems");
		driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(5);

		// assessment & plan
		System.out.println("Set Assessment & Plan");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
				.sendKeys("There is all plan that the provider is setting for you.");
		Common.waitSec(2);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);

	}

	public void to_approve3() {

		// set assessment & plan
		driver.findElement(By.xpath(".//span[text()='Assessment & Plan']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//input[@value='Yes']")).click();
		Common.waitSec(1);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(2);
		// approve
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);

	}

	public void Covid_to_approve() {

		// medications
		driver.findElement(By.xpath(".//span[text()='Medications']")).click();
		System.out.println("Check Medications");
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
				.click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(3);

		// Diagnosis
		System.out.println("Set Diagnosis");
		driver.findElement(By.xpath(".//div[text()='J40']")).click();
		driver.findElement(By.xpath(".//div[text()='J80']")).click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(5);

		// review of systems
		System.out.println("Review of Systems");
		driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(5);

		// assessment & plan
		System.out.println("Set Assessment & Plan");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_hpi]']"))
				.sendKeys("There is all HPI that the provider is setting for you.");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
				.sendKeys("There is all plan that the provider is setting for you.");
		Common.waitSec(2);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);
	}

	public void Genetics_to_approve1(String type, String lab) {

		// TYPE == CGX
		if (type.equals("CGX")) {
			if (lab.equals("CGX - R&D")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
						.sendKeys("test");
				driver.findElement(By.name("data[medical_history_confirm_doctor]")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Family History
				System.out.println("Check Family History");
				driver.findElement(By.name("data[family_history_member_1_related_health_issue]")).sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// medication
				System.out.println("Check Medications");
				driver.findElement(
						By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
						.click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='Z80.1']")).click();
				driver.findElement(By.xpath(".//div[text()='C44.300']")).click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");

				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);
				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

			}
			if (lab.equals("CGX - Biogroup")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.name("data[medical_history_patient_question2]")).sendKeys("test");
				driver.findElement(By.name("data[medical_history_patient_question3]")).sendKeys("test");
				driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
						.sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Family History
				Actions actions = new Actions(driver);
				System.out.println("Check Family History");
				WebElement element = driver.findElement(By.xpath(".//span[text()='Family History']"));
				actions.moveToElement(element).click().build().perform();
				Common.waitSec(2);
				driver.findElement(By.name("data[family_history_member_1_related_health_issue]")).sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='Z80.1']")).click();
				driver.findElement(By.xpath(".//div[text()='C44.300']")).click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");

				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);
				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);
			}

		}

		// TYPE == CARDIO
		if (type.equals("Cardio")) {
			// LAB == CARDIO - ALIGN
			if (lab.equals("Cardio - ALIGN")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// patient's Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()=\"Patient's Personal History\"]")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
						.sendKeys("test");
				driver.findElement(By.name("data[patient_patient_history_confirm_doctor]")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Family History
				System.out.println("Check Family History");
				driver.findElement(By.name("data[family_history_member_1_related_health_issue]")).sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// medication
				System.out.println("Check Medications");
				driver.findElement(
						By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
						.click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='E78.01']")).click();
				driver.findElement(By.xpath(".//div[text()='E78.49']")).click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");

				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);
				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

			}
		}

		// TYPE == PGX
		if (type.equals("PGX")) {
			if (lab.equals("PGX_ADVANTA")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// patient's Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
				Common.waitSec(2);
				driver.findElement(By.name("data[patient_personal_history_progress_note_phmx]")).sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// medication
				System.out.println("Check Medications");
				driver.findElement(
						By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
						.click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='Z13.79']")).click();
				driver.findElement(By.xpath(".//div[text()='I25.9']")).click();
				driver.findElement(By.xpath(".//div[text()='I82.890']")).click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(3);

				// review of systems
				System.out.println("Review of Systems");

				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);
				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);
			}
		}
		if (type.equals("Pulmonary")) {
			if (lab.equals("Pulmonary AdvaGenix")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// patient's Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()=\"Patient's Medical History\"]")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
						.sendKeys("test");
				driver.findElement(By.name("data[patient_personal_history_confirm_doctor]")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Family History
				System.out.println("Check Family History");
				driver.findElement(By.name("data[family_history_member_1_related_health_issue]")).sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// medication
				System.out.println("Check Medications");
				driver.findElement(
						By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
						.click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='J43.9']")).click();
				driver.findElement(By.xpath(".//div[text()='J45.99']")).click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");

				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);
				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);
			}
		}

		if (type.equals("Diabetes")) {
			if (lab.equals("Diabetes - INFINITY")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
				Common.waitSec(2);
				driver.findElement(By.name("data[patient_personal_history_progress_note_phmx]")).sendKeys("test");
				driver.findElement(By.name("data[patient_personal_history_confirm_sale_2]")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// medication
				System.out.println("Check Medications");
				driver.findElement(
						By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
						.click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// Family History
				System.out.println("Check Family History");
				driver.findElement(By.name("data[family_history_member_1_related_health_issue]")).sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);

				// Diagnosis
				driver.findElement(By.xpath(".//span[text()='Diagnosis']")).click();
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='E11.9']")).click();
				driver.findElement(By.xpath(".//div[text()='E78.00']")).click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");
				driver.findElement(By.name("data[review_of_system_confirm]")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);

				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);
			}
		}

		if (type.equals("Immunodeficiency")) {
			if (lab.equals("Immunodeficiency - Biogroup")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// patient's Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()=\"Patient's Personal History\"]")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
						.sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Family History
				driver.findElement(By.xpath(".//span[text()='Family History']")).click();
				System.out.println("Check Family History");
				driver.findElement(By.name("data[family_history_member_1_immunideficiency_condition]"))
						.sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[family_history_member_confirm_doctor]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//div[text()='A182']")).click();
				driver.findElement(By.xpath(".//div[text()='D609']")).click();
				driver.findElement(By.xpath(".//div[text()='Z83.2']")).click();
				Common.waitSec(1);
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");
				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);
				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);
			}
		}

		if (type.equals("NEUROCOGNITIVE")) {
			if (lab.equals("Neurocognitive-Diax")) {
				// patient infor
				System.out.println("Check Patient Information");
				driver.findElement(By.xpath(".//input[@value='Yes']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Medical History
				System.out.println("Check Medical History");
				driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
				Common.waitSec(2);
				driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
						.sendKeys("test");
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Family History
				driver.findElement(By.xpath(".//span[text()='Family History']")).click();
				System.out.println("Check Family History");
				Common.waitSec(2);
				driver.findElement(By.name("data[family_history_member_1_related_health_issue]")).sendKeys("test");
				driver.findElement(By.name("data[family_history_member_confirm_doctor]")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);

				// Diagnosis
				System.out.println("Set Diagnosis");
				driver.findElement(By.xpath(".//input[@class='input-search']")).sendKeys("test");
				Common.waitSec(2);
				driver.findElement(By
						.xpath("//*[@id=\"patient-dashboard\"]/div[5]/div[3]/div[4]/div[3]/div/div[2]/div[3]/ul/li[1]"))
						.click();
				Common.waitSec(1);
				driver.findElement(By.xpath("//span[text()='Done']")).click();
				Common.waitSec(1);
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(3);

				// medication
				System.out.println("Check Medications");
				driver.findElement(
						By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
						.click();
				driver.findElement(By.xpath(".//button[text()='Save']")).click();
				Common.waitSec(5);

				// review of systems
				System.out.println("Review of Systems");
				driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(5);

				// assessment & plan
				System.out.println("Set Assessment & Plan");
				driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
						.sendKeys("There is all plan that the provider is setting for you.");
				Common.waitSec(2);

				driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
				Common.waitSec(3);
			}
		}

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);
	}

	public void CGM_to_approve() {
		
		//Order detail
		driver.findElement(By.xpath(".//span[text()='Order details']")).click();
		driver.findElement(By.name("data[test_requirements_type][]")).click();
		driver.findElement(By.name("data[test_requirements_type1][]")).click();
		driver.findElement(By.name("data[test_requirements_confirm]")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(2);
		
		// Medical History
		System.out.println("Check Medical History");
		driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
				.sendKeys("test");
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// medications
		driver.findElement(By.xpath(".//span[text()='Medications']")).click();
		System.out.println("Check Medications");
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
				.click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(3);

		// Diagnosis
		System.out.println("Set Diagnosis");
		driver.findElement(By.xpath(".//div[text()='E10.65']")).click();
		driver.findElement(By.xpath(".//div[text()='E10.9']")).click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(5);

		// review of systems
		System.out.println("Review of Systems");
		driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(5);

		// assessment & plan
		System.out.println("Set Assessment & Plan");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_hpi]']"))
				.sendKeys("There is all HPI that the provider is setting for you.");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
				.sendKeys("There is all plan that the provider is setting for you.");
		Common.waitSec(2);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);
	}
	
public void Beauty_to_approve() {
		
		//Order detail
		driver.findElement(By.xpath(".//span[text()='Order details']")).click();
		driver.findElement(By.name("data[test_requirements_type][]")).click();
		driver.findElement(By.name("data[test_requirements_type1][]")).click();
		driver.findElement(By.name("data[test_requirements_confirm]")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(2);
		
		// Medical History
		System.out.println("Check Medical History");
		driver.findElement(By.xpath(".//span[text()='Medical History']")).click();
		Common.waitSec(2);
		driver.findElement(By.xpath(".//*[@name='data[patient_personal_history_progress_note_phmx]']"))
				.sendKeys("test");
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// medications
		driver.findElement(By.xpath(".//span[text()='Medications']")).click();
		System.out.println("Check Medications");
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[3]/div[3]/div[2]/div[4]/label/input"))
				.click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(3);

		// Diagnosis
		System.out.println("Set Diagnosis");
		driver.findElement(By.xpath(".//div[text()='E10.65']")).click();
		driver.findElement(By.xpath(".//div[text()='E10.9']")).click();
		driver.findElement(By.xpath(".//button[text()='Save']")).click();
		Common.waitSec(5);

		// review of systems
		System.out.println("Review of Systems");
		driver.findElement(By.xpath("//*[@name='data[review_of_system_confirm]']")).click();
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(5);

		// assessment & plan
		System.out.println("Set Assessment & Plan");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_hpi]']"))
				.sendKeys("There is all HPI that the provider is setting for you.");
		driver.findElement(By.xpath("//*[@name='data[assessment_plan_plan]']"))
				.sendKeys("There is all plan that the provider is setting for you.");
		Common.waitSec(2);
		driver.findElement(By.xpath("//*[@name='data[submit]']")).click();
		Common.waitSec(3);

		// approved
		driver.findElement(By.xpath("//*[@id='patient-dashboard']/div[5]/div[2]/div[1]/div[3]/div[1]/div[3]/button"))
				.click();
		Common.waitSec(3);
		driver.findElement(By.xpath(".//button[text()='Yes']")).click();
		System.out.println("-------------------------Done Approve----------------------------");
		Common.waitSec(5);
	}

}