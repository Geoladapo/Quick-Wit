public class Main {
    public static void main(String[] args) {
Person p1 = new Person();
Person p2 = new Person("Emmanuel", 34, 5.6, "Male");
        Person p3 = new Person("Olawale", 42, 6.3, "Female");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


//        modify or update data for p1 object
        p1.setSurName("LAWAL");
        p1.setAge(43);
        p1.setHeight(6.08);
        p1.setGender("Male");
        System.out.println(p1);
    }
}