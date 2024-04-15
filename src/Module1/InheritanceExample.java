package Module1;

public class InheritanceExample {
    public static class Appliance {
        protected String manufacturer;
        protected int releaseYear;

        public Appliance(String manufacturer, int releaseYear) {
            this.manufacturer = manufacturer;
            this.releaseYear = releaseYear;
        }

        public void printInfo() {
            System.out.println("Appliance Info:");
            System.out.println("-----------------------------------");
            System.out.println("\tManufacturer: " + manufacturer);
            System.out.println("\tRelease Year: " + releaseYear);
        }
    }

    // The "extends" clause allows the Refrigerator class to inherit from the Appliance class
    public static class Refrigerator extends Appliance {
        private String model;
        private int capacity;

        public Refrigerator(String manufacturer, int releaseYear, String model, int capacity) {
            // The "super" keyword allows us to access the constructor from the superclass
            super(manufacturer, releaseYear);
            this.model = model;
            this.capacity = capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public void printInfo() {
            // Call the method from the superclass first
            super.printInfo();
            System.out.println("\tAppliance Type: Refrigerator");
            System.out.println("\tModel: " + model);
            System.out.println("\tCapacity: " + capacity + " cu ft");
        }
    }

    public static void main(String[] args) {
        Refrigerator myRefrigerator = new Refrigerator("Samsung", 2018, "M203", 18);
        myRefrigerator.setCapacity(22);
        // Calls the method from the Refrigerator class
        myRefrigerator.printInfo();
    }
}
