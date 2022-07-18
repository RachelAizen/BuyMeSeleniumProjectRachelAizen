import org.testng.annotations.BeforeClass;

public class IntroAndRegistrationPage extends Tests{

    @BeforeClass
    @Override
    public void enterWebsite() throws Exception {super.enterWebsite();}

    @Override
    public void pressSignUpAndEnter() throws Exception {super.pressSignUpAndEnter();}

    @Override
    public void pressSignUp() throws Exception {super.pressSignUp();}

    @Override
    public void enterCredentials() throws Exception {super.enterCredentials();}

    @Override
    public void pressSigningUp() throws Exception {super.pressSigningUp();}
}
