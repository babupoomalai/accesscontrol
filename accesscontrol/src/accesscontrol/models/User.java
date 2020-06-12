package accesscontrol.models;

public class User {

	private String id;
	private UserType type;
	private String name;

	public User(String id, UserType type, String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public UserType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

}
