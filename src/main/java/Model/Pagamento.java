package Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
  @Column(name = "data_pagamento")
    private Date data;
  @Column(name = "valor_pagamento")
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
