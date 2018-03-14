package classes;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Adress {
	@Id
	private ObjectId id = new ObjectId();
	private String street;
	private String city;
	private String postcode;
	private String country;
	
	public Adress(){}
	
	public Adress(ObjectId id, String street, String city, String postcode, String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
		this.country = country;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
