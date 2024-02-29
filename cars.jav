package myPackage;

public class Cars {
    int id;
    String name;

    public Cars(int id, String name){
        this.id = id;
        this. name = name;
    }

    public static void main(String[] args) {
        Cars car1 = new Cars(1, "BMW");
        Cars car2 = new Cars( 2, "Honda");
    }
}
