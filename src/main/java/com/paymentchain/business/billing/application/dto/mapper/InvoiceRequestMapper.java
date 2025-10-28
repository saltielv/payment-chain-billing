package com.paymentchain.business.billing.application.dto.mapper;

import com.paymentchain.business.billing.application.dto.InvoiceRequestDTO;
import com.paymentchain.business.billing.domain.Invoice;
import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InvoiceRequestMapper {

  InvoiceRequestDTO invoiceToInvoiceRequestDTO(Invoice source);

  List<InvoiceRequestDTO> invoiceListToInvoiceRequestDTOList(List<Invoice> source);

  @Mapping(target = "id", ignore = true)
  Invoice invoiceRequestDTOToInvoice(InvoiceRequestDTO source);

  List<Invoice> invoiceRequestDTOListToInvoiceList(List<InvoiceRequestDTO> source);
}
