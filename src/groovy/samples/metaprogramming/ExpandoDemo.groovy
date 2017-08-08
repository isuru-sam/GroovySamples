package groovy.samples.metaprogramming

Expando ex= new Expando()
ex.name='John'
ex.speak={println "$name speak"}
ex.speak()

class Cat {
}
Cat.metaClass.name="kit"

Cat c= new Cat()
println (c.name)