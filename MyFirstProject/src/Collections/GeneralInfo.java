package Collections;
//1. main class is HashSet1 for HashSet example.
//2. main class is HashMap1 for HashMap example.
public class GeneralInfo implements Comparable<T> {

	private String name;
	private String city;
	
	private String address;

		public GeneralInfo(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    @Override
	public int hashCode() {
	   return this.name.hashCode() + this.city.hashCode();
	}
//
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof GeneralInfo))
			return false;
	
		GeneralInfo a = (GeneralInfo)obj;
		return this.getName().equals(a.getName()) && this.getCity().equals(a.getCity());
	}
	 
//toString method is used to generate readable output.We need to explicitly use toString method
//to get the ouptut of GeneralInfo. String has built-in toString method.
	@Override
	public String toString() {
		return "GeneralInfo [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

	
	
}
