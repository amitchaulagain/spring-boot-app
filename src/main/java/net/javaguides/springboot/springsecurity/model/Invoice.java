package net.javaguides.springboot.springsecurity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Set;


@Entity
public class Invoice  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String invoiceNumber;



    private String memos;


    //Status of writeoff for invoice
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "billing_street")),
            @AttributeOverride(name = "town", column = @Column(name = "billing_town")),
            @AttributeOverride(name = "province", column = @Column(name = "billing_province")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "billing_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "billing_country")),
    })
    Address address;



    @OneToMany(fetch = FetchType.EAGER, mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<InvoiceItem> items;




    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getMemos() {
        return memos;
    }

    public Invoice setMemos(String memos) {
        this.memos = memos;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Invoice setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Set<InvoiceItem> getItems() {
        return items;
    }

    public Invoice setItems(Set<InvoiceItem> items) {
        this.items = items;
        return this;
    }
}
