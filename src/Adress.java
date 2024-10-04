class Address {
    private String street;
    private String city;
    private int postalCode;

    public Address(String street, String city, int postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "', city='" + city + "', postalCode=" + postalCode + "}";
    }
}