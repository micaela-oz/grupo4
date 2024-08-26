public class Ave extends SerVivo{

    String name;

    Ave(String name){
        this.name = name;
    }

    @Override
    public void respirar(){
        System.out.println("El ave esta respirando");
    }

    public void volar(){
        System.out.println("El ave esta volando");
    }

    public static void main(String[] args){
    Ave Cotorra = new Ave("Pepita");

    Cotorra.volar();

    }
}
