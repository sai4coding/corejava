public class Test{
    public static void main(String[] args) {
        Car c1=new Car() {
            @Override
            public void display(int speed) {
                if(speed >20){
                    System.out.println("ok");
                }
                System.out.println("bmw");
            }
        };

        c1.display(23);

        Car c2=(speed) ->{
                System.out.println("another");

        };
        c2.display(12);

        Audi a=new Audi();
        a.display(12);
    }
}



class Audi implements Car{
    public void display(int speed){
        System.out.println("audi");
    }
}




interface Car{
    public void display(int speed);
}