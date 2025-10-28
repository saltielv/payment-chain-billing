package com.paymentchain.business.billing.application.port.in;

import com.paymentchain.business.billing.application.dto.InvoiceRequestDTO;
import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;

public interface CreateInvoiceUseCase {
  InvoiceResponseDTO createInvoice(InvoiceRequestDTO request);
}
