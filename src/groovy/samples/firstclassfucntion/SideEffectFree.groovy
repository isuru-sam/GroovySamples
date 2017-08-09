package groovy.samples.firstclassfucntion

//traditional way
def total = 0
(1..4).each { total += it }
println total

 
 
 //side effect free 
def sum = (1..4).inject(0) { result, i -> result + i }
println sum

def fact =(1..5).inject(1){result,i->result*i}
println fact