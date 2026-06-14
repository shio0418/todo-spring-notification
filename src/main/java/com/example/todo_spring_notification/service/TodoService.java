package com.example.todo_spring_notification.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.todo_spring_notification.entity.Todo;
import com.example.todo_spring_notification.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public void save(String title, LocalDate deadline) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setDeadline(deadline);
        todoRepository.save(todo);
    }

    public void toggleComplete(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        todo.setCompleted(!todo.isCompleted());
        todoRepository.save(todo);
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
