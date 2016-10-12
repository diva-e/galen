package com.diva_e.galenexamples.javatests;

import java.util.Arrays;
import java.util.List;

import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.galenframework.junit.*;

import static java.util.Arrays.asList;

public abstract class BaseClass extends GalenJUnitTestBase {

	private final String url = "http://example.com";
	private final String pathToSpecsFolder = "/specs";
	
	@Parameter
	public Device device;

	@Parameters(name = "{0}")
	public static Iterable<Object[]> devices() {
		return Arrays.asList(new Object[][] { 
			{ new Device("Mobile",  320, 600,  asList("mobile") ) },
			{ new Device("Tablet",  640, 480,  asList("tablet") ) },
			{ new Device("Desktop", 1024, 800, asList("desktop") ) }
		});
	}

	

	public String getUrl() {
		return url;
	}

	public String getPathToSpecsFolder() {
		return pathToSpecsFolder;
	}
	
	@Override
	public WebDriver createDriver() {
		return new FirefoxDriver();
	}
	
	
	public static class Device {
		private final String name;
        private final int width;
        private final int height;
        private final List<String> tags;

        public Device(String name, int width, int height, List<String> tags) {
            this.name = name;
            this.width = width;
            this.height = height;
            this.tags = tags;
        }

        public String getName() {
            return name;
        }
        
        public int getWidth() {
        	return width;
        }
        
    	public int getHeight() {
    		return height;
    	}
    	
    	public List<String> getTags() {
    		return tags;
    	}

        @Override
        public String toString() {
            return String.format("%s - %dx%d", name, width, height);
        }
	}
}
