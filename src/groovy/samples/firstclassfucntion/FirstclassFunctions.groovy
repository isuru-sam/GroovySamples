package groovy.samples.firstclassfucntion

//closure as argument
def func1 =  {myfunc -> 2 * myfunc(5)}
def result1 = func1 {it->it*3}
def result2 = func1 {it->it*4}
println(result1)
println(result2)

//closure as return type
def repeater(times) {
	{value -> value * times}	
}
    
def timesTorepeat = repeater(3)
def result3 = timesTorepeat(4)
println result3


def multiply = { x, y -> return x * y }  // closure
def triple = multiply.curry(3) //(y->y*3)
def quadruple = multiply.curry(4) // quadruple = { y -> return 4 * y }
def p = triple.call(4)                   // explicit call
def q = quadruple(5)                     // implicit call
println "p: ${p}"                        // p is 12
println "q: ${q}"                        // q is 20











/*
def greeter = { greeting, name -> println "${greeting}, ${name}!" }
def sayHello = greeter.curry("Hello")
sayHello("Vamsi") // Hello, Vamsi!
def sayHi = greeter.curry("Hi")
sayHi("Vamsi")
*/
