package com.tomatopals.pomoduckjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomatopals.pomoduckjava.entity.Task;
import com.tomatopals.pomoduckjava.repository.TasksRepository;

@RestController
@RequestMapping("/v1/tasks")
public class TasksController {
    @Autowired
    private TasksRepository tasksRepository;

    // get all users
    @GetMapping
    public List<Task> getAllUsers() {
        return this.tasksRepository.findAll();
    }

}
