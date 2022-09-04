package uz.jl.springbootfeatures.services.other;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.jl.springbootfeatures.dtos.TaskCreateDto;
import uz.jl.springbootfeatures.dtos.TaskDto;
import uz.jl.springbootfeatures.repository.BoardRepository;
import uz.jl.springbootfeatures.repository.TaskRepository;
import uz.jl.springbootfeatures.repository.WorkSpaceRepository;
import uz.jl.springbootfeatures.repository.WorkSpaceUserRepository;

import java.util.Objects;

/**
 * @author: Shohimardon Abdurashitov
 * @since; September  Friday 14:20:35
 * @product Name:  spring-boot-161
 * @Class Name: TaskService
 * IntelliJ IDEA
 **/
@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final BoardRepository boardRepository;

    private final WorkSpaceRepository workSpaceRepository;

    private final WorkSpaceUserRepository userRepository;

    public TaskDto create(TaskCreateDto dto) {


        Objects.requireNonNull(dto);


        return null;
    }

    public TaskDto update(TaskDto dto) {
        return null;
    }

    public void delete(TaskDto dto) {

    }
}
