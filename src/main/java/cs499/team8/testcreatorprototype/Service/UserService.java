package cs499.team8.testcreatorprototype.Service;

import cs499.team8.testcreatorprototype.Entities.User;
import cs499.team8.testcreatorprototype.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public String createUser(User user){
        try {
            if (!userRepository.existsByUserID(user.getUserID())){
                user.setUserID(user.getUserID());
                user.setUsername(user.getUsername());
                user.setPassword(user.getPassword());
                userRepository.save(user);
                return "User record created successfully.";
            }else {
                return "User ID taken";
            }
        }catch (Exception e){
            throw e;
        }
    }

    public List<User> readUsers(){
        return userRepository.findAll();
    }

    @Transactional
    public String deleteUser(User user){
        if (userRepository.existsByUserID(user.getUserID())){
            try {
               User userDelete = userRepository.findByUserID(user.getUserID());
               userRepository.delete(userDelete);
                return "Student record deleted successfully.";
            }catch (Exception e){
                throw e;
            }

        }else {
            return "Student does not exist";
        }
    }

}
