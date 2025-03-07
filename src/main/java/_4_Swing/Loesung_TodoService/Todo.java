package _4_Swing.Loesung_TodoService;
import org.json.JSONObject;



// baue eine Datenklasse {done: boolean, text: String}


public class Todo {
    private boolean done;
    private String text;

    public Todo(String text) {
        this.text = text;
        this.done = false; // Standardmäßig nicht erledigt
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("done", done);
        json.put("text", text);
        return json;
    }

    public static Todo fromJSON(JSONObject json) {
        Todo todo = new Todo(json.getString("text"));
        todo.setDone(json.getBoolean("done"));
        return todo;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "done=" + done +
                ", text='" + text + '\'' +
                '}';
    }
}

