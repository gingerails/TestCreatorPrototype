package cs499.team8.testcreatorprototype.Service;

import cs499.team8.testcreatorprototype.Entities.User;
import javafx.concurrent.Service;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;

public interface UserService extends IBaseService<User> {
	
	Service<Long> getTotalUsers(EventHandler<WorkerStateEvent> onSucess, EventHandler<WorkerStateEvent> beforeStart);
	
	Service<Boolean> existsByUserID(String userID, EventHandler<WorkerStateEvent> onSucess, EventHandler<WorkerStateEvent> beforeStart);

	Service<User> findUserById(String userId, EventHandler<WorkerStateEvent> onSucess, EventHandler<WorkerStateEvent> beforeStart);
}
