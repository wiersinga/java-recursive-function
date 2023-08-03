# java-recursive-function
***Définition la  récursivité***
On appelle récursive toute fonction ou procédure qui s’appelle elle
même.Voici un petit exemple: 

def f(x):
x = 2 * x;
f(x);
return x;

Nous voyons bien que la fonction f s'appelle elle même à la ligne 3. En réalité, voilà comment l'ordinateur agit :
def f(x):
x = 2 * x;
   x = 2 * x;
     x = 2 * x;
       x = 2 * x;
         x = 2 * x;
           ...
return x;

une fonction récursive permet derésoudre des problèmes, d'habitude irrésolvables avec l'utilisation de simples boucles pour ou tant que.

Le dossier "src" contient 4 Classes:
- FactorialFunction: qui retourne la factorielle d'un nombre n.
- FibonacciFunction: qui retourne la valeur Fn d’un nombre n.
- SyracuseFunction: qui retourne la valeur U(N, i).
- FunctionPGCD: qui retourne Le plus grand commun diviseur de deux nombres entiers.