package br.com.schiavon.controlefinanceiro.controllers;

import br.com.schiavon.controlefinanceiro.dtos.UsersDto;
import br.com.schiavon.controlefinanceiro.models.UsersModel;
import br.com.schiavon.controlefinanceiro.services.UsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UsersController {
        private final UsersService usersService;
        public UsersController(UsersService usersService){
                this.usersService = usersService;
        }
        @PostMapping
        public ResponseEntity<Object> createUser(@RequestBody @Valid UsersDto usersDto){
                UsersModel usersModel = new UsersModel();
                BeanUtils.copyProperties(usersDto, usersModel);
                return ResponseEntity.status(HttpStatus.CREATED).body(usersService.save(usersModel));
        }
}
