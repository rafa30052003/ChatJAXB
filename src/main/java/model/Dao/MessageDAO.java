import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.EntityTransaction;
import java.util.List;

public class MessageDAO {
    private EntityManager entityManager;

    public MessageDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Método para agregar un nuevo mensaje a la base de datos
    public void addMessage(Message message) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(message);
        transaction.commit();
    }

    // Método para obtener todos los mensajes entre dos usuarios
    public List<Message> getMessagesBetweenUsers(User user1, User user2) {
        TypedQuery<Message> query = entityManager.createQuery(
                "SELECT m FROM Message m WHERE (m.user = :user1 AND m.sender = :user2) OR (m.user = :user2 AND m.sender = :user1) ORDER BY m.timestamp ASC",
                Message.class
        );
        query.setParameter("user1", user1);
        query.setParameter("user2", user2);
        return query.getResultList();
    }

    // Método para actualizar un mensaje
    public void updateMessage(Message message) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(message);
        transaction.commit();
    }

    // Método para eliminar un mensaje
    public void deleteMessage(Message message) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(entityManager.contains(message) ? message : entityManager.merge(message));
        transaction.commit();
    }
}