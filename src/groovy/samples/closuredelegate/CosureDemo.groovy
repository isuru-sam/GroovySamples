package groovy.samples.closuredelegate
c= {
	println 'closure is running'
}



d= {
	
	append "test1"
	append "test2"
	
}

def buf=new StringBuffer()
d.delegate=buf


d()
println buf