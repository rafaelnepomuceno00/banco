package banco;

public class TestaConta {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.saldo = 666;
        c1.numero = "1818";
        c1.agencia = "8181";
        c1.titular = "Rafael Nepomuceno";

        System.out.println ("saldo de c1: " + c1.saldo );
        
        Conta c2 = new Conta();
        c2.saldo =  1000000;
        c2.numero = "5556";
        c2.agencia = "8181";
        c2.titular = "wandeko meu chefe";
             
    }
}
