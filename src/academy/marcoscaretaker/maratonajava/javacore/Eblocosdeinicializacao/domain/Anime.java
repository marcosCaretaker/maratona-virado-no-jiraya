package academy.marcoscaretaker.maratonajava.javacore.Eblocosdeinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // 1 - Allocated memory space
    // 2 - Each class attribute is created and initialized with default values or whatever values are passed
    // 3 - The initialization block runs
    // 4 - The builder is executed

    // text to test whether what Gemini said is true


    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
        }
        public Anime(){
            for(int episode:episodes){
                System.out.print(episode +" ");
            }
            System.out.println("");

        }
        public Anime(String name){
            this.name = name;
        }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

