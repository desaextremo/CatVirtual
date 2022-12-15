package com.unab.catvirtual.catvirtualg31.service;

import com.unab.catvirtual.catvirtualg31.entity.User;
import com.unab.catvirtual.catvirtualg31.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listusers(){
        return userRepository.findAll();
    }

    public User findById(String id){
        User user;
        Optional<User> optional = userRepository.findById(id);

        if (!optional.isEmpty())
            user = optional.get();
        else user=null;

        return user;
    }

    public User addUser(User user){
        Optional<User> optional = userRepository.findById(user.getIdentification());

        if (!optional.isEmpty()) return null;
        else {
            try {
                return userRepository.insert(user);
            }catch (Exception e){
                return null;
            }
        }
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    public User saveUser(User user){

        //1 Buscar el user en base de datos cuyo id corresponde con el id del Usuario recibido como parametro
        Optional<User> optional = userRepository.findById(user.getIdentification());

        //existe
        if (!optional.isEmpty()){
            //obtener el user de la db
            User userDb = optional.get();

            //pregunto si en el User recibido como parametro viene información para cada atributo
            //de ser asi, actualizo el objeto actual con esa información
            if (user.getFisrtName()!=null) userDb.setFisrtName(user.getFisrtName());
            if(user.getLastName()!=null) userDb.setLastName(user.getLastName());
            if(user.getAddress()!=null) userDb.setAddress(user.getAddress());
            if(user.getBirthDay()!=null) userDb.setBirthDay(user.getBirthDay());
            if(user.getGender()!=null) userDb.setGender(user.getGender());
            if(user.getRole()!=null) userDb.setRole(user.getRole());
            if(user.getEmail()!=null) userDb.setEmail(user.getEmail());
            if(user.getCellPhone()!=null) userDb.setCellPhone(user.getCellPhone());
            if(user.getPassword()!=null) userDb.setPassword(user.getPassword());
            return userRepository.save(userDb);
        }
        //no existe
        else return null;

    }
}
