package academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.test;

import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.repositorio.Repository;
import academy.marcoscaretaker.maratonajava.javacore.Npolimorfismo.service.MemoryRepository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        repository.salvar();
    }
}
