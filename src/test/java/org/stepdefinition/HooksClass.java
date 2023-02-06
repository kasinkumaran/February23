package org.stepdefinition;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass {

	@Before(order=1)
	public void beforeScenario() {
		System.out.println("B.order no:1");
		browserLauncher();
	}

	@Before(order = 3)
	public void beforecheck() {
		System.out.println("B order no: 3");
		maximize();
	}
	
	@Before(order=2)
	public void beforech() {
		System.out.println("B order no: 2");
		url("https://www.facebook.com/");
	}

	@After(order = 1)
	public void afterScenario() {
		System.out.println("A order 1");
		close();
	}

	@After(order = 2)
	public void aftercheck() {
		System.out.println("A order 2");
		System.out.println("Screenshot taken!");
	}

	@After(order = 3)
	public void afterCh(Scenario s) throws IOException {
		System.out.println("A order 3");
		
		if(s.isFailed()) {
			String name = s.getName();
			String filename = name.replace(" ", "_");
			screenShot(filename);
		}
	}
}
