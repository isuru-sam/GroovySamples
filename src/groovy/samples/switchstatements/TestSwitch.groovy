package groovy.samples.switchstatements

def testSwitch(val) {
    def result
    switch (val) {
        case ~/^Switch.*Groovy$/:
            result = 'Pattern match'
            break
        case BigInteger:
            result = 'Class isInstance'
            break
        case 60..90:
            result = 'Range contains'
            break
        case [21, 'test', 9.12]:
            result = 'List contains'
            break
        case 42.056:
            result = 'Object equals'
            break
        case { it instanceof Integer && it < 50 }:
            result = 'Closure boolean'
            break
        default:
            result = 'Default'
            break
    }   
    result
}


def res= testSwitch("Switch to Groovy")
println res
res= testSwitch(42G)
println res
res = testSwitch(70)
println res
res=testSwitch('test')
println res
res= testSwitch(42.056)
println res
res=testSwitch(20)
println res
res= testSwitch('default')
println res