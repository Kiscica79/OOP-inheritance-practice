package data;

public abstract class Person {

    private String name;
    private String address;

    @Override
    public String toString() {
        return "Person[name= " + name + ", address= " + address+"]";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getterek, setterek
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
