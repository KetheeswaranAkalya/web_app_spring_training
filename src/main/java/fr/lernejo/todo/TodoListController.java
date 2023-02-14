package fr.lernejo.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {
  private final List<Todo> todolist = new ArrayList<>();
    @GetMapping("/api/todo")
  public List<Todo> todolist(){ return todolist;}
    @PostMapping("/api/todo")
  public void addList(String author, String message) {
      todolist.add(new Todo(author, message));
  }


}
