package com.paymentchain.business.billing.adapter.in.web;

import com.paymentchain.business.billing.application.port.in.CreateInvoicePort;
import com.paymentchain.business.billing.domain.Invoice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

  private final CreateInvoicePort createInvoicePort;

  @PostMapping
  public Invoice createInvoice(@RequestBody Invoice request) {
    return createInvoicePort.createInvoice(request);
  }
}
