package org.step;

import org.base.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal{
@Before	
public void beforeScenerio() {
getDriver();
loadUrl("https://adactinhotelapp.com/");	
}
@After
public void afterScenerio() {
driver.close();
}
}
