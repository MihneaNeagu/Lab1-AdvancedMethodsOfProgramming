package mi.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageTask extends Task {
    private String body;
    LocalDateTime date;
    public static final DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
    public MessageTask(Long id, String desc, String body, LocalDateTime date) {
        super(id, desc);
        this.body = body;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Task-ul "+toString()
                +" a fost executat cu succes la data "
                +date.format(formatter));
    }
}
