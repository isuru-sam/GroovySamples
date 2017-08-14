package groovy.samples.switchstatements

public class Circle  {


	def isCase(o) {
		println 'calling'
		return o instanceof Circle
	}
}
