package com.example.todo_spring_notification.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.todo_spring_notification.entity.Todo;
import com.example.todo_spring_notification.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final TodoRepository todoRepository;
    
    @Async
    @Scheduled(fixedRate = 60000)
    public void checkDeadlines() {
        LocalDate today = LocalDate.now();
        LocalDate deadline = today.plusDays(1);
        List<Todo> todos = todoRepository.findByDeadline(deadline);

        for (Todo todo : todos) {
            System.out.println("期限間近: " + todo.getTitle());
        }
    }
}
