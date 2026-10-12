package factures;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Client c1 = new Client("AZERTY123456","Sfax","Salah", Catcli.FIDELE);
        System.out.println(c1);
        Facture f1 = new Facture("132456",LocalDate.of(7, 7, 2007),12,new Cash(LocalDate.of(7, 7, 2007),12));
        GestionFactures ges= new GestionFactures();
        ges.enregistrer(f1);
        ges.chercherParNumero("1234556");
	}

}
