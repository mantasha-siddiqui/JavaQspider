class Student {
private String name;
private int id;
private char gender;
private String course;
private String address;
private String password;

public Student (String name , int id , char gender , String course , String address , String password) {
 this.name = name;
 this.id = id;
 this.gender = gender;
 this.course = course;
 this.address = address;
 this.password = password;
}

public String getName(){
	return name;
}      


public void setName(String name){
	this.name = name;

}

public void getId(){
System.out.println(id);
}


public void getGender(){
System.out.println(gender);
}


public void getCourse(){
System.out.println(course);
}

public void setCourse(String course){
	this.course = course;
}

public void getAddress(){
System.out.println(address);
}

public void setAddress(String address){
	this.address = address;
}


public void setPassword(String password){
	
	this.password = password;

}

}



















