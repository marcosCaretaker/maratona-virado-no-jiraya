package academy.marcoscaretaker.maratonajava.pratices.Miniagenda.domain;

public class CadastroCompromisso {
    private final String appointmentName;
    private final String appointmentDate;
    private final String priority;

    public CadastroCompromisso(String appointmentName, String appointmentDate, String priority) {
        this.appointmentName = appointmentName;
        this.appointmentDate = appointmentDate;
        this.priority = priority;
    }
}
