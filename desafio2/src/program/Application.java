package program;

public class Application {
    public static void main(String[] args){


        for (int counter = 2; counter <= 10000; counter++){
            int primeroValor = validarDivisao(counter);
            int segundoValor = validarDivisao(counter + 1);
            int subsequente = counter + 1;

            if (primeroValor == segundoValor){
                System.out.println(counter  + " tem a mesma quantidade de divisores do seu proximo numero "+ subsequente);

            }
        }
    }

    private static Integer validarDivisao(int counter) {
        int quantidadeDivisor = 0;

        for (int divCounter = 1; divCounter <= counter; divCounter++){
            if (counter % divCounter == 0) {
                quantidadeDivisor ++;
            }

        }
        return quantidadeDivisor;
    }

}
