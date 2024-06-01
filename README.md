
# Prix le plus bas 

Inspiré de BattleDev Novembre2017

# Enoncé

Pendant les soldes d'hiver, les bonnes affaires partent vite. C'est souvent le premier arrivé sur place qui déniche les bonnes occasions. Une seule solution : se rendre dans un maximum de magasins en quelques heures.

Afin d'optimiser au maximum votre temps, vous décidez de créer votre propre comparateur de prix. Vous alimentez votre comparateur depuis une base de données contenant des catalogues de produits provenant de plusieurs enseignes différentes.

L'objectif de ce challenge est de déterminer le prix le plus bas pour un produit donné. Un produit peut apparaître plusieurs fois dans le comparateur avec des prix différents (en fonction du prix affiché par les différentes enseignes).

# Format des données

# Entrée

Ligne 1 : un entier N compris entre 10 et 10000 représentant le nombre de produits dans votre comparateur.

Ligne 2 : une chaîne P comprenant entre 2 et 50 caractères représentant le produit recherché.

Lignes 3 à N+2 : une chaîne comprenant entre 2 et 50 caractères et un entier séparés par un espace représentant respectivement le nom d'un produit et le prix associé. Le produit P apparaîtra au moins une fois dans la liste.

# Sortie

 Un entier représentant le prix le plus bas du produit P dans la liste.
