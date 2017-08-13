package groovy.samples.metaprogramming

class DevExpando {
protected dynamicProperties = [:]


/*
void propertyMissing(String propertyName,value)
{
	println("Missing property "+propertyName)
}

def propertyMissing(String propertyName)
{

}
*/

void setProperty(String propertyName,value)
{
	dynamicProperties[propertyName] = value;
}

def getProperty(String propertyName) {
	dynamicProperties[propertyName]
}

def methodMissing(String methodName,args) {
	def prop=dynamicProperties[methodName]
	if (prop instanceof Closure) {
		prop(*args)
	}
}


}
