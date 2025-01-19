package mapperexample;

public class Manager {
    private int managerId;
    private String firstName;
    private String lastName;
    private String email;

    // Getters and Setters
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + "]";
	}
    
    
}
