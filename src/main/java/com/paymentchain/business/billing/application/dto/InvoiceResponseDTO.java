package com.paymentchain.business.billing.application.dto;

public record InvoiceResponseDTO(
    Long invoiceId, Long customerId, Double amount, String code, String description) {}
