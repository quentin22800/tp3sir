package executionMongo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

import classes.Adress;
import classes.Article;
import classes.Person;

public class Apptest {
	public static void main( String[] args ) throws UnknownHostException
	{
		Morphia morphia = new Morphia();	
		MongoClient mongo = new MongoClient();
		morphia.map(Person.class).map(Adress.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");
		
		Person p = new Person();
		p.setName("Tintin");
		Person p1 = new Person();
		p.setName("Milou");
		Article croquette = new Article();
		croquette.setName("croquette");
		croquette.setStars(5);
		
		List<Person> croquetteBuyers = new ArrayList<Person>();
		croquetteBuyers.add(p1);
		croquette.setBuyers(croquetteBuyers);
		
		Adress address = new Adress();
		address.setStreet("123 Some street");
		address.setCity("Some city");
		address.setPostcode("123 456");
		address.setCountry("Some country");
		//set address
		List<Adress> lesadresses = new ArrayList<Adress>();
		lesadresses.add(address);
		p.setAdress0(lesadresses);
		p1.setAdress0(lesadresses);
		// Save the POJO
		ds.save(address);
		ds.save(p);
		ds.save(p1);
		ds.save(croquette);
		for (Person e : ds.find(Person.class))
			 System.err.println(e);
	}

}
