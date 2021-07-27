package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.model.*;
import net.javaguides.springboot.springsecurity.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

        String invNumber="122121";
        String memos="for memory";

        Address address = new Address();
        address.setStreet("avvv");
        address.setCountry("nepal");
        address.setPostalCode("977");



        Set<InvoiceItem> items = new HashSet<InvoiceItem>();



        items.add(new InvoiceItem(1,"kg",2000.0));
        items.add(new InvoiceItem(2,"l",100.0));






        Invoice invoice=new Invoice();
        invoice.setInvoiceNumber(invNumber);
        invoice.setMemos(memos);

        invoice.setAddress(address);
        invoice.setItems(items);

        repo.save(invoice);

        return "test";
    }
    @GetMapping("/list")
    public String rootsss() {


       List<Invoice> invoices= repo.findAll();

        for (Invoice i: invoices ) {
            System.out.println(i.getMemos());
            System.out.println(i.getInvoiceNumber());

        }


        return "test";
    }


}
