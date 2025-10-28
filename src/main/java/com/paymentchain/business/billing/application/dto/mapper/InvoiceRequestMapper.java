package com.paymentchain.business.billing.application.dto.mapper;

import com.paymentchain.business.billing.application.dto.InvoiceRequestDTO;
import com.paymentchain.business.billing.domain.Invoice;
import java.util.List;

public interface InvoiceRequestMapper {

  InvoiceRequestDTO invoiceToInvoiceRequestDTO(Invoice source);

  List<InvoiceRequestDTO> invoiceListToInvoiceRequestDTOList(List<Invoice> source);

  Invoice invoiceRequestDTOToInvoice(InvoiceRequestDTO source);

  List<Invoice> invoiceRequestDTOListToInvoiceList(List<InvoiceRequestDTO> source);
}
