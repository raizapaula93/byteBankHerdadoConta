public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200.0);
        try{
            conta.saca(100);

        } catch(SaldoInsuficienteException ex){
            System.out.println("Exceção: "+ ex.getMessage());
        }
        System.out.println(conta.getSaldo());

    }
}
