package com.scripts;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Common;
import com.frame.ExcelHelpers;
import com.frame.FPC_Approved;
import com.frame.GetDriver;
import com.frame.approve_to_assign_follow_up;
import com.frame.approved_to_complete;
import com.frame.assign_provider;
import com.frame.assign_to_approved;
import com.frame.billing;
import com.frame.create_new_case_intake;
import com.frame.getInfo;
import com.frame.log_out;
import com.frame.login;
import com.frame.new_to_assign;
import com.frame.search_case;

public class beauty extends DriverFactory {

	login login;
	GetDriver link;
	create_new_case_intake new_case_intake;
	new_to_assign to_assign;
	assign_to_approved to_approved;
	approved_to_complete to_complete;
	search_case search;
	log_out logout;
	assign_provider ass;
	ExcelHelpers excel;
	getInfo getinfo;
	approve_to_assign_follow_up to_AFU;
	billing billing;
	FPC_Approved fpc;
	
	@Override
	public void setUpforTest() {
		link = new GetDriver(driver);
		login = PageFactory.initElements(driver, login.class);
		new_case_intake = PageFactory.initElements(driver, create_new_case_intake.class);
		to_assign = PageFactory.initElements(driver, new_to_assign.class);
		to_approved = PageFactory.initElements(driver, assign_to_approved.class);
		to_complete = PageFactory.initElements(driver, approved_to_complete.class);
		search = PageFactory.initElements(driver, search_case.class);
		ass = PageFactory.initElements(driver, assign_provider.class);
		logout = PageFactory.initElements(driver, log_out.class);
		excel = new ExcelHelpers();
		getinfo = PageFactory.initElements(driver, getInfo.class);
		to_AFU = PageFactory.initElements(driver, approve_to_assign_follow_up.class);
		billing = PageFactory.initElements(driver, billing.class);
		fpc = PageFactory.initElements(driver, FPC_Approved.class);
	}
	
	@Test
	public void Beauty_create_case() throws Exception {
		Actions action = new Actions(driver);
		excel.setExcelFile("src/test/resources/beauty.xlsx", "Sheet1");
		String business = excel.getCellData("business", 1);
		String vertical = excel.getCellData("vertical", 1);
		String MG = excel.getCellData("MG", 1);
		String lab = excel.getCellData("lab", 1);
		String type = excel.getCellData("type", 1);
		String first_name = excel.getCellData("first_name", 1);
		String last_name = excel.getCellData("last_name", 1);
		String DOB = excel.getCellData("DOB", 1);
		String zipcode = excel.getCellData("zipcode", 1);
		login.URL_intake();
		
		login.intake("123456");
		Common.waitSec(6);
		new_case_intake.Beauty_create_new_case(business, vertical, MG, lab, type, first_name, last_name, DOB, zipcode);
		Common.waitSec(3);
		
		String id = to_assign.find_id();
		excel.setCellData(id, 1, 0);
		System.out.println("Case-ID: "+id);
	}
	
	@Test
	public void Beauty_new_to_assign() throws Exception {
		excel.setExcelFile("src/test/resources/beauty.xlsx", "Sheet1");
		login.URL_intake();
		login.pss("111111");
		Common.waitSec(5);
		
		String id = excel.getCellData("id", 1);
		search.search_from_intake(id);
		Common.waitSec(5);
		
		to_assign.Beauty_to_assign();	
		Common.waitSec(5);
	}
	
	@Test
	public void Beauty_assign_to_approve() throws Exception {
		
		excel.setExcelFile("src/test/resources/beauty.xlsx", "Sheet1");
		login.URL_intake();
		login.provider("123456");
		Common.waitSec(5);
		
		String id = excel.getCellData("id", 1);
		search.search_from_intake(id);
		Common.waitSec(5);
		
		billing.billing();
		Common.waitSec(3);
		
		to_approved.Beauty_to_approve();
		Common.waitSec(3);
		
		fpc.FPC();
		Common.waitSec(3);
	}
	
	@Test
	public void complete() throws Exception {
		excel.setExcelFile("src/test/resources/beauty.xlsx", "Sheet1");
		String id = excel.getCellData("id", 1);
		
		login.URL_intake();		
		
		login.pss("111111");
		Common.waitSec(15);
		
		search.search_from_intake(id);
		Common.waitSec(5);
		
		to_complete.complete_case();
	}
	
}
