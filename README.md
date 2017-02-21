# 06_toto_external_functions
Már elkészített függvény gyűjtemény felhasználása

Az előbbiekben létrehoztunk egy fuggvenyek.java állományt, amelyben van 3 tömbkezelő függvény.

Használjuk fel a függvényeket egy új projektben. 

Feladat:  

 Hozzunk létre egy projektet tombocske néven

 Generáljuk le vele az EuroJackpot nyerőszámainak megfelelő halmazokat tömb segítségével (5 számot húzunk 1-50-ig, és 2 számot húzunk 1-10-ig)

 Használjuk a fuggvenyek.java állományunkat, hiszen LUSTÁK VAGYUNK ÚJRA MEGÍRNI A FÜGGVÉNYEKET! 


1. Totó

A totó elnevezésű játék egy a labdarúgó mérkőzések eredményére tippelő szerencsejáték. A játékos 13+1 meccs kimenetét tippelheti meg 1, 2 és X jelölésekkel. (1: hazai, 2: vendég, X:döntetlen). 

A toto.txt állomány az elmúlt hét mérkőzéseinek helyes tipposzlopát tartalmazza úgy, hogy a páratlan sorokban a csapatok, a páros sorokban a helyes tipp található. 

Feladat: 

 Olvassuk be a fájlból 1-1 listába a csapatok párosítását és a helyes tippeket

 Kérjük be a felhasználótól a saját totó-tippjeit az alábbi formában (a kiíráshoz használjuk a megfelelő lista adatait!): 

  Adja meg a tippjeit!
  1. Napoli – Roma: 1
  2. Empoli – Juventus: 2
  3. Parma – Internazionale: 1
  4. Sampdoria – Fiorentina: 1
  … 
  13+1: Milan – Palermo: X 

 A felhasználó tippjeit szintén egy listában tároljuk el!

 Írjunk függvényt, amely a felhasználó tippjeit összehasonlítja a helyes tippsorozattal, és visszatérő értéke a találatok száma! Írjuk is ki a segítségével a találatokat! 
