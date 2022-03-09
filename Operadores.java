public class Operadores {
    public static void main(String[] args) {
        //operadores aritméticos(+= -= *= /= == != > < >= <= ===) 
        //operadores lógicos (&& -> and/ || -> or/ xor)
        int num = 50;

        String msg = (num > 10 && num <100) ? "Número maior que 10 e menor que 100" : "Número menor ou igual à 10 ou maior que 100";
        System.out.println(msg);




    }
}