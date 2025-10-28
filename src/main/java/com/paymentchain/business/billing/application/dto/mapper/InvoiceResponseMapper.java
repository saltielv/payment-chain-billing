package com.paymentchain.business.billing.application.dto.mapper;

import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;
import com.paymentchain.business.billing.domain.Invoice;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InvoiceResponseMapper {

  @Mapping(source = "id", target = "invoiceId")
  InvoiceResponseDTO invoiceToInvoiceResponseDTO(Invoice source);

  List<InvoiceResponseDTO> invoiceListToInvoiceResponseDTOList(List<Invoice> source);

  @InheritInverseConfiguration
  Invoice invoiceResponseDTOToInvoice(InvoiceResponseDTO source);

  @InheritInverseConfiguration
  List<Invoice> invoiceResponseDTOListToInvoiceList(List<InvoiceResponseDTO> source);
}
