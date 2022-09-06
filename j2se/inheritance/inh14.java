class Animal {
     public void sound(){
        /*---- */
     }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Bhow Bhow....");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow Meow....");
    }
}
class TestMain{
    public static void main(String args[]){
        //Cat obj = new Cat();
        //Dog obj2 = new Dog();
       Animal obj;
       obj = new Cat(); // meow
       obj.sound();
       
       obj = new Dog(); 
       obj.sound(); 
    }
}