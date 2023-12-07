import Repository.LoginRegisterRepositoryImp;
import Service.LoginRegisterServiceImp;
import View.ViewLoginRegister;


public class App {
    public static void main(String[] args) {
        System.out.println("APPLICATION REGISTER LOGIN");
        ViewLoginRegister viewLoginRegister = new ViewLoginRegister(new LoginRegisterServiceImp(
                new LoginRegisterRepositoryImp()));
        viewLoginRegister.viewLoginRegister();
    }
}