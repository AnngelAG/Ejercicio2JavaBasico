public class TiposdeVariables{

    public static void main(String[] args) {
        //1. numericos
        //1.1 enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        //1.2 decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        variable6 = 20.5d;

        //2. Booleano
        boolean variable7 = false;
        boolean variable8 = true;

        //3. Texto
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amet, consectetur adipiscing";
        /*
        Comparacion:
        > mayor que
        < menor que
        >= mayor o igual que
        <= menor o igual que
        == igual que
         */
        int numero1 = 1;
        int numero2 = 2;
        boolean resultado1 = numero1> numero2 ; // false
        System.out.println(resultado1);
        boolean resultado2 = numero1< numero2 ; //true
        System.out.println(resultado2);
        /*
        logicos
        and &&
        or ||
         */
        boolean resultado3 = numero1> 5 && numero1 < 30; //>
        int edad = 17;
        boolean carnetJoven = edad> 15 && edad <= 26;
        System.out.println(carnetJoven);
    }
}
