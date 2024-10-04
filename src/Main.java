public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "New York", 10001);

        Teacher objectA = new Teacher("John Doe", 35, address, Subject.MATH);

        Principal objectB = new Principal("Jane Smith", 50, address, Subject.PHYSICS);
        Principal objectC = new Principal("Robert Brown", 55, address, Subject.CHEMISTRY);

        System.out.println("Object A (Teacher):");
        objectA.displayInfo();
        objectA.displayInfo("Teaching Math");
        objectA.showFinalMessage();

        System.out.println("\nObject B (Principal):");
        objectB.displayInfo();
        objectB.displayInfo("Oversees Physics Department");
        objectB.showFinalMessage();

        System.out.println("\nObject C (Principal):");
        objectC.displayInfo();
        objectC.displayInfo("Oversees Chemistry Department");
        objectC.showFinalMessage();
    }
}