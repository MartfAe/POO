package heranca;

public class Pessoa {
    private String name;
    private int age; 
    private char sex; 


    public Pessoa(String name, int age, char sex){
        this.name = name; 
        this.age = age;
        this.sex = sex;
    }

    public Pessoa() {
    }


    public void fazerAniversario(){
        this.setAge(this.age + 1);

    }


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getSex(){
        return sex;
    }

    public void setSex(char sex){
        if(Character.toUpperCase(sex)=='M' || Character.toUpperCase(sex)=='F'){
        this.sex = sex;
        }
    }

    @Override
    public String toString() {
        return "Pessoa [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }

    


}
