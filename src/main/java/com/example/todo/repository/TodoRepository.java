// Write your code here


// Write your code here

package com.example.todo.repository;
import java.util.*; 
import com.example.todo.model.*;
public interface TodoRepository{

ArrayList<Todo> getTodos(); 

Todo getTodoById(int todoId); 

Todo addTodo(Todo todoId); 

Todo updateTodo(int todoId, Todo todo); 

void deleteTodo(int todoId);

}

















