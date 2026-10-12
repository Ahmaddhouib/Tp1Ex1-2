package factures;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Cheque extends Reglement{
	
	private String numCheque;
	private String nomBanque;
	private LocalDate datEcheance;
	public Cheque(LocalDate datReg, int montantReg,String numCheque, String nomBanque, LocalDate datEcheance) {
		super(datReg, montantReg);
		this.numCheque = numCheque;
		this.nomBanque = nomBanque;
		this.datEcheance = datEcheance;
	}
	
	

}
