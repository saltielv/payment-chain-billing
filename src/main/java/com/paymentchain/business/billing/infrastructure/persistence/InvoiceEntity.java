package com.paymentchain.business.billing.infrastructure.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class InvoiceEntity {

  @Id @GeneratedValue private Long id;
  private Long customerId;
  private Double amount;
  private String code;
  private String description;
}
