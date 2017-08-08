package groovy.samples.operatoroverloading

class DepartmentTest {

	static main(args) {
		
		def e1= new Employee(1,"John")
		def e2= new Employee(2,"Cam")
	
		def d1 = new Department(1,"dep1")
		d1+e1
		d1+e2
		d1.printEmployees();
		println "removing"
		d1-e2
		d1.printEmployees();
		}

}
