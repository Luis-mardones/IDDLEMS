package test;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMyData di;
		
		
		Product producto = new Product();
		producto.setName("peras");
		producto.setCodigo("00345");
		
		Customer cliente = new Customer();
		cliente.setName("juan carlos godinez");
		cliente.setRut("23.244.634-2");
		
		Employee empleado = new Employee();
		empleado.setName("pedro perez pereira");
		cliente.setRut("23.244.634-2");
		
		Car auto = new Car();
		auto.setName("ferrari");
		auto.setCode("12");
		
		di = producto;
		System.out.println("Product: " + di.getName());
		di = cliente;
		System.out.println("Client: " + di.getName());
		
		
		
		
		
		
		
		di = empleado;
		System.out.println("Employee: " + di.getName());
		di = auto;
		System.out.println("Car: " + di.getName());
	}

}
