package cs499.team8.testcreatorprototype.Service;

import cs499.team8.testcreatorprototype.Entities.User;
import cs499.team8.testcreatorprototype.Repository.UserRepository;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends BaseCrudService<User, JpaRepository<User,Long>> implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super(userRepository);
		
		this.userRepository = userRepository;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public javafx.concurrent.Service<Void> delete(long id, EventHandler<WorkerStateEvent> onSuccess, EventHandler<WorkerStateEvent> beforeStart) throws Exception {
		return null;
	}

	@Override
	public javafx.concurrent.Service<Long> getTotalUsers(EventHandler<WorkerStateEvent> onSucess, EventHandler<WorkerStateEvent> beforeStart) {
		return createService(new Task<Long>() {
			protected Long call() throws Exception {
				return userRepository.getTotalUsers();
			};
		}, onSucess, beforeStart);
	}

	@Override
	public javafx.concurrent.Service<Boolean> existsByUserID(String userid, EventHandler<WorkerStateEvent> onSucess, EventHandler<WorkerStateEvent> beforeStart) {
		return createService(new Task<Boolean>() {
			protected Boolean call() throws Exception {
				return userRepository.existsByUserID(userid);
			};
		}, onSucess, beforeStart);
	}

	@Override
	public javafx.concurrent.Service<User> findUserById(String userId, EventHandler<WorkerStateEvent> onSucess, EventHandler<WorkerStateEvent> beforeStart) {
		return createService(new Task<User>() {
			protected User call() throws Exception {
				return userRepository.findByUserID(userId);
			};
		}, onSucess, beforeStart);	}
}
