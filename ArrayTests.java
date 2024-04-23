import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 5,4,3,2,1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3,4,5 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {5,4,3,2,1};
    assertArrayEquals(new int[]{ 1,2,3,4,5}, ArrayExamples.reversed(input1));
  }
}
