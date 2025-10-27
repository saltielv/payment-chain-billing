package com.paymentchain.business.billing.application.port.out;

import com.paymentchain.business.billing.domain.Invoice;

public interface SaveInvoicePort {
  Invoice saveInvoice(Invoice invoice);
}
