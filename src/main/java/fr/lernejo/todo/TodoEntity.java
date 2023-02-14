package fr.lernejo.todo;

import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class TodoEntity {
    public String message;
    public String author;

    public Long id;
}
