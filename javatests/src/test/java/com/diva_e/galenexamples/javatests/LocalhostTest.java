package com.diva_e.galenexamples.javatests;

import java.io.IOException;

import org.junit.Test;


public class LocalhostTest extends BaseClass {
	@Test
	public void localhostTest() throws IOException {
		load(getUrl(), device.getWidth(), device.getHeight());	
        checkLayout(getPathToSpecsFolder() + "localhost.gspec", device.getTags());
	}
}
