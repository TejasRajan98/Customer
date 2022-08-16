package data;

public class Customer {
    private String name;
    private String address;
    private String email;
    private long mobile;
    private boolean isPremium;
    Customer(){
        name = null;
        address = null;
        email = null;
        mobile = 0;
        isPremium = false;
    }
    Customer(String name, String address, String email, long mobile, boolean isPremium){
        this.name = name;
        this.address = address;
        this.email = email;
        this. mobile = mobile;
        this.isPremium = isPremium;
    }
    public void displayCustomer(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("mobile = " + mobile);
        System.out.println("isPremium = " + isPremium);
    }
}
