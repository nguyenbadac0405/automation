package com.scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.frame.ExcelHelpers;
import com.frame.GetDriver;
import com.frame.approved_to_complete;
import com.frame.assign_provider;
import com.frame.create_new_case_intake;
import com.frame.getInfo;
import com.frame.log_out;
import com.frame.login;
import com.frame.new_to_assign;
import com.frame.search_case;

public class ExportInfo extends DriverFactory {
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
		
	}
	
	@Test
	public void exportInfo() throws Exception {
		String[] info = getinfo.get_Info_MDR();
		excel.setCellData(info[0], 1, 2);
		excel.setCellData(info[1], 1, 3);
		excel.setCellData(info[2], 1, 4);
		excel.setCellData(info[3], 1, 5);
		excel.setCellData(info[4], 1, 6);
		excel.setCellData(info[5], 1, 7);
		excel.setCellData(info[6], 1, 8);
	}
}
