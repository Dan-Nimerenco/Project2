package Junior_Part.Proiect_P2;
import java.util.ArrayList;

public class FortuneCookie implements ISurprise {
    private final String zicala;
    private static final String[] listaZicale = {"In definitiv, nu anii din viata sunt cei care conteaza, ci viata din anii" +
            " tai. [Abraham Lincoln]"
            ,"Sunt doua feluri de a-ti trai viata… Unul – de a crede ca nu exista miracole. Altul – de a crede ca totul" +
            " este un miracol.  [Albert Einstein]"
            ,"Ca să-ţi pierzi capul, trebuie să-l ai. [Albert Einstein]"
            ,"Lumea pe care am creat-o este un proces al gândirii noastre. Nu poate fi schimbată fără a ne schimba" +
            " gândirea.  [Albert Einstein]"
            ,"Destinul prinde formă în momentul în care iei o decizie. [Anthony Robbins]"
            ,"Dacă nu ai un plan al tău, alţii te vor include în planurile lor.   [Anthony Robbins]"
            ,"Viaţa îţi va plăti orice preţ îi vei cere. Trebuie să ştii să ceri inteligent. [Anthony Robbins] "
            ,"Ceea ce credem noi că este adevărat, ceea ce credem noi că este posibil devine adevărat şi posibil!" +
            "[Anthony Robbins] "
            ,"Lucrurile pe care le facem din când în când nu ne conturează viaţa, ci lucrurile pe care le facem în" +
            " mod constant. [Anthony Robbins] "
            ,"Invata din greselile altora, nu poti trai destul pentru a le face pe toate. [Anna Eleanor Roosevelt]"
            ,"Viata nu trebuie aratata asa cum este, ci asa cum o vezi in vis. [Anton Pavlovici Cehov]"
            ,"Sensul existenţei noastre este să fim fericiţi [Dalai Lama] "
            ,"Fii bun de câte ori se poate. Şi întotdeauna se poate.  [Dalai Lama]"
            ,"O atmosferă plăcută în casă este baza vieţii tale. [Dalai Lama]"
            ,"Învaţă regulile astfel încât să ştii cum să le încalci cum se cuvine. [Dalai Lama]"
            ,"Judecă succesul tău prin ceea ce trebuie să renunţi ca să poţi obţine  [Dalai Lama]"
            ,"Viata si cu mine suntem doua linii paralele care ne intalnim in moarte.   [Emil Cioran]"
            ,"Viata este lucrul cel mai bun din cate s-au inventat vreodata. [Gabriel Jose Garcia Marquez]"
            ,"Viata e nimicitoarea iluziilor  [Liviu Rebreanu]"
            ,"Traieste ca si cum ai muri maine. Invata ca si cum ai trai vesnic. [Mahatma Ghandi]"};
    private static FortuneCookie f;


    //Constructors
    public FortuneCookie(String s){
        this.zicala = s;
    }

    public static void generate(){
        FortuneCookie.f = new FortuneCookie(listaZicale[ISurprise.numarAleator(0,FortuneCookie.listaZicale.length-1)]);
    }

    public static FortuneCookie getF() {
        return FortuneCookie.f;
    }

    @Override
    public void enjoy() {
        System.out.println(this.zicala);
    }
}
