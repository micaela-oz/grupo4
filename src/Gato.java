public class Gato extends SerVivo{
    private String nombre;
    private int age;

    public Gato(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }


    @Override
    public void respirar() {
        System.out.println("El Gato esta respirando..");
    }

    public static void main(String[] args){
        Gato Pepita = new Gato("Pepita", 10);
        Pepita.respirar();
    }

}
