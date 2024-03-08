package tasklist.deadline;
import tasklist.todo.Todo;

public class Deadline extends Todo {
    protected String date;

    public Deadline(String description, String date) {
        super(description);
        this.date = date;
        type = "[D]";
    }

    public String formatTask() {
        return (type + status + description + "(by:" + date + ")");
    }

    public String getWriteFormat() {
        return (type + status + description + "/by" + date);
    }
}

