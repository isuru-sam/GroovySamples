package groovy.samples.asttransformations.create

import org.junit.Test

import org.junit.Assert.*

//@SuppressWarnings("deprecation")
class TestRandomAnnotation extends GroovyTestCase {

	
	@Test
	public void testRandomNumber() {
		
		RandomNumberTransformation rr= new RandomNumberTransformation()
		def foo = new Foo()
		def x =foo.getRandomNumber()
		
		println x
	}

	
	
}

