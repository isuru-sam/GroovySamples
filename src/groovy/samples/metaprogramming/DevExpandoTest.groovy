package groovy.samples.metaprogramming

def x = new DevExpando()
x.y=87
x.add={a,b->a+b}
def z= x.add(3,4)
println x.y
x.y=9
println x.y
println z