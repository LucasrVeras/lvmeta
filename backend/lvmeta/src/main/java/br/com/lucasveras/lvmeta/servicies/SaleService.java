package br.com.lucasveras.lvmeta.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.lucasveras.lvmeta.models.Sale;
import br.com.lucasveras.lvmeta.repositories.SaleRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
@NoArgsConstructor
@Getter
@Setter
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	// Buscar Vendas
	public Page<Sale> findSale(Pageable pageable) {	
		return saleRepository.findAll(pageable);
	}
}
