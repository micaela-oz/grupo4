public class Humano extends SerVivo {
    private String name;
    private int age;

    public Humano(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void respirar() {
        System.out.println("Respiro oxígeno");
    }

    public String description() {
        return  "Me llamo " + name + " y tengo " + age + " años.";
    }

    public static void main(String[] args) {
        Humano julian = new Humano("Julian", 25);

        julian.respirar();
        System.out.println(julian.description());
    }
}