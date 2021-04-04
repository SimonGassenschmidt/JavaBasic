import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;


class BasicTest {
	Duration timeout = Duration.ofSeconds(20);
	
	
	@Test
	//@Order(1)
	public void testgetAddition() {
		int a = 5;
		int b = 35;
		 assertTimeoutPreemptively(timeout, () -> assertEquals(40, Basic.getAddition(a,b),
			        "Summe von 5 + 35 ist 40, nichts anderes"));
	}
	@Test
	public void testgetSubstraction() {
		int a = 10;
		int b = 8;
		assertTimeoutPreemptively(timeout, () -> assertEquals(2, Basic.getSubstraction(a,b),
		        "10 minus 8 ist 2, nichts anderes"));
	}
	@Test
	public void testgetSubstractionElementbyElementArray() {
		int[] values = {6, 10, 4};
		assertTimeoutPreemptively(timeout, () -> assertEquals(-8, Basic.getSubstractionElementbyElementArray(values),
		        ""));
		
	}
}
