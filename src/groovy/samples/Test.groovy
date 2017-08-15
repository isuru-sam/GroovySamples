package groovy.samples

String.metaClass.print={->delegate.toUpperCase()}

println("ss".print())

/*
String.metaClass.x=4

def x =new String()
x.print()
x.print()
*/
