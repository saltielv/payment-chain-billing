package com.paymentchain.business.billing.application.port.out;

import com.paymentchain.business.billing.domain.Invoice;
import java.util.List;

public interface InvoicePort {
  Invoice saveInvoice(Invoice invoice);

  List<Invoice> findAll();

  Invoice findById(Long id);
}
