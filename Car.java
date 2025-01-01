// HW3.2
abstract class Car {
    abstract void type();
    void speed(){
        System.out.println("with 60 km/h");
    }
}

class BMV extends Car{
    @Override
    void type() {
        System.out.println("simple car type ");
    }
}

class Mercedes extends Car{
    @Override
    void type(){
        System.out.println("sport car type ");
    }
}

class Main{
    public static void main(String[] args){
        Car bmv = new BMV();
        bmv.speed();
        bmv.type();

        Car mercedes = new Mercedes();
        mercedes.speed();
        mercedes.type();
    }
}
