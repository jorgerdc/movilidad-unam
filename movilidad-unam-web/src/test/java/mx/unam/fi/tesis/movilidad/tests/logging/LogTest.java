/**
 * LogTest.java
 * Creation Date: 24/06/2018, 12:38:00
 *
 * Copyright (C) The Project *movilidad-unam* Authors.
 *
 * This software was created for didactic and academic purposes.
 * It can be used and even modified by referring to the author
 * or project on GitHub. If the file is modified, add a note
 * after this paragraph saying that this file is a modified version.
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 */

package mx.unam.fi.tesis.movilidad.tests.logging;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Validates Log4J,Sl4J and log4j.properties are configured properly. log4.properties
 * should be configured in build.gradle and located at src/test/resources
 */

public class LogTest {

	private static Logger log = LoggerFactory.getLogger(LogTest.class);

	/**
	 * Logging test
	 */
	@Test
	public static void testLog() {
		log.debug("Testing Slf4j at {}", new Date());
		assertNotNull("log4j.properties not found in root classpath for testing",
			Thread.currentThread().getContextClassLoader().getResource("log4j.properties"));
	}

}