package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.repositorio.Repository;

public class ArchiveRepository implements Repository {


    @Override
    public void salvar() {
        System.out.println("Saving to one archive");
    }
}
