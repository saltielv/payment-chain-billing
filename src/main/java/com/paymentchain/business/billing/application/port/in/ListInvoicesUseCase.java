package com.paymentchain.business.billing.application.port.in;

import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;
import java.util.List;

public interface ListInvoicesUseCase {
  List<InvoiceResponseDTO> listInvoices();
}
