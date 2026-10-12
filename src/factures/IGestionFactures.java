package factures;

import java.util.Optional;

public interface IGestionFactures {
	
	public  void enregistrer( Facture f);
	public Optional<Facture> chercherParNumero(String num) ;
}
