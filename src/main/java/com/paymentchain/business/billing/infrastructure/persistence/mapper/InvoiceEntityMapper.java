package com.paymentchain.business.billing.infrastructure.persistence.mapper;

import com.paymentchain.business.billing.domain.Invoice;
import com.paymentchain.business.billing.infrastructure.persistence.InvoiceEntity;
import java.util.List;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InvoiceEntityMapper {
  Invoice toDomain(InvoiceEntity entity);

  List<Invoice> toDomainList(List<InvoiceEntity> entities);

  @Mapping(target = "id", ignore = true)
  InvoiceEntity toEntity(Invoice domain);

  List<InvoiceEntity> toEntityList(List<Invoice> domains);
}
