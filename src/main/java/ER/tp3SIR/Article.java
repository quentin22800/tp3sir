package ER.tp3SIR;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;
@Entity
public class Article {
	@Id
	private ObjectId id = new ObjectId();
	private String name;
	private int stars;
	@Reference
	private List<Person> buyers;
	
	public Article()
	{}
	
	public Article(ObjectId id, String name, int stars, List<Person> buyers) {
		super();
		this.id = id;
		this.name = name;
		this.stars = stars;
		this.buyers = buyers;
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
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public List<Person> getBuyers() {
		return buyers;
	}
	public void setBuyers(List<Person> buyers) {
		this.buyers = buyers;
	}
}
