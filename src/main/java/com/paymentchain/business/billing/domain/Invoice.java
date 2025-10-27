package com.paymentchain.business.billing.domain;

public record Invoice(Long id, Long customerId, Double amount, String code, String description) {}
