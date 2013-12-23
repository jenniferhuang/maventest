package maventest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	@Test
	public void testSayHello(){
		App app=new App();
		String result=app.sayHello();
		assertEquals("Hello World!",result);
	}

}
