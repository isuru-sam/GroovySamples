package groovy.samples.metaprogramming

		def d1 = new AOP()
		d1.getMetaClass().invokeMethod= {String method, arguments ->
			println 'running before'
			def meth=AOP.getMetaClass().getMetaMethod(method, arguments)
			meth.invoke(delegate,arguments)
		}
		
d1.runMethod(10)



