package groovy.samples.metaprogramming
import static org.apache.commons.math3.complex.Complex.*
import static java.lang.Math.*
import org.apache.commons.math3.complex.*
class ComplexSpec {

def setupSpec() {
Complex.metaClass.plus = {Complex c -> delegate.add c}
Complex.metaClass.minus = {Complex c -> delegate.substract c}
Complex.metaClass.div = {Complex c -> delegate.divide c}
Complex.metaClass.negative = {delegate.negate()}
} 

def plusalistoadd() {
Complex a = new Complex(1,3)
Complex b = new Complex(2,4)
println a.plus(b)
println a.negative()
println a+b
println (-a)
}

}
ComplexSpec d= new ComplexSpec()
d.setupSpec()
d.plusalistoadd()