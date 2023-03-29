public class Main {
    public static void main(String[] args) {
        Funcionario abc = new Funcionario("xyz", "abc", 600000.00, "29/Marco/2023",
                "abc20003565");

        System.out.println(abc.getNome());
        //exer3
        abc.mostra();

        //exer4
       /* Funcionario f1 = new Funcionario("Danilo", "abc", 100, "29/Marco/2023",
                "abc20003565");

        */
        Funcionario f2 = new Funcionario("Danilo", "abc", 100, "29/Marco/2023",
                "abc20003565");

//        if (f1 == f2) {
//            System.out.println("iguais");
//        } else {
//            System.out.println("diferentes");
//        }// sao diferentes porque nao tem a mesma referecia

        //exer5
        Funcionario f1 = new Funcionario("Danilo", "abc", 100, "29/Marco/2023",
                "abc20003565");
        f2 = f1;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }//sao iguais ou seja a referencia de onde os dados estao guardados sao iguais
    }

}