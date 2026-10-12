package factures;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class GestionFactures implements IGestionFactures {
	private IDAOFactures dao;

	@Override
	public void enregistrer( Facture f) {
		dao.save(f);
	}

	@Override
	public Optional<Facture> chercherParNumero(String num) {
		Optional<Facture> f= dao.findByNumero(num);
		if (f==null){
			return Optional.empty();
		}
		return f;
		

	}
	
	public void affReg(Facture f) {
		Optional<Facture> x= chercherParNumero(f.getNumero());
		System.out.println(x.toString());
	}
	

	

}
