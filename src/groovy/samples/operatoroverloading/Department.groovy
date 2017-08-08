package groovy.samples.operatoroverloading

public class Department {
	Integer id;
	String name;

	Map<Integer,Employee> employees = new HashMap<>()

	public Map<Integer,Employee> getEmployees() {
		return employees;
	}

	public Department (Integer id,String name) {
		this.id=id;
		this.name=name;
	}
	public void hire(Employee e ){
		employees.put(e.getId(),e);
	}
	public void fire(Employee e) {
		employees.remove(e.getId())
	}

	public Department plus(Employee e) {
		hire(e);
		return this;
	}
	public Department minus(Employee e) {
		fire(e);
		return this;
	}


	public void printEmployees() {
		employees.each{key,value->println value.name}
	}
}

