package com.paymentchain.business.billing.application.service;

import com.paymentchain.business.billing.application.port.in.CreateInvoiceUseCase;
import com.paymentchain.business.billing.application.port.out.InvoicePort;
import com.paymentchain.business.billing.domain.Invoice;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InvoiceService implements CreateInvoiceUseCase {

  private final InvoicePort invoicePort;

  @Transactional
  @Override
  public Invoice createInvoice(Invoice invoice) {
    return invoicePort.saveInvoice(invoice);
  }
}
