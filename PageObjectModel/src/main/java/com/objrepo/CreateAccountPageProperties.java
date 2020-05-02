package com.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountPageProperties {

	
	By FIRSTNAME_LOCATOR=By.id("customer_firstname");
	By LASTNAME_LOCATOR=By.id("customer_lastname");
	By PASSWORD_LOCATOR=By.id("passwd");
	By ADDRESS_LOCATOR=By.id("address1");
	By CITY_LOCATOR=By.id("city");
	By STATE_LOACTOR=By.id("id_state");
	By POSTALCODE_LOCATOR=By.id("postcode");
	By PHONENUMBER_LOCATOR=By.id("phone_mobile");
	By ALIAS_LOCATOR=By.id("alias");
	By REGISTERBUTTON_LOCATOR=By.id("submitAccount");
	
}
