public class peoplearray {
    private String name;
    private String cellphonenumber;
    
    public peoplearray(String name, String cellphonenumber){
        this.name = name;
        this.cellphonenumber = cellphonenumber;
    }
    public String toString(){
        return "Name: " + this.name + " Cellphone: " + this.cellphonenumber;
    }
    }
