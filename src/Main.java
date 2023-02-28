public class Main {
    public static void main(String[] args) {
        //TODO HOME WORK #14.2
//        Fruits деген класс түзүңүз, аны Orange, Apple, Banana деген класстар мурастасын. (IS-A)
//        Orange, Apple, Banana класстардын кайсы витаминге бай полялары (класстары) болсун. (HAS-A)
//        Мейн класстан объекттерин түзүп, toString() колдонуп, консольго чыгарыңыз


//        Banana banana = new Banana("A,B,C,D-vitamin");
//        Orange orange = new Orange("sweet,", "Верна,Салустиана,Гамлин,","orange,",20,banana);
//        System.out.println(orange);
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        Apple apple = new Apple("sweet,"," Голден,Гала,Спартан,","red,",15,banana);
//        System.out.println(apple);
        
        Banana banana = new Banana("A,B,C,D-vitamin");
        Orange orange = new Orange("sweet,", "Верна,Салустиана,Гамлин,","orange,",20,banana);
        System.out.println(orange);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Apple apple = new Apple("sweet,"," Голден,Гала,Спартан,","red,",15,banana);
        System.out.println(apple);
    }
}