package com.paymentchain.business.billing.presentation.controllers;

import com.paymentchain.business.billing.application.dto.InvoiceRequestDTO;
import com.paymentchain.business.billing.application.dto.InvoiceResponseDTO;
import com.paymentchain.business.billing.application.port.in.CreateInvoiceUseCase;
import com.paymentchain.business.billing.application.port.in.GetInvoiceUseCase;
import com.paymentchain.business.billing.application.port.in.ListInvoicesUseCase;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

  private final CreateInvoiceUseCase createInvoiceUseCase;
  private final GetInvoiceUseCase getInvoiceUseCase;
  private final ListInvoicesUseCase listInvoicesUseCase;

  @PostMapping
  public InvoiceResponseDTO createInvoice(@RequestBody InvoiceRequestDTO request) {
    return createInvoiceUseCase.createInvoice(request);
  }

  @GetMapping("/{id}")
  public InvoiceResponseDTO getInvoice(@PathVariable Long id) {
    return getInvoiceUseCase.getInvoiceById(id);
  }

  @GetMapping
  public List<InvoiceResponseDTO> listInvoices() {
    return listInvoicesUseCase.listInvoices();
  }
}
