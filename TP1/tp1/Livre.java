package tp1;

public class Livre {
	
	private String titre;
	private String nom;
	private String numISBN;

	/**
	 * Constructeur de Livre
	 */
	public Livre(String titre, String nom, String numISBN){
		this.titre = titre;
		this.nom = nom;
		this.numISBN = numISBN;
	}
	
	/**
	 * Methode permettant l'affichage en console de l'objet Livre
	 */
	
	public String toString(){
		return ("Titre : "+titre+"\nAuteur : "+nom+" \nNum�ro ISBN : "+numISBN);
	}
	
	/*
	 * Main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre Livre1  = new Livre ("Les lettres de mon moulin","Alphonse Daudet","1234567890");
		
		System.out.println(Livre1);

	}

}
