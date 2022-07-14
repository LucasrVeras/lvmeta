package br.com.lucasveras.lvmeta.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Sale> findSale() {	
		return saleRepository.findAll();
	}
}
