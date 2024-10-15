package day9;

public class Emp {
	int id;
	String name;
	String email;

	public Emp(int eid, String ename, String email_ID) {
		id = eid;
		name = ename;
		email = email_ID;
	}

	public String toString() {
        return "Emp{id=" + id + ", name='" + name + "', email='" + email + "'}";

}
}