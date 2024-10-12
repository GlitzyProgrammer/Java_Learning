public class Object_intro {
    static class Car { // Change this line to static
        // Attributes
        String color;
        String model;
        int year;
    
        // Constructor
        Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }
    
        // Method to display car details
        void displayDetails() {
            System.out.println("Car Model: " + model);
            System.out.println("Car Color: " + color);
            System.out.println("Car Year: " + year);
        }
    
        // Method to change color
        void repaint(String newColor) {
            color = newColor;
            System.out.println("The car has been repainted to " + newColor);
        }
    }
    
    public static void main(String[] args) { // Move Main class method outside
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);
        
        // Calling the method to display details
        myCar.displayDetails();
        
        // Repaint the car
        myCar.repaint("Blue");
        myCar.displayDetails();
    }
}

