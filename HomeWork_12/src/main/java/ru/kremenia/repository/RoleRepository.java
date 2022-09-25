package ru.kremenia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kremenia.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
