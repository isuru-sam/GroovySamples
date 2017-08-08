package groovy.samples.icacheinvoke
import java.util.logging.*

i=1

Logger.metaClass.methodMissing = {String name,args->
		
	println("inside method missing$name")	
	println(name.toUpperCase())
		
	def level = new CustomLevel(name.toUpperCase(),(Level.SEVERE.intValue() + (i++))) 
	
	def impl = {
		msg -> delegate.log(level,msg)
		
		}
		Logger.metaClass."$name" = impl
		
	impl(args[0])

}

Logger logs=Logger.getLogger(this.class.name)
logs.hey("whats up")
logs.gm("good morning")
logs.hey("hey2")
