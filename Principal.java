public class Principal {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1713);
        conta.setTitular("Luan Martins Toniolo");
        conta.setSaldo(400);

        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.depositaValor(500);

        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacaValor(700);

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
