package com.cursojava.curso.controllers;

import java.util.List;
// Models
import com.cursojava.curso.models.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @RequestMapping( value = "user/{id}" )
  public User getUser( @PathVariable Long id ) {
    User user = new User();
    // Set Attributes
    user.setId( id );
    user.setName( "Camilo" );
    user.setLastName( "Completo" );
    user.setEmail( "camilo.completo@italiano.com" );
    user.setPhone( "+5696655443" );
    user.setPassword( "123456" );

    return user;
  }

  @RequestMapping( value = "user22" )
  public User updateUser() {
    User user = new User();
    // Set Attributes
    user.setName( "Camilo" );
    user.setLastName( "Completo" );
    user.setEmail( "camilo.completo@italiano.com" );
    user.setPhone( "+5696655443" );
    user.setPassword( "123456" );

    return user;
  }

  @RequestMapping( value = "user33" )
  public User deleteUser() {
    User user = new User();
    // Set Attributes
    user.setName( "Camilo" );
    user.setLastName( "Completo" );
    user.setEmail( "camilo.completo@italiano.com" );
    user.setPhone( "+5696655443" );
    user.setPassword( "123456" );

    return user;
  }

  @RequestMapping( value = "user44" )
  public User getUsers() {
    User user = new User();
    // Set Attributes
    user.setName( "Camilo" );
    user.setLastName( "Completo" );
    user.setEmail( "camilo.completo@italiano.com" );
    user.setPhone( "+5696655443" );
    user.setPassword( "123456" );

    return user;
  }
}
