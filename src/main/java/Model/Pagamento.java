package Model;

import java.util.Date;

public class Pagamento {
    private long id;
    private Date data;
    private float valor;

    @Override
    public String toString() {
        return "Pagamento{" +
                "id=" + id +
                ", date=" + data +
                ", valor=" + valor +
                '}';
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return data;
    }

    public void setDate(Date date) {
        this.data = date;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
