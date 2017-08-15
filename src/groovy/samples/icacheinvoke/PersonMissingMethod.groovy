package groovy.samples.icacheinvoke

class PersonMissingMethod {

	def methodMissing(String name,args) {
		println "$name"
	}
	
	static void main(args) {
		def p=new PersonMissingMethod()
		p.ll()
	}
}

//def p=new PersonMissingMethod()