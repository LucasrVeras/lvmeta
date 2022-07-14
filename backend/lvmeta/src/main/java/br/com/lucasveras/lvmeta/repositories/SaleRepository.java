package br.com.lucasveras.lvmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucasveras.lvmeta.models.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
