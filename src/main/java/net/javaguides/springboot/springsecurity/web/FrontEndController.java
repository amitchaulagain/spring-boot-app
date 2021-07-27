package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.model.Address;
import net.javaguides.springboot.springsecurity.model.Animal;
import net.javaguides.springboot.springsecurity.model.Invoice;
import net.javaguides.springboot.springsecurity.model.User;
import net.javaguides.springboot.springsecurity.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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






        Invoice invoice=new Invoice();
        invoice.setInvoiceNumber(invNumber);
        invoice.setMemos(memos);

        invoice.setAddress(address);

        repo.save(invoice);










//        User user = new User("ram", "prasad", "a@gmail.com", "pass");
        return "test";
    }


}
