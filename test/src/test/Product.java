package test;

public class Product implements IMyData{
	private String Codigo;
	private String Name;
	
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
