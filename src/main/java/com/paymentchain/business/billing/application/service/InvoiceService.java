package com.paymentchain.business.billing.application.service;

import com.paymentchain.business.billing.application.dto.InvoiceRequestDTO;
import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;
import com.paymentchain.business.billing.application.dto.mapper.InvoiceRequestMapper;
import com.paymentchain.business.billing.application.dto.mapper.InvoiceResponseMapper;
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
  private final InvoiceRequestMapper invoiceRequestMapper;
  private final InvoiceResponseMapper invoiceResponseMapper;

  @Transactional
  @Override
  public InvoiceResponseDTO createInvoice(InvoiceRequestDTO request) {
    Invoice invoiceSaved =
        invoicePort.saveInvoice(invoiceRequestMapper.invoiceRequestDTOToInvoice(request));
    return invoiceResponseMapper.invoiceToInvoiceResponseDTO(invoiceSaved);
  }
}
