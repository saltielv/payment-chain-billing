package com.paymentchain.business.billing.application.port.in;

import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;

public interface GetInvoiceUseCase {
  InvoiceResponseDTO getInvoiceById(Long id);
}
