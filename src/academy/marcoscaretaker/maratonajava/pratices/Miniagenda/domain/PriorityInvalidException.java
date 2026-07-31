package academy.marcoscaretaker.maratonajava.pratices.Miniagenda.domain;

public class PriorityInvalidException extends Exception{
        public PriorityInvalidException(){
            super("Priority invalid");
        }

        public PriorityInvalidException(String message){
            super(message);
        }
}
