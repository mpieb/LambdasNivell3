package lambdasNivell3;

//Definició de clase Alumne
public class Alumne {
    
    
    //Definició de camos de clase
    private String nom;
    private int edat;
    private String curs;
    private double nota;
	
    //Constructor de clase, inici de camps
    public Alumne(String nom, int edat, String curs, double nota) {
	this.nom = nom;
	this.edat = edat;
	this.curs = curs;
	this.nota = nota;
	}

	public String getNom() {//Getter
		return nom;
	}

	public void setNom(String nom) {//Setter
		this.nom = nom;
	}

	public int getEdat() {//Getter
		return edat;
	}

	public void setEdat(int edat) {//Setter
		this.edat = edat;
	}

	public String getCurs() {//Getter
		return curs;
	}

	public void setCurs(String curs) {//Setter
		this.curs = curs;
	}

	public double getNota() {//Getter
		return nota;
	}

	public void setNota(double nota) {//Setter
		this.nota = nota;
	}
        
        //Mètode de sobreescriptura toString
	@Override
	public String toString() {
		return "Alumne [nom=" + nom + ", edat=" + edat +
                        ", curs=" + curs + ", nota=" + nota + "]";
	}
	
}

   

    

