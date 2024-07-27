package program1;

class Chocolate {
	  String brand;
      String type;
      String name;
      int weight;
      double price;
    
    
    public Chocolate() {
        this.brand = "Unknown";
        this.type = "Unknown";
        this.name = "Unknown";
        this.weight = 0;
        this.price = 0.0;
       
    }

    
    public Chocolate(String brand) {
        this.brand = brand;
        this.type = "Unknown";
        this.name = "Unknown";
        this.weight = 0;
        this.price = 0.0;
       
    }

    
    public Chocolate(String brand, String type) {
        this.brand = brand;
        this.type = type;
        this.name = "Unknown";
        this.weight = 0;
        this.price = 0.0;
        
    }

    
    public Chocolate(String brand, String type, String name) {
        this.brand = brand;
        this.type = type;
        this.name = name;
        this.weight = 0;
        this.price = 0.0;
       
    }
    

    
    public Chocolate(String brand, String type, String name, int weight, double price) {
        this.brand = brand;
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
       
    }

    public void printDetails() {
    	System.out.println("Brand: "+brand);
    	System.out.println("Type: "+type);
    	System.out.println("Name: "+name);
    	System.out.println("Weight:"+weight);
    	System.out.println("Price: "+price);
    	
    	
    	
    }
    public static void main(String[] args) {
        
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Cadbury");
        Chocolate chocolate3 = new Chocolate("Nestle", "chocolate");
        Chocolate chocolate4 = new Chocolate("Cadbuary", "chocolate", "Dairy Milk");
        Chocolate chocolate5 = new Chocolate("Nestle", "Dark chocolate", "Bouneville", 100, 15.5);
        

       
        chocolate1.printDetails();
        chocolate2.printDetails();
        chocolate3.printDetails();
        chocolate4.printDetails();
        chocolate5.printDetails();
        
    }

	

}
