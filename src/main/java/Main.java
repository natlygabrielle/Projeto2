import Model.Pagamento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pagamento pg = new Pagamento();
        pg.setId(11);
        pg.setValor(500);
        pg.setDate(new Date());
        System.out.println(pg);
    }
}
