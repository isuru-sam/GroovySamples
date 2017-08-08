package groovy.samples.operatoroverloading
println 33333333444333333333333.class.name
println ((2.1).class.name)
println 2.1d-0.9d
println 2.1 - 0.9 

def s = "this is a string"
 
 s[0]//s.getAt(0)

 
 class Bucket {
    int size
    Bucket(int size) { this.size = size }
    Bucket plus(Bucket other) {                     
        return new Bucket(this.size + other.size)
    }
}
def b1 = new Bucket(4)
def b2 = new Bucket(11)
println ((b1 + b2).size)