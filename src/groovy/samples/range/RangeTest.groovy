package groovy.samples.range

def ints = 1..10
println ints

def exclusive = 2..<8
println exclusive

def myObjectRange1 = 'Ball1'..'Ball5'
def myObjectRange2 = 'Balla'..'Balle'
println "Values: ${myObjectRange1}"
println "Values: ${myObjectRange2}"