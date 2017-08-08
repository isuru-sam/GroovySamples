package groovy.samples.duckTyping

//duck typing
def calculate ={a,b,c -> return (a+b)*c}
example1 = calculate (1, 2, 3)
example2 = calculate ([1, 2, 3], [4, 5, 6], 2)
example3 = calculate ('apples ', 'and oranges, ', 3)
println example1
println example2
println example3
class Duck {
	def quack() { println "I am a Duck" }
}
class Frog {
	def quack() { println "I am a Frog" }
}
quackers = [ new Duck(), new Frog() ]
for (q in quackers) {
	q.quack()
}
