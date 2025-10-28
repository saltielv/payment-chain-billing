package com.paymentchain.business.billing.application.dto;

public record InvoiceRequestDTO(Long customerId, Double amount, String code, String description) {}
