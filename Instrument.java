interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("playing guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("playing piano");
    }
}

public class Instrument {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play();
        p.play();
    }
}
