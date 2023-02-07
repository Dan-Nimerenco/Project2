package Junior_Part.Proiect_P2;

import java.util.Random;

public interface ISurprise {
    void enjoy();

    static int numarAleator(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

