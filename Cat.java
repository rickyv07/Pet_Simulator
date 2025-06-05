public class Cat extends Pet{

    private String breed;

    public Cat(String n, String b){
        super(n);
        breed = b;
    }
    public String getName(){
        return "Cat";
    }

}
