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

public class Cash extends Reglement{
	
	

	public Cash(LocalDate datReg, int montantReg) {
		super(datReg, montantReg);
	}	
	
	
	
	
	

}
