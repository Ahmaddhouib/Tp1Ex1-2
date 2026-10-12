package factures;

import java.util.Optional;

public interface IDAOFactures {

	public void save( Facture f) ;
	public Optional<Facture> findByNumero(String num) ;
}
