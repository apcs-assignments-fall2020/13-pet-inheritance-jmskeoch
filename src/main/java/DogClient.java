public class DogClient {
    public static void main(String[] args) {
        Dog riley = new Dog("Riley", 10, "Black Labrador");
        Dog max = new Dog();
        System.out.println(riley);
        System.out.println(max);
        riley.setName("Jersey");
        max.setAge(2);
        System.out.println(riley.getName());
        System.out.println(max.getAge());
        System.out.println(riley.getBreed());
    }
}