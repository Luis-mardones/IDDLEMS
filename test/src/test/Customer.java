package test;

public class Customer implements IMyData {
	private String Rut;
	private String Name;
	private IWebService ws;
	
	Customer(IWebService iWS){
		ws = iWS;
	}
	
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
	
	public double getAmount(){
		return 100 * ws.getTax();
		
	}
	
	public String ToString() {
		return this.getName() + " Sus Intereses son: " + getAmount();
	}
}
