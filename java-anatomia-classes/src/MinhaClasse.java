public class MinhaClasse {
    public static void main (String[] args) {
        System.out.println ("Fala mundiça");
        String primeiroNome = "Thiago";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println (nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);

    }
}
