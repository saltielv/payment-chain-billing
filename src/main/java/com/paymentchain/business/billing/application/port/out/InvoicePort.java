package com.paymentchain.business.billing.application.port.out;

import com.paymentchain.business.billing.domain.Invoice;

public interface InvoicePort {
  Invoice saveInvoice(Invoice invoice);
}
