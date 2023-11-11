package entity;

public class UserFactory {
	private UserFactory() {

	}

	public static final User getUser(Type type) {
		switch (type) {
		case Tenant:
			return new Tenant();
		case PropertyOwner:
			return new PropertyOwner();
		default:
			throw new IllegalArgumentException("This user type is unsupported");
		}
	}

}
