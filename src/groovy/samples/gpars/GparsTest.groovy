package groovy.samples.gpars

@Grab(group='org.codehaus.gpars', module='gpars', version='1.0.0')
import static groovyx.gpars.GParsPool.withPool
import groovyx.gpars.pa.GParsPoolUtilHelper
import groovyx.gpars.*
/**
 * 
 * https://github.com/GPars/GPars/blob/master/src/test/groovy/groovyx/gpars/ParallelEnhancerTest.groovy
 * http://gpars.org/webapp/guide/index.html
 * http://www.gpars.org/webapp/core/GParsPool.html
 * @author isa
 *
 */
class GparsTest {
	List<String> strings = new ArrayList<String>([
		"a",
		"butter",
		"bread",
		"dragon",
		"table"
	])
	
List nums=[1,2,3,6,8,9,10]







//	def closure = { it.length() }

	def doStuff() {
		 withPool( 5 ) {
			
			//ParallelEnhancer.enhanceInstance nums
			//strings.collectParallel { it.length()}
	//	nums.sumParallel()//{ it.length()}
		//GParsPoolUtilHelper.injectParallel(nums,0) { a, b -> a + b }
		//	nums.parallel.reduce(0,{a,b ->a+b})
			
			def sumPromise = (0..100000).inject(0, {a, b -> a + b}.asyncFun())
			println "Are we done yet? " + sumPromise.bound
		def tot=	sumPromise.whenBound {sum -> println sum}
			println ('done'+tot)
//return tot
						}
		//println results
	}
	static main(args) {
		def test = new GparsTest()
		test.doStuff()
		
		}

}
