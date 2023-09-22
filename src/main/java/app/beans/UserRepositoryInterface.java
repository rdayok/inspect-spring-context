package app.beans;

import org.springframework.stereotype.Repository;

// So using the Bean annotation for interfaces doesn't maes sense, though you would not have a compilation errors
//but interfaces can not be instantiated and hence you won't see this as a Bean in the application context.
@Repository
public interface UserRepositoryInterface {
}
