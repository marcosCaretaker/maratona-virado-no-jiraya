package academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.pratice.domain;

public class Studio {
    private String name;
    private String country;
    private int foundingYear;

    public void init(String name, String country, int foundingYear){
        this.name = name;
        this.country = country;
        this.foundingYear = foundingYear;
    }

    public void print(){
        System.out.println("name: "+this.name);
        System.out.println("country: "+this.country);
        System.out.println("founding year: "+this.foundingYear);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
