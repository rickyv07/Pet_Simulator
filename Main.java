import Characters.Cat;
import Characters.Pet;

public class Main{
    public static void main(String[] args){

        System.out.println("Welcome to Pet Simulator!");
        Pet myPet = new Cat("NyanCat", "Nyan");
        Interface gui = new Interface(myPet);
        
    
    }
}