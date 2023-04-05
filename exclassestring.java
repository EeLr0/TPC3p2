public class exclassestring {
    public static void main(String[] args) {
        String nome = "EeLr0";
        String nome2 = "E\te\tL\tr0";
        System.out.println("length string: " + nome.length());//tamanho string
        //////////////////////////////////////////////////////////

        System.out.println(nome.charAt(0));//carater no index 0
        System.out.println(nome.charAt(3));//carater no index 3
        System.out.println(nome.charAt(1));//carater no index 1
        ////////////////////////////////////////////////////////

        System.out.println(nome.indexOf('e'));
        System.out.println(nome.indexOf("E"));//retorna o index da letra
        ////////////////////////////////////////////////////////

        System.out.println(nome.substring(2));
        System.out.println(nome.substring(1,3));// retorna uma substring
        /////////////////////////////////////////////////////

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase()); // converte para lower e uppercase
        ////////////////////////////////////////////



    }
}