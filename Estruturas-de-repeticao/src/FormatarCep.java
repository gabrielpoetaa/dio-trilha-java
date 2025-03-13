public class FormatarCep {

    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("23765064");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return cep;
    }
}
