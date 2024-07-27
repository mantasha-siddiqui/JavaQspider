package program1;

class Person 
{
	String name;
    int age;
    String address;
    String phone;
    String email;

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
        this.phone = "Unknown";
        this.email = "Unknown";
    }

    
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Unknown";
        this.phone = "Unknown";
        this.email = "Unknown";
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Unknown";
        this.phone = "Unknown";
        this.email = "Unknown";
    }

   
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = "Unknown";
        this.email = "Unknown";
    }

    
    public Person(String name, int age, String address, String phone, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void printDetails() {
    	System.out.println("Name: "+name);
    	System.out.println("Age: "+age);
    	System.out.println("Address:"+address);
    	System.out.println("Phone: "+phone);
    	System.out.println("Email: "+email);
    	
    }
    
        public static void main(String[] args) {
          
            Person person1 = new Person();
            Person person2 = new Person("Mantasha");
            Person person3 = new Person("Seema", 25);
            Person person4 = new Person("Shabnam", 30, "Gurugram");
            Person person5 = new Person("Lubna", 35, "Gurugram", "1234567890", "abc@example.com");
            
            person1.printDetails();
            person2.printDetails();
            person3.printDetails();
            person4.printDetails();
            person5.printDetails();
            
            
            
        }
}


