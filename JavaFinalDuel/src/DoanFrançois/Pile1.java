package DoanFrançois;

import java.util.ArrayList;

import specifications.Pile;

public class Pile1<T> implements Pile<T>{

	/**
	 * @param args
	 */
	ArrayList<T> a1 = new ArrayList<T>();
	@Override
	public void empiler(T item) {
		// TODO Auto-generated method stub
		a1.add(item);			
	}

	@Override
	public T sommet() {
		// TODO Auto-generated method stub
		if (a1.isEmpty())
		{
		return null;
		}
		else return a1.get(a1.size()-1);
	}

	@Override
	public void depiler() {
		// TODO Auto-generated method stub
		a1.remove(sommet());
	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return a1.isEmpty();
	}

	@Override
	public void vider() {
		// TODO Auto-generated method stub
		a1.removeAll(a1);
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return a1.size();
	}

}
