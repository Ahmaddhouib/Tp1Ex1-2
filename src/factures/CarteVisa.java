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
public class CarteVisa extends Reglement{
	
	private String numCarte;
	private String NomProp;
	private LocalDate datVal;
	public CarteVisa(LocalDate datReg, int montantReg, String numCarte, String nomProp, LocalDate datVal) {
		super(datReg, montantReg);
		this.numCarte = numCarte;
		NomProp = nomProp;
		this.datVal = datVal;
	}
	
	
	

}
