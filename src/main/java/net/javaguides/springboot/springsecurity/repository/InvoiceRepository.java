package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.model.Invoice;
import net.javaguides.springboot.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
