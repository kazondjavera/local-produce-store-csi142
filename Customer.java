
public class Customer {
    private String name;
    private String phoneNumber;
    private String address;

    public Customer(String name, String phoneNumber,String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    //Setter and getter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer name= " + name + ", Phone Number= " + phoneNumber + ", Address= " + address;
    }
}
