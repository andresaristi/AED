package seguimiento8;

import static org.junit.Assert.*;

import org.junit.Test;

public class FixedPointTest {
		
		
		@Test
		public void test01() {
			int[] array = new int[]{-32,-4,0,2,3,5,32,98,100};
			assertEquals(Seguimiento8.findFixedPointInArray(array),5);
		}
		
		@Test
		public void test02() {
			int[] array = new int[]{-10, -5, 0, 1, 3, 4, -6, 7, 13, 14};
			assertEquals(Seguimiento8.findFixedPointInArray(array),7);
		}
		
		@Test
		public void test03() {
			int[] array = new int[]{-10, -5, 3, 4, 7, 9, 17};
			assertEquals(Seguimiento8.findFixedPointInArray(array),-1);
		}
		
		@Test
		public void test04() {
			int[] array = new int[]{-10, -1, 0, 3 , 10, 11, 30, 50, 100};
			assertEquals(Seguimiento8.findFixedPointInArray(array),3);
		}
		
		@Test
		public void test05() {
			int[] array = new int[]{4, 9, 16, 21, 67};
			assertEquals(Seguimiento8.findFixedPointInArray(array),-1);
		}

}
