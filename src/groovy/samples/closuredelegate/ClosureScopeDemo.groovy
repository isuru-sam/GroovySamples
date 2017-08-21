package groovy.samples.closuredelegate

class ClosureScopeDemo {

	void append(String s) {
		println "append${s}"
	}
	
	void run() {
		def d= {
			
			append "test1"
			append "test2"
			
		}
		def sb=new StringBuffer()
		//d.owner=this
		d.delegate=sb
		//OWNER_FIRST,DELEGATE_FIRST,OWNER_ONLY,DELEGATE_ONLY
		d.resolveStrategy=Closure.OWNER_FIRST
		def e =d()
		println e
	}
	
	static main(args) {
		
		def dd= new ClosureScopeDemo()
		dd.run()
	}

}
