package groovy.samples.closuredelegate
d= {
	
	append "test1"
	append "test2"
	
}

def buf=new StringBuffer()
d.delegate=buf
//OWNER_FIRST,OWNER_ONLY,DELEGATE_FIRST,DELEGATE_ONLY
d.resolveStrategy=Closure.OWNER_FIRST

d()
println buf