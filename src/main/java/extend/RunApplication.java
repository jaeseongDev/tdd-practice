package extend;

class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.name = name;
        this.age = age;
    }

}

class Manager extends Employee {

    Manager(String name, int age) {
        super(name, age);
        System.out.println("완료");
    }
}

//public class RunApplication{
//    public static void main(String[] args) {
//        Manager manager = new Manager();
//        manager.variableTest();
////        manager.a1(); // 에러 발생
//        manager.b1();
//        manager.c1();
//        manager.d1();
//    }
//}
