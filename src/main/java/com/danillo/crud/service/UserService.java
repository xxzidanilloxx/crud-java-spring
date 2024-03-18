package com.danillo.crud.service;

import com.danillo.crud.dto.UserDTO;
import com.danillo.crud.entity.Address;
import com.danillo.crud.exception.CpfDuplicateException;
import com.danillo.crud.exception.EmailDuplicateException;
import com.danillo.crud.exception.RecordNotFoundException;
import com.danillo.crud.entity.User;
import com.danillo.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Transactional
    public List<UserDTO> findAll(){
        List<User> result = repository.findAll();
        return result.stream().map(UserDTO::new).toList();
    }

    @Transactional
    public UserDTO findById(Long id){
        User result = repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
        return new UserDTO(result);
    }

    @Transactional
    public UserDTO insert(UserDTO data){
        if (repository.existsByCpf(data.getCpf())) {
            throw new CpfDuplicateException();
        }

        if (repository.existsByEmail(data.getEmail())) {
            throw new EmailDuplicateException();
        }

        User user = new User();

        user.setId(data.getId());
        user.setFirstName(data.getFirstName());
        user.setLastName(data.getLastName());
        user.setCpf(data.getCpf());
        user.setBirthDate(data.getBirthDate());
        user.setEmail(data.getEmail());
        user.setAddressList(Address.toEntity(data.getAddressList()));

        User result = repository.save(user);
        return new UserDTO(result);
    }

    @Transactional
    public UserDTO update(Long id, UserDTO data){
        User user = repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));

        if(user != null){
            if (repository.existsByCpfAndIdNot(data.getCpf(), id)) {
                throw new CpfDuplicateException();
            }

            if (repository.existsByEmailAndIdNot(data.getEmail(), id)) {
                throw new EmailDuplicateException();
            }

            user.setFirstName(data.getFirstName());
            user.setLastName(data.getLastName());
            user.setCpf(data.getCpf());
            user.setBirthDate(data.getBirthDate());
            user.setEmail(data.getEmail());
            List<Address> addressList = Address.toEntity(data.getAddressList());
            user.setAddressList(addressList);

            User result = repository.save(user);
            return new UserDTO(result);
        }
        return null;
    }

    @Transactional
    public void delete(Long id){
        repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
        repository.deleteById(id);
    }
}
