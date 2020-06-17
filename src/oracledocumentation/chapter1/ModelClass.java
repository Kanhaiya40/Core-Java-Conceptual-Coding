package oracledocumentation.chapter1;

public class ModelClass {
    private String name;    /* instance variable  */
    private String city;    /* instance variable  */

    ModelClass() {    /* constructor to initialize to zero  */
        name = "Kanhaiya";
        city = "Bommanahali";
    }

    public String getName() {    /*  accessor method  */
        return name;
    }

    public void setName(String name) {    /* accessor method  */
        this.name = name;
    }

    public String getCity() {    /*  accessor method  */
        return city;
    }

    public void setCity(String city) {    /* accessor method  */
        this.city = city;
    }

}

class AccessingClass {
    public static void main(String[] args) {
        ModelClass modelClass;   //  declares a variable to refer to a ModelClass object
        modelClass = new ModelClass();  //  allocates an instance of  a ModelClass object
        modelClass.setName("Vipul");  //  sets the name variable via the accessor method
        modelClass.setCity("Kochi");  //  sets the city variable via the accessor method
        System.out.println(modelClass.getName()); //  gets the name variable via the accessor method
        System.out.println(modelClass.getCity());
    }
}

