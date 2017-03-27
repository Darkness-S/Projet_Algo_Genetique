package simpleGa;

public class GA {

    public static void main(String[] args) {

        // Set a candidate solution
        FitnessCalc.setSolution("10101010101010101010");

// Repasser les 10 premiers digits en décimal 
// Repasser les 10 derniers digits en décimal 
// Appliquer la série de calcul 
	int SurfaceGC; 
	SurfaceGC = (int)(Math.pow(50,2) * Math.PI);
	System.out.println("Surface grand cercle : "+SurfaceGC); 
	
	String A, B; 
	
	
	int cercleA; 
	cercleA = (decimal(A)/1023) * ((80 - 10)/0.1) * 0.1 + 10
	
	int cercleB;
	cercleB = (decimal(B)/1023) * (80 - decimal(A)) + 10
	if((A<10)||(A>80)){
		System.out.println("Erreur : A non valide"); 
	}
	if((B<10)||(B>80)){
		System.out.println("Erreur : B non valide"); 
	}
	
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
