package com.example.todo_spring_notification.repository;

import java.util.List;

import com.example.todo_spring_notification.entity.Todo;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>  {
    List<Todo> findByDeadline(LocalDate deadline);
}
