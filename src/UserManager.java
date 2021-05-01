public class UserManager {
    public void add(User user){
        System.out.println( user.getName() + " Kullanıcı Eklendi");
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }

    public void login(String mail, String password){
        System.out.println("Sisteme giriş yapıldı");
    }
}
