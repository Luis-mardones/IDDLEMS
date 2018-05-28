package test;

public class Customer implements IMyData {
	private String Rut;
	private String Name;
	
	public String getRut() {
		return Rut;
	}
	public void setRut(String rut) {
		Rut = rut;
	}
	public String getName() {
		return "Customer: " +Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
