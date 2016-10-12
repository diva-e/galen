package com.diva_e.galenexamples.javatests;

import java.io.IOException;

import org.junit.Test;


public class Tests extends BaseClass {
	@Test
	public void v1Test() throws IOException {
		load(getUrl(), device.getWidth(), device.getHeight());	
        checkLayout(getPathToSpecsFolder() + "/GalenV1.gspec", device.getTags());
	}
	

	@Test
	public void v2Test() throws IOException {
		load(getUrl(), device.getWidth(), device.getHeight());	
        checkLayout(getPathToSpecsFolder() + "/GalenV2.gspec", device.getTags());
	}
	

	@Test
	public void v3Test() throws IOException {
		load(getUrl(), device.getWidth(), device.getHeight());	
        checkLayout(getPathToSpecsFolder() + "/GalenV3.gspec", device.getTags());
	}
}
