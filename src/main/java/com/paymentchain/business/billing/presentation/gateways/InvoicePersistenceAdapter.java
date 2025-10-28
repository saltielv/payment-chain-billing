package com.paymentchain.business.billing.presentation.gateways;

import com.paymentchain.business.billing.application.port.out.InvoicePort;
import com.paymentchain.business.billing.domain.Invoice;
import com.paymentchain.business.billing.infrastructure.persistence.InvoiceEntity;
import com.paymentchain.business.billing.infrastructure.persistence.SpringJpaInvoiceRepository;
import com.paymentchain.business.billing.infrastructure.persistence.mapper.InvoiceEntityMapper;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class InvoicePersistenceAdapter implements InvoicePort {

  private final SpringJpaInvoiceRepository invoiceRepository;
  private final InvoiceEntityMapper invoiceEntityMapper;

  @Override
  public Invoice saveInvoice(Invoice invoice) {

    InvoiceEntity invoiceEntity = invoiceEntityMapper.toEntity(invoice);
    final InvoiceEntity savedInvoice = invoiceRepository.save(invoiceEntity);
    return invoiceEntityMapper.toDomain(savedInvoice);
  }

  @Override
  public List<Invoice> findAll() {
    return invoiceEntityMapper.toDomainList(invoiceRepository.findAll());
  }

  @Override
  public Invoice findById(Long id) {
    return invoiceRepository
        .findById(id)
        .map(invoiceEntityMapper::toDomain)
        .orElseThrow(NoSuchElementException::new);
  }
}
