package com.example.To_Do_List.model;

public final class ToDoBuilder {
    private long id;
    private String title;
    private boolean completed;

    private ToDoBuilder() {
    }

    public static ToDoBuilder aToDo() {
        return new ToDoBuilder();
    }

    public ToDoBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public ToDoBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public ToDoBuilder withCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public ToDo build() {
        ToDo toDo = new ToDo();
        toDo.setId(id);
        toDo.setTitle(title);
        toDo.setCompleted(completed);
        return toDo;
    }
}
