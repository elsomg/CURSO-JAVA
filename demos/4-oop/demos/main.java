
public class Main {

    public static void main(String[] args) {
        Character character1;
        character1=new Character("Zelda",'F');
        Character character2;
        character2=new Character("Gorka",'M');
        character2.isZombi=true;
        System.out.println(character1.name);
        System.out.println("Is zombie " + character1.name);
        System.out.println(character2.isZombi);
        System.out.println("Is zombie " + character2.isZombi);

    }

    
}
