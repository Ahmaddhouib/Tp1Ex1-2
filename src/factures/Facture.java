package factures;

import java.time.LocalDate;

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
public class Facture {
	
	private String numero ;
	private LocalDate dateCreation;
	private double montant;
	private Reglement reglement;
	

}
