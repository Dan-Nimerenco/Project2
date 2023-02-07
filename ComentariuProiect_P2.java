package Junior_Part.Proiect_P2;

public class ComentariuProiect_P2 {
    /*
    Filosofia acestui proiect consta in crearea a 3 tipuri de surprize, pe care potential il poate primi un copil.
    Copilul poate percepe detaliile cadoului prin metoda de savurare a surprizei (enjoy())
    Astfel, indiferent de tipul surprizei, toate trebuie sa poata fi savurate, si acest lucra n-il asigura implementarea
    comuna a interfetei ISurprise

    Suprizele create pot sa fie tinute in pungi (Bags). Comportamentul pungilor este unul destul de apropiat, mai putin
    fenomenul de scoatere a suprizelor din pungi. Astfel avem Random, FIFO, LIFO. Dar indiferent de formatul pungii,
    toate trebuie sa aiba un comportament similar. Astfel ca, indiferent ce punga nu am lua in mana, sa execute aceleasi
    actiuni tipice unei pungi, sa bagam in ea o surpriza, sau sa bagam in ea toate surprizele altei pungi, sau sa
    scoatem din ea, sau sa vedem cate surpize are, si daca e goala. Elementul care ne asigura ca orice punga sa aiba
    setul necesar de operatii, este Interfata IBag. Orice tip de punga avem sau vom adauga pe viitor, TREBUIE sa
    implementeze interfata data, ca sa poate fi in rol de "punga (BAG)"

    Considerand preferinta de a minimiza crearea obiectelor de Random, am decis sa creez o metoda statica, in cadrul
    interfetei ISurprize, si ulterior doar sa o apelez in surprizele care implementeaza acea interfata.

    Totodata Interfetele date servesc ca Nivel Upcast pentru pastrarea tuturor tipurilor similare in un vector anumit.
    Astfel pentru a tine toate suprizele la un loc, ne ajuta Arraylist-ul de ISuprise, iar pentru a tine toate pungile
    la un loc ne ajuta  Arraylist-ul de IBag

    Pentru a genera tot felu de suprize, cat in regim singular atat si in regim multiplu, avem nevoie de functionalitate
    universala. Astfel avem nevoie de ceva metode statice, care stabil vor crea aceste surprize de cate ori avem nevoie
    Pentru aceste metode se si creaza o clasa Speciala, insa evident nu se doreste permiterea crearii instantelor
    acestei clase, si nici nu se doreste posibilitatea de a o mosteni. Practic aici trebuie sa fie aplicat principiul
    de Singleton Pattern. Astfel ca avand o instanta a clasei, si o metode publica cu care vom putea accesa aceasta
    instanta, noi constant putem sa accesam metoda de creare a suprizelor intr-un mod foarte optimizat.
    Totodata in metodele de generare a suprizelor se implementeaza randomizare in tipul de supriza ce va fi creat,
    astfel nici o generare multiple nu va avea o consecutivitate predictibila.

    Generarea pungilor cu cadouri, la fel trebuie sa reprezinta un proces ne-manual. Astfel putem utiliza principiul
    Factory, adica a unei fabrici ce genereaza pungile date. Cu aceasta fabrica noi practic scoatem din complexitate, si
    oferit posibilitatea de a genera folosind o instanta comuna, mai multe tipuri de pungi cu cadouri, avand la indemana
    doar denumirile tipurilor de pungi.
    Asadar, o fabrica poate sa faca multe, insa sunt metode care efectiv definesc baza necesara a unui comportament de
    fabrica, cum ar fi : efectiv crearea pungii. Pentru asta se face o Interfata IBagFactory, care incluse metodele
    necesare. iar Clasa BagFactory, care la fel o facem folosibila doar ca return de instanta, va implementa aceasta
    interfata.
    In asa fel, doar trebuie sa fie facut apelul catre instanta fabricii, apoi apelata metoda de creare a pungii pentru
    surprize, cu introducerea in forma de String a denumirii tipului de pungi.

    Pentru lucrul cu pungile in directia inversa, si anume interactiunea cu utilizatorul, se foloseste clasa abstracta
    AbstractGiveSurprises, care include comporamentul tipic de oferire a cadoului, adica metode de luare si oferire
    a surprizei anumite. Dar mai contine si metoda abstracta pentru oferirea posibilitatii de a diversifica acompanimentul
    deschiderii unei surprize. In proiectul dat, diversificarea e data de 3 clase ce extind aceasta clasa, si anume
    dupa cadou se canta sau se imbratiseaza sau se aplauda.

    */
}
