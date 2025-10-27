package com.paymentchain.business.billing.application.service;

import com.paymentchain.business.billing.application.port.in.CreateInvoicePort;
import com.paymentchain.business.billing.application.port.out.SaveInvoicePort;
import com.paymentchain.business.billing.domain.Invoice;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InvoiceService implements CreateInvoicePort {

  private final SaveInvoicePort saveInvoicePort;

  @Transactional
  @Override
  public Invoice createInvoice(Invoice invoice) {
    return saveInvoicePort.saveInvoice(invoice);
  }
}
