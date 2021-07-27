package net.javaguides.springboot.springsecurity.model;


import javax.persistence.*;

/**
 * @author Amit Chaulagain on 12/08/2020
 * @version 1.0
 * A class to represent a [[InvoiceItem]]
 * It is a persistence domain object and logically maps to invoice_item table
 */
@Entity
@Table
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "invoice_id")
    @ManyToOne
    private Invoice invoice;


    @Column
    private Integer quantity;

    @Column
    private String uom;

    @Column
    private Double price;

    public Invoice getInvoice() {
        return invoice;
    }

    public InvoiceItem setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public InvoiceItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getUom() {
        return uom;
    }

    public InvoiceItem setUom(String uom) {
        this.uom = uom;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public InvoiceItem setPrice(Double price) {
        this.price = price;
        return this;
    }
}
