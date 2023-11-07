package org.launchcode.techjobsauth.models.data;

import jakarta.transaction.Transactional;
import org.launchcode.techjobsauth.models.Job;
import org.launchcode.techjobsauth.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
