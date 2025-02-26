// Interface defining data access operations
public interface UserRepository {
    User findById(long id);
    List<User> findAll();
    User save(User user);
    void delete(User user);
}
