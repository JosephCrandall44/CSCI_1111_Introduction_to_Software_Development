public class User {
	
	protected int id;
	protected String password;
	protected String name;
	protected String type;
	
	public User(int id, String password, String name, String type){
		id = id;
		password = password;	
		name = name;
		//type can be s for student or p for professor
		type = type;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
