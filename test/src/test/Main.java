package test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<IMyData> lstObjects = new ArrayList<IMyData>();
		
		
		Product producto = new Product();
		producto.setName("peras");
		producto.setCodigo("00345");
		lstObjects.add(producto);
	/*	
		Customer cliente = new Customer(null);
		cliente.setName("juan carlos godinez");
		cliente.setRut("23.244.634-2");
		lstObjects.add(cliente);
	*/	
		Employee empleado = new Employee();
		empleado.setName("pedro perez pereira");
		empleado.setRut("23.244.634-2");
		lstObjects.add(empleado);
		
		Car auto = new Car();
		auto.setName("ferrari");
		auto.setCode("12");
		lstObjects.add(auto);
		
		for(IMyData cur : lstObjects) {
			System.out.println(cur.getName());
		}
		
		WebServiceMock wsm = new WebServiceMock();
		WebService ws = new WebService();
		
		Customer cc = new Customer(wsm);
		System.out.println(cc.getAmount());
	}

}
