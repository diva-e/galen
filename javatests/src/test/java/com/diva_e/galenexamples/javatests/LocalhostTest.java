package com.diva_e.galenexamples.javatests;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.galenframework.junit.GalenJUnitTestBase;


public class LocalhostTest extends GalenJUnitTestBase {
	@Parameters(name = "{index}: Teste auf {0} ({1}x{2})")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"desktop", 1024, 768},
			{"mobile", 700, 1000}
		});
	}
	
	@Parameter(0)
	public String deviceName;
	
	@Parameter(1)
	public int browserWidth;
	
	@Parameter(2)
	public int browserHeight;
	
	
	@Override
	public WebDriver createDriver() {
		return new FirefoxDriver();
	}
	
	
	@Test
	public void testLocalhost() throws IOException {
		load("http://localhost/index.html", browserWidth, browserHeight);
		checkLayout("specs/localhost.gspec", Arrays.asList(deviceName));
		
	}
}
