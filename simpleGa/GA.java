package simpleGa;

public class GA {

	public static double setSurface(double diametre){
		return (Math.PI * Math.pow((diametre/2),2)); 
	}

    public static void main(String[] args) {

        // Set a candidate solution
      //  FitnessCalc.setSolution("10101010101010101010");

// Repasser les 10 premiers digits en décimal 
// Repasser les 10 derniers digits en décimal 
// Appliquer la série de calcul 
	String solution = "1234567891010101010";
	double surfaceGC; 
	surfaceGC = (Math.pow(50,2) * Math.PI);
	System.out.println("Surface grand cercle : "+surfaceGC); 
	
	
	
	String A, B; 
	A = "0011010101"; 
	B = "1100100110"; 
	double valA, valB; 
	valA = (Integer.parseInt(A,2));
	valB = (Integer.parseInt(B,2));
	double cercleA; 
	cercleA = (valA/1023) * ((80 - 10)/0.1) * 0.1 + 10;
	
	double  cercleB;
	cercleB = (valB/1023) * (80 - cercleA) + 10;
	if((cercleA<10)||(cercleA>80)){
		System.out.println("Erreur : A non valide : " + cercleA); 
	}
	if((cercleB<10)||(cercleB>80)){
		System.out.println("Erreur : B non valide : " + cercleB); 	
	}	
	
	System.out.println(" Valeur de A : " + cercleA + " | de B : " + cercleB ); 
	
	// Calculer la surface par rapport aux valeurs précédentes 
	double surfaceA, surfaceB, surfaceC, surfaceEXT, cercleC; 
	cercleC = 100 - (cercleB + cercleA); 
	surfaceA = setSurface(cercleA);  
	surfaceB = setSurface(cercleB); 
	surfaceC = setSurface(cercleC); 
	surfaceEXT = surfaceGC - (surfaceA + surfaceB + surfaceC); 
	 
	System.out.println(" Cercle c : " + cercleC); 
	System.out.println(" Surface A : " + surfaceA); 
	System.out.println(" Surface B : " + surfaceB); 
	System.out.println(" Surface C : " + surfaceC); 
	System.out.println(" Surface EXT : " + surfaceEXT); 
	
// 20 digits max, 10 pour A et 10 pour B, C n'est pas pris en compte 
// A + B + C = 100 
// C -> Inutile 
        // Create an initial population
        Population myPop = new Population(500, true);
        
        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());

    }
}
