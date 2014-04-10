package DoanFrançois;

import specifications.Evenement;
import specifications.Factory;
import specifications.Historique;
import specifications.Pile;
import specifications.PileAnnulable;

public class Factory1 implements Factory{

	/**
	 * @param args
	 */
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "Doan François";
	}

	@Override
	public <T> Pile<T> createPile() {
		// TODO Auto-generated method stub
		return new Pile1<T>();
	}

	@Override
	public <T extends Evenement> Historique<T> createHistorique() {
		// TODO Auto-generated method stub
		return (Historique<T>) new Historique1();
	}

	@Override
	public <T> PileAnnulable<T> createPileAnnulable() {
		// TODO Auto-generated method stub
		return new PileAnnulable1<T>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main.Main.simpleMoulinette(new DoanFrançois.Factory1());
	}

	
}
