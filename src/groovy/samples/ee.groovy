package groovy.samples
import groovy.samples.asttransformations.create.RandomNumber
import org.codehaus.groovy.ast.ClassHelper
import org.codehaus.groovy.ast.ClassNode

class Circle {
	
	def print(x) {
		println "printing${x}"
	}
}


def c  = new Circle()
c.print(5)

def met = c.getMetaClass().getMetaMethod("print", "s")
met.invoke(c, 7)