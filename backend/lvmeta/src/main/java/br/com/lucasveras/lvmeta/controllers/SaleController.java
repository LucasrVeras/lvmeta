package br.com.lucasveras.lvmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasveras.lvmeta.models.Sale;
import br.com.lucasveras.lvmeta.servicies.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public Page<Sale> findSales(Pageable pageable){
		return saleService.findSale(pageable);
	}
}
