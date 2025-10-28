package com.paymentchain.business.billing.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringJpaInvoiceRepository extends JpaRepository<InvoiceEntity, Long> {}
