package lambdasNivell3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewMain {

    public static void main(String[] args) {
        
        Alumne alumne1 = new Alumne("Toño", 24, "Java", 8.5);
	Alumne alumne2 = new Alumne("Ana", 28, "PHP", 5.5);
	Alumne alumne3 = new Alumne("Queco", 29, "Python", 7.5);
	Alumne alumne4 = new Alumne("Siscu", 17, "Java", 7);
	Alumne alumne5 = new Alumne("Pere", 26, "C++", 9);
	Alumne alumne6 = new Alumne("Manela", 26, "Cobol", 6);
	Alumne alumne7 = new Alumne("Ada", 23, "Python", 8.5);
	Alumne alumne8 = new Alumne("Xusco", 25, "PHP", 3);
	Alumne alumne9 = new Alumne("Pitu", 25, "Java", 7.5);
	Alumne alumne10 = new Alumne("Siset", 23, "Cobol", 5);
        
        List<Alumne> alumnes = new ArrayList<>(Arrays.asList(alumne1, alumne2, alumne3, alumne4, alumne5, alumne6, alumne7, alumne8, alumne9, alumne10));
        
        //Mètode per mostrar nom i edad:
	System.out.println("Nom i edat dels alumnes ");
	alumnes.forEach(alumne -> {
		System.out.println("Nom: " + alumne.getNom() + ", edad: " + alumne.getEdat());
	});
        
        //Mètode per mostrar alumnes que comencen per A i mostra per llista
        System.out.println("\nAlumnes comencen per A ");
	List<Alumne> comencenPerA = alumnes.stream()
                .filter(alumne -> alumne.getNom().startsWith("A"))
		.collect(Collectors.toList());
		comencenPerA.forEach(System.out::println);
        
        //Mètode per mostrar alumnes amb nota igual i superior a 5        
        System.out.println("\nAlumnes amb nota igual o superior a 5 ");
	alumnes.stream()
		.filter(alumne -> alumne.getNota() >= 5)
		.collect(Collectors.toList())
		.forEach(System.out::println);
        
        //Mètode per mostrar alumnes amb nota igual o superior a 5 i no fan PHP
        System.out.println("\nAlumnes amb nota igual o superior a 5 i no fan PHP");
	alumnes.stream()
                .filter(alumne -> alumne.getNota() >= 5)
		.filter(alumne -> !alumne.getCurs().equalsIgnoreCase("PHP"))
		.forEach(System.out::println);
        
        //Mètode per mostrar alumnes que fan JAVA i són majors d´edat
        System.out.println("\nAlumnes que fan JAVA i són majors d´edat");
	alumnes.stream()
                .filter(alumne -> alumne.getCurs().equalsIgnoreCase("JAVA"))
		.filter(alumne -> alumne.getEdat() >= 18)
                .forEach(System.out::println);
		
        }
    
}
