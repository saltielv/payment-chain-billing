package com.paymentchain.business.billing.application.service;

import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;
import com.paymentchain.business.billing.application.dto.mapper.InvoiceResponseMapper;
import com.paymentchain.business.billing.application.port.in.GetInvoiceUseCase;
import com.paymentchain.business.billing.application.port.in.ListInvoicesUseCase;
import com.paymentchain.business.billing.application.port.out.InvoicePort;
import com.paymentchain.business.billing.domain.Invoice;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ListInvoicesService implements ListInvoicesUseCase, GetInvoiceUseCase {

  private final InvoicePort invoicePort;
  private final InvoiceResponseMapper invoiceResponseMapper;

  @Override
  public List<InvoiceResponseDTO> listInvoices() {
    List<Invoice> invoices = invoicePort.findAll();
    return invoiceResponseMapper.invoiceListToInvoiceResponseDTOList(invoices);
  }

  @Override
  public InvoiceResponseDTO getInvoiceById(Long id) {
    Invoice invoice = invoicePort.findById(id);
    return invoiceResponseMapper.invoiceToInvoiceResponseDTO(invoice);
  }
}
