package groovy.samples.coerciveclosures

import static org.junit.Assert.*

import org.junit.Test

import groovy.util.GroovyTestCase

class UtilityMethodTest extends GroovyTestCase {

	UtilityMethods impl = new UtilityMethodsImpl();
	@Test
	public void testOddArray() {
		log.info("Entering testOddArray")
		def expected= [3,5,7,9]
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
