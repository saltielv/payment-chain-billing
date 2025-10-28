package com.paymentchain.business.billing.presentation.gateways;

import com.paymentchain.business.billing.application.port.out.InvoicePort;
import com.paymentchain.business.billing.domain.Invoice;
import com.paymentchain.business.billing.infrastructure.persistence.InvoiceEntity;
import com.paymentchain.business.billing.infrastructure.persistence.SpringJpaInvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class InvoicePersistenceAdapter implements InvoicePort {

  private final SpringJpaInvoiceRepository invoiceRepository;

  @Override
  public Invoice saveInvoice(Invoice invoice) {
    InvoiceEntity invoiceEntity =
        new InvoiceEntity(
            invoice.id(),
            invoice.customerId(),
            invoice.amount(),
            invoice.code(),
            invoice.description());
    final InvoiceEntity savedInvoice = invoiceRepository.save(invoiceEntity);
    return new Invoice(
        savedInvoice.getId(),
        savedInvoice.getCustomerId(),
        savedInvoice.getAmount(),
        savedInvoice.getCode(),
        savedInvoice.getDescription());
  }
}
