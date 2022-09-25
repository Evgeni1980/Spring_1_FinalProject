package ru.kremenia.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kremenia.model.Role;
import ru.kremenia.repository.RoleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public List<Role> findAll(){
        return roleRepository.findAll();
    }
}
