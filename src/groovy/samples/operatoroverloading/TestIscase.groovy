package groovy.samples.operatoroverloading

class Example {
  def isCase( o ) {
    true
  }
}

def c = new Example()
println( "woo" in c )