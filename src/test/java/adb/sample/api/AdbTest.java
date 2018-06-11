package adb.sample.api;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AdbTest {
	  @Test
	  public void dummy() {
	  }
	  @Test
		public void testHello() {
			HelloController hController = new HelloController();
			assertEquals("Hello World", hController.helloWord());
		}
	  @Test
		public void testHelloWithParams() {
			HelloController hController = new HelloController();
			assertEquals("Hello  Adobe", hController.helloWord("Adobe"));
		}
}
