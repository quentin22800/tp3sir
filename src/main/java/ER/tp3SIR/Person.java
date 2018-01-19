package ER.tp3SIR;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity
public class Person {
	@Id
	private ObjectId id = new ObjectId();
	private String name;
	@Reference
	private List<Adress> adress0;
	
	public Person(){}
	
	public Person(ObjectId id, String name, List<Adress> adress0) {
		super();
		this.id = id;
		this.name = name;
		this.adress0 = adress0;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Adress> getAdress0() {
		return adress0;
	}
	public void setAdress0(List<Adress> adress0) {
		this.adress0 = adress0;
	}
}
