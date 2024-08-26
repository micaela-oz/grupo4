public class Pinguino  extends SerVivo {
    private int age;
    private String gender;
    private String name;

    public Pinguino(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void respirar() {
        System.out.println("Respirando con agua ...");
    }

    public String pinguinoDescripcion(){
        return "edad: + " + age + ", Genero: " + gender + ", Nombre: " + name;
    }

    public static void main(String[] args) {
        Pinguino baloo = new Pinguino(3, "macho", "Baloo");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
