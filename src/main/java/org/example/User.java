package org.example;

public class User {import java.util.ArrayList;
import java.util.List;

    class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // геттеры и сеттеры

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    class UserRepository {
        private List<User> users;

        public UserRepository() {
            this.users = new ArrayList<>();
        }

        public void createUser(String username, String password) {
            User newUser = new User(username, password);
            users.add(newUser);
        }

        public void deleteUser(String username) {
            users.removeIf(user -> user.getUsername().equals(username));
        }

        public List<User> getUsers() {
            return new ArrayList<>(users);
        }

        public void saveUsersToFile() {
            // логика сохранения списка пользователей в файл
            // можно использовать сериализацию, JSON, XML и т.д.
        }
    }

    class UserView {
        private UserRepository userRepository;

        public UserView(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public void createUser(String username, String password) {
            userRepository.createUser(username, password);
        }

        public void deleteUser(String username) {
            userRepository.deleteUser(username);
        }

        public void displayUsers() {
            List<User> users = userRepository.getUsers();
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    class Commands {
        public static void main(String[] args) {
            UserRepository userRepository = new UserRepository();
            UserView userView = new UserView(userRepository);

            userView.createUser("user1", "password1");
            userView.createUser("user2", "password2");

            userView.displayUsers();

            // Удаление пользователя
            userView.deleteUser("user1");

            // Сохранение списка пользователей в файл (при выходе из приложения, например)
            userRepository.saveUsersToFile();

            userView.displayUsers();
        }
    }
}
