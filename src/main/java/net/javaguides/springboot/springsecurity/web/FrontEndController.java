package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.model.Address;
import net.javaguides.springboot.springsecurity.model.Invoice;
import net.javaguides.springboot.springsecurity.model.InvoiceItem;
import net.javaguides.springboot.springsecurity.model.User;
import net.javaguides.springboot.springsecurity.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/hero")


public class FrontEndController {


    @Autowired
    InvoiceRepository repo;


    @GetMapping
    public String root() {
//Model prepare
        User user = new User("ram", "prasad", "a@gmail.com", "pass");
        return "hello.html";
    }

    @GetMapping("/test")
    public String rootsssssss() {

        String invNumber = "122121";
        String memos = "for memory";

        Address address = new Address();
        address.setStreet("avvv");
        address.setCountry("nepal");
        address.setPostalCode("977");


        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber(invNumber);
        invoice.setMemos(memos);

        invoice.setAddress(address);
        invoice = repo.save(invoice);
        Set<InvoiceItem> items = new HashSet<InvoiceItem>();


        items.add(new InvoiceItem(5, "kg", 2000.0, invoice));
        items.add(new InvoiceItem(6, "l", 100.0, invoice));

        invoice.getItems().addAll(items);

        repo.save(invoice);


        return "test";
    }

    @GetMapping("/list")
    public String rootsss() {


        List<Invoice> invoices = repo.findAll();

        for (Invoice i : invoices) {
            System.out.println(i.getMemos());
            System.out.println(i.getInvoiceNumber());

        }


        return "test";
    }


    @GetMapping("/update/{id}")
    public String rootsssss(@PathVariable long id) {

        String invNumber = "1111111";

        Invoice invoice = repo.getOne(id);
        invoice.setInvoiceNumber(invNumber);
        Set<InvoiceItem> items = new HashSet<InvoiceItem>();


        items.add(new InvoiceItem(2, "kg", 5000.0, invoice));
        items.add(new InvoiceItem(3, "l", 10000.0, invoice));

        invoice.getItems().clear();
        invoice.getItems().addAll(items);

        repo.save(invoice);


        return "test";
    }

    @GetMapping("/delete/{id}")
    public String rootsss(@PathVariable long id) {


        repo.deleteById(id);



        return "test";
    }


}
