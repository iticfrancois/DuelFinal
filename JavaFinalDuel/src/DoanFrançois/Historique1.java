package DoanFrançois;

import specifications.Annulable;
import specifications.Evenement;
import specifications.Historique;

public class Historique1<T extends Evenement> implements Historique<Evenement>{

	/**
	 * @param args
	 */
	Pile1<T> PileA;
	Pile1<T> PileB;
	
 	@Override
	public boolean annuler() {
		// TODO Auto-generated method stub
 		
		return false;
	}

	@Override
	public boolean retablir() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void vider() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouter(Evenement item) {
		// TODO Auto-generated method stub
		
	}

}
