package ru.kremenia.model.mapper;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kremenia.model.Role;
import ru.kremenia.model.User;
import ru.kremenia.model.dto.UserDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-25T12:32:13+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.3 (Oracle Corporation)"
)
@Component
public class UserDtoMapperImpl implements UserDtoMapper {

    @Override
    public UserDto map(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        if ( user.getId() != null ) {
            userDto.setId( user.getId() );
        }
        if ( user.getUsername() != null ) {
            userDto.setUsername( user.getUsername() );
        }
        if ( user.getEmail() != null ) {
            userDto.setEmail( user.getEmail() );
        }
        Set<Role> set = user.getRoles();
        if ( set != null ) {
            userDto.setRoles( new LinkedHashSet<Role>( set ) );
        }

        return userDto;
    }

    @Override
    public User map(UserDto dto, PasswordEncoder encoder) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        if ( dto.getPassword() != null ) {
            user.setPassword( encode( dto.getPassword(), encoder ) );
        }
        if ( dto.getUsername() != null ) {
            user.setUsername( dto.getUsername() );
        }
        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        Set<Role> set = dto.getRoles();
        if ( set != null ) {
            user.setRoles( new LinkedHashSet<Role>( set ) );
        }

        return user;
    }
}
