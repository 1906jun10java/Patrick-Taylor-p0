package com.project0.test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



	class JUnitProject0Test {



		@Test

		void test() {

			JUnitProject0 test = new JUnitProject0();

			//we're expecting to return an int value, or the case, and the parameter inside is a double amount.

			int output = test.StartingOffer(1500.00);

			assertEquals(1, output); 

			/*

			 * in the sample problem, the switch case is returning an int value 

			 * either 1 or 2. 

			 * in the testing, the assertEquals([1, or case 1, is expected to read out])

			 * because in the actual method being tested, the case being called is 1.

			 * if assertEquals(2) were to be called, it will give an error.

			 */

		}



	}
