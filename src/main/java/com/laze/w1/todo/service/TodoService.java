package com.laze.w1.todo.service;

import com.laze.w1.todo.dto.TodoDto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;

    public void register(TodoDto todoDto) {
        System.out.println("Debug..." + todoDto);
    }

    public List<TodoDto> getList() {

        List<TodoDto> todoDtoList = IntStream.range(0,10).mapToObj(i -> {
            TodoDto dto = new TodoDto();
            dto.setTno((long)i);
            dto.setTitle("Todo.." + i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList());

        return todoDtoList;
    }

    public TodoDto getByTno(long tno) {
        TodoDto dto = new TodoDto();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
