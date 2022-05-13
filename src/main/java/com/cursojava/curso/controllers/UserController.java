package com.cursojava.curso.controllers;

import java.util.ArrayList;
import java.util.List;
// Models
import com.cursojava.curso.models.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @RequestMapping( value = "users/{id}" )
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

  @RequestMapping( value = "users" )
  public List<User> getUsers() {
    List<User> users = new ArrayList<>();
    User user1 = new User();
    // Set Attributes
    user1.setId( 12435L );
    user1.setName( "Camilo" );
    user1.setLastName( "Completo" );
    user1.setEmail( "camilo.completo@italiano.com" );
    user1.setPhone( "+5696655443" );
    user1.setPassword( "123456" );

    User user2 = new User();
    // Set Attributes
    user2.setId( 21345L );
    user2.setName( "Evelyn" );
    user2.setLastName( "Flores" );
    user2.setEmail( "evelyn@test.com" );
    user2.setPhone( "+5696655443" );
    user2.setPassword( "123456" );

    User user3 = new User();
    // Set Attributes
    user3.setId( 12412L );
    user3.setName( "Shakishis" );
    user3.setLastName( "Shikistrukis" );
    user3.setEmail( "shaki@test.com" );
    user3.setPhone( "+5696655443" );
    user3.setPassword( "123456" );

    users.add( user1 );
    users.add( user2 );
    users.add( user3 );

    return users;
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
  public User search() {
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
