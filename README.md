# TP MONGODB AND REDIS

#### Quick start :
   - Download the project with zip or clone this repository with : 
``` sh
$ git clone https://github.com/quentin22800/jpasir.git
```
- Import the project into eclipse (or other IDE) as a Maven project.
- Change the property (YOUR_DATABASE_URL) in the persistence.xml :
Question:

#1) Quelles sont les limites d’une base données orientées document
	
Une base de donnée relationnelle permet plus de flexibilité au niveau des requêtes et du chargement des données qu'une base de données orientée document

#2) Quelles sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ?
Les types de données stockés dans Redis sont : 
- Chaîne de caractères
- Listes
- Hash
- Ensembles
- Ensembles triés

Avec Redis, on ne peut faire des requêtes que sur les clefs (impossible sur les valeurs).

classes : ce package correspond au modèle et contient les classes Article, Address, Person
mongodb : contient le main à exécuter pour la partie mongodb
redis : contient le main à exécuter pour la partie redis
