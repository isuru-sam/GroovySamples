
package groovy.samples.asttransformations
class Phone {
	String dial(number) {
		"dial$number"
	}

	String getManufacturer() {
		"nokia"
	}
}

class Camera {
	String takePicture() {
		"taking picture"
	}
	String getManufacturer() {
		"nikon"
	}
}
class SmartPhone {
	@Delegate Phone phone =new Phone()
	@Delegate Camera camera =new Camera()
	String getManufacturer() {
		"${phone.manufacturer},${camera.manufacturer}"
	}
}


SmartPhone sp=new SmartPhone()
println(sp.dial("1111"))
println(sp.takePicture())
println(sp.getManufacturer())