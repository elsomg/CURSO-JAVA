package demos.ejercicios.base;

public class pet {
    String name;
    int age;

        public pet() {};
        public pet(String name, int age){
            this.name=name;
            this.age=age;
        }
        public static void playpets(){
            dog pet1=new dog("Rufus",2);
            System.out.println(pet1 instanceof dog);
            System.out.println(pet1 instanceof pet);
            System.out.println(pet1 instanceof Object);


        }
        
          public static void main(String[] args) {
                playpets();
            }
        }
    

