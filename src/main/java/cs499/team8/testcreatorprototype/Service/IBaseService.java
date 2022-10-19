package cs499.team8.testcreatorprototype.Service;

import javafx.concurrent.Service;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;

import java.util.List;

public interface IBaseService<T> {
	public Service<T> save(T obj, EventHandler<WorkerStateEvent> onSuccess, EventHandler<WorkerStateEvent> beforeStart) throws Exception;
	public Service<List<T>> findAll(EventHandler<WorkerStateEvent> onSuccess, EventHandler<WorkerStateEvent> beforeStart);
	public Service<Void> delete(long id, EventHandler<WorkerStateEvent> onSuccess, EventHandler<WorkerStateEvent> beforeStart) throws Exception;
	public Service<T> find(long id, EventHandler<WorkerStateEvent> onSuccess, EventHandler<WorkerStateEvent> beforeStart) throws Exception;
	
	public void onClose();
}
