package academy.marcoscaretaker.maratonajava.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - The initialization block is executed when the JVM loads a class
    // 1 - Allocated memory space
    // 2 - Each class attribute is created and initialized with default values or whatever values are passed
    // 3 - The initialization block runs
    // 4 - The builder is executed

    static {
        System.out.println("Inside static initialization block 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside static initialization block 2");
    }

    {
        System.out.println("Inside initialization block 1");
    }


    public Anime() {
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println("");

    }

    public Anime(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        Anime.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

