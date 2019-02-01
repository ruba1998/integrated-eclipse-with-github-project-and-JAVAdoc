package ruba;




/**
 * this is a class to record informations of a human
 * @author Ruba
 *
 */
public class Human {
	
private String name;
private int age;
private String gender;

/**
 * This constructs a human with specific name,age and gender
 * @param name the name of the human
 * @param age the age of the human
 * @param gender the gender of the human
 */

public Human(String name,int age,String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
}

/**
 * 
 * @return return the name of the human
 */

public String getName() {
	return name;
}
/**
 * 
 * @return return the age of the human
 */
public int getAge() {
	return age;
}

/**
 * 
 * @return return the gender of the human
 */
public String getGender() {
	return gender ;
}
	
}


