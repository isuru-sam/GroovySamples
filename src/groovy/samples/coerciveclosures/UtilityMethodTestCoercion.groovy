package groovy.samples.coerciveclosures

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class UtilityMethodTestCoercion  extends GroovyTestCase{
	UtilityMethods impl;
	@Before
	public void setUp() throws Exception {
		impl=[oddArray:{int[] nums ->
				nums.findAll({x->x%2==1}) as int[]
			},
			isOdd:{int x -> x%2==1}

		] as UtilityMethods;
	}

	@Test
	public void testOddArray() {
		log.info("Entering testOddArray")
		def expected= [3, 5, 7, 9]
		def results =impl.oddArray(2..9 as int[]);

		//groovyTestcase method
		assertLength(4, results)
		assertArrayEquals(expected as Integer[], results as Integer[])
		results.each{assertContains(it,expected as Integer[])}
	}


	@Test
	public void testIsOdd() {
		log.info("Entering testIsOdd")
	}

}
