public class PrimeiroProjeto {

    public static void main(String[] args) {

        String primeiroNome = "Italo";
        String segundoNome = "Lira";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}