package com;

import java.util.ArrayList;

public class Controller {
    private String todo;

    public Controller(String todo){
        this.todo = todo;
    }

    public String getTodo(){
        return todo;
    };

    public void setTodo(String newTodo){
        this.todo = newTodo;
    }

    @Override
    public String toString(){
        return "New todo has been created \n" + todo;
    }
}
