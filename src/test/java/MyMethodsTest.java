import static org.junit.Assert.*;

import org.junit.Test;

public class MyMethodsTest {
	MyMethods mm=new MyMethods();

	@Test
	public void testAdd1() {
		assertEquals(mm.add1(1),2);
		
	}
	public void testAdd2() {
		assertEquals(mm.add2(2),4);
		
}
}
