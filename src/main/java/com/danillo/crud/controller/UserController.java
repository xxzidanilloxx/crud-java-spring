package com.danillo.crud.controller;

import com.danillo.crud.dto.UserDTO;
import com.danillo.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<UserDTO> result = service.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id){
        UserDTO result = service.findById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<UserDTO> insert(@RequestBody UserDTO data){
        UserDTO result = service.insert(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody UserDTO data){
        UserDTO result = service.update(id, data);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
