package com.paymentchain.business.billing.application.port.in;

import com.paymentchain.business.billing.domain.Invoice;

public interface CreateInvoiceUseCase {
  Invoice createInvoice(Invoice invoice);
}
