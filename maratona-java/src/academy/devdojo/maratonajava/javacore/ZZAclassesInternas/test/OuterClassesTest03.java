package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Flávio";
    static class Nested{
        private String lastName = "Neves";
        void print(){

            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
