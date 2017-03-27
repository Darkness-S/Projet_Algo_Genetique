Le périmètre du grand disque est égal à la somme des périmètres des petits disques. 
2 * PI * R = Périmètre d'un disque 

Le principe est de trouver la taille des 3 cercles pour que le périmètre du plus grand cercle soit la plus grande. 
Avec : 
(pour le grand cercle) 
D = 100
R = 50 
S = PI * R² = 50² * PI 
(Nommons les cercles A, B et C) 
SA = PI(A/2)² 
SB = PI(B/2)² 
SC = PI(C/2)² 
Surface à l'extérieur = SE = S - (SA + SB + SC)
On obtient ainsi : 
SE = PI(50² - (A/2)² - (B/2)² - (C/2)²)
SE = PI(50 - (A²+B²+C²)/2)

DA + DB + DC = 100 
DA >= 10
DB >= 10 
DC >= 10 
On va supprimer une des données du problème car on connaît la valeur finale. 
On ne codera donc pas C 

On peut en déduire que : 
10 <= DA <= 80 
10 <= DB <= 80 <-> 10 <= B <= 100 - (A + 10)


