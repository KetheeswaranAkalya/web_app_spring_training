package fr.lernejo.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {
    private final TodoRepository todoRepository;

    public TodoListController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/api/todo")
  public TodoRepository todolist(){return todoRepository;}

    @PostMapping("/api/todo")

    public void addList(@RequestBody Todo todo) {
        TodoEntity do_item = new TodoEntity();
        do_item.message = todo.message();
        do_item.author = todo.author();
        todoRepository.save(do_item);
    }

}
