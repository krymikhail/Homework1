class Teacher extends Student {
    private Subject subject;

    public Teacher(String name, int age, Address address, Subject subject) {
        super(name, age, address);
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void displayInfo() {
        System.out.println("Teacher Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress() + ", Subject: " + getSubject());
    }

    public void displayInfo(String additionalInfo) {
        System.out.println("Teacher Name: " + getName() + ", Additional Info: " + additionalInfo);
    }

    public final void showFinalMessage() {
        System.out.println("This is a final method in Teacher class.");
    }
}