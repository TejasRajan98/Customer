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
}
