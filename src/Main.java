public class Main {
    public static void main(String[] args) {

        Animal animal= new Animal();
        animal.comiendo(); // metodos de la clase padre
        animal.comunicarse(); //metodos de la clase padre

        System.out.println(" ");

        Lobo lobo = new Lobo();
        lobo.comiendo();   //metodo de la clase hija de animal
        lobo.comunicarse(); // metodo de la clase hija de animal

        System.out.println("    ");

        Pajaro pajaro=new Pajaro();
        pajaro.comiendo(); //metodo de la clase hija de animal
        pajaro.comunicarse(); // metodo de la clase hija de animal
    }  // fin del main


}// fin de la clase
