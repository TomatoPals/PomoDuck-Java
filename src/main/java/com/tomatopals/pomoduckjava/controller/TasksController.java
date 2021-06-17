package com.tomatopals.pomoduckjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomatopals.pomoduckjava.entity.Task;
import com.tomatopals.pomoduckjava.exception.ResourceNotFoundException;
import com.tomatopals.pomoduckjava.repository.TasksRepository;

@RestController
@RequestMapping("/v1/task")
public class TasksController {
    @Autowired
    private TasksRepository tasksRepository;

    // get all users
    @GetMapping
    public List<Task> getAllTasks() {
        return this.tasksRepository.findAll();
    }

    // get task by id
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable(value = "id") long taskId) {
        return this.tasksRepository.findById(taskId)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id :" + taskId));
    }

    // create task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return this.tasksRepository.save(task);
    }

}
