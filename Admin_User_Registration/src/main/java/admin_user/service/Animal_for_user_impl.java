package admin_user.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin_user.model.Animal_for_user;
import admin_user.repositories.Animal_for_user_repository;

@Service    //clase que implementa de la interfas Animal_for_user_service y aqui dentro se inyecta el repositorio  Animal_for_user_repository
public class Animal_for_user_impl implements Animal_for_user_service {

      @Autowired
    Animal_for_user_repository animal_for_user_repository;


    //metodo para buscar por id
   /*  @Override
    public Animal_for_user buscarPorId(Long id) {
        return animal_for_user_repository.findById(id).orElse(null);
}
*/

//metodo para buscar todos los animales para mostraslos en la tabla 
@Override
public List<Animal_for_user>getAllAnimalForUser(){
    return animal_for_user_repository.findAll();
}


//metodo para guardar animales
@Override
public void saveAnimal(Animal_for_user animal_for_user){
     animal_for_user_repository.save(animal_for_user);
    
}


@Override
public void deleteAnimalForUser(Long id) {
    animal_for_user_repository.deleteById(id);
}
  


//sirve metodo para buscar por id 
@Override
public Animal_for_user obtenerAnimalPorId(Long id) {
    return animal_for_user_repository.findById(id).orElse(null);
}



//metodo para buscar animal por dni sirve 
@Override
public Animal_for_user obtenerAnimalPorDni(Long dni) {
    return animal_for_user_repository.findByDni(dni);
}


}
