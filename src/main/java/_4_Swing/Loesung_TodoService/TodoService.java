package _4_Swing.Loesung_TodoService;

import org.json.JSONArray;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Optional;

public class TodoService {
    private final ArrayList<Todo> todos;
    private final String filePath = "/Users/thor/Arbeit/Themen/Code/JavaAdvanced/src/_4_Swing/Loesung_TodoService/todos.json";

    public TodoService() {
        this.todos = new ArrayList<>();
        loadFromJson();
    }

    public ArrayList<Todo> fetchAll() {
        return new ArrayList<>(todos);
    }

    public void insert(Todo todo) {
        todos.add(todo);
        saveToJson();
    }

    public void update(Todo todo) {
        Optional<Todo> existing = todos.stream()
                .filter(t -> t.getText().equals(todo.getText()))
                .findFirst();

        existing.ifPresent(t -> {
            t.setDone(todo.isDone());
            saveToJson();
        });
    }

    public void delete(Todo todo) {
        if (todos.removeIf(t -> t.getText().equals(todo.getText()))) {
            saveToJson();
        }
    }

    private void saveToJson() {
        JSONArray jsonArray = new JSONArray();
        for (Todo todo : todos) {
            jsonArray.put(todo.toJSON());
        }

        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonArray.toString(2)); // Pretty-Print
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromJson() {
        if (!Files.exists(Paths.get(filePath))) {
            return;
        }

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONArray jsonArray = new JSONArray(content);

            todos.clear();
            for (int i = 0; i < jsonArray.length(); i++) {
                todos.add(Todo.fromJSON(jsonArray.getJSONObject(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
