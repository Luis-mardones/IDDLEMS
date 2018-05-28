package test;

public class Car implements IMyData{
	private String Code;
	private String Name;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return "Car: " + Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
