package model;
public class Costumer {

   private String name;

    private String email;

    private String phoneNumber;

    private int customerId;



    //Getters and Setters



    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getPhoneNumber() {

        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }



    public int getCustomerId() {

        return customerId;

    }

    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }



    // Constructor

    public Costumer(String name, String email, String phoneNumber, int customerId) {

        this.name = name;

        this.email = email;

        this.phoneNumber = phoneNumber;

        this.customerId = customerId;

    }



    public Costumer(String name, String email, int customerId) {

        this(name, email, "N/A", customerId);

    }



    public Costumer(){



    }







}
    
