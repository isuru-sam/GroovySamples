package groovy.samples

String.metaClass.print={println 'hello'}
String.metaClass.x=4

def x =new String()
x.print()
x.print()

