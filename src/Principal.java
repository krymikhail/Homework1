final class Principal extends Teacher {

    public Principal(String name, int age, Address address, Subject subject) {
        super(name, age, address, subject);
    }

    @Override
    public void displayInfo() {
        System.out.println("Overridden method in Principal class:");
        super.displayInfo();
    }
}
