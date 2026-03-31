public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String name, String phone){
        this(name, phone, null);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void displayInfo(){
        System.out.println("Nome: "+getName()+"\nTelefone: "+getPhone()+"\nEmail: "+getEmail());
    }

   public void updateContact(String phone, String email){
    setEmail(email);
    setPhone(phone);
   }

   public static void main(String[] args) {
    Contact c1 = new Contact("Ana", "75992911999");
    c1.displayInfo();

    c1.updateContact("(75)99291-1999", "anaemilia@mutim.com.br");
    c1.displayInfo();
   }
}
