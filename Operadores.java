public class Operadores {
    public static void main(String[] args) {
        //operadores aritméticos(+= -= *= /= == != > < >= <= ===) 
        //operadores lógicos (&& -> and/ || -> or/ xor)
        int num = 51;

        String msg = ((num > 10) && (num <100)) ? "Número maior que 10 e menor que 100" : "Número menor ou igual à 10 ou maior que 100";
        System.out.println(msg);
        //o seguinte também pode ser usado
        //if((num > 10) && (num<100)) {
            //msg = "Número maior que 10 e menor que 100"
        //} else {
           // msg = "Número menor ou igual à 10 ou maior que 100"
        //}
        String mesg = ((num % 2) == 0 ) ? "número par" : " número ímpar ";
        System.out.println(mesg);
        
    }
}