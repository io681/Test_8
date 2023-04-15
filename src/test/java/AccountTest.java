import org.example.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private String name;
    private Account account;
//    @Before
//    public void createAccount (){
//        account = new Account(name);
//    }

    @Test
    public void accountNameGreaterThan19ShowsFalseTest(){
        account = new Account("name Name1234567890123");
        boolean result = account.checkNameToEmboss();
        assertEquals("Ошибка сравнения", false, result);
    }
    @Test
    public void accountNameLessThan3ShowsFalseTest(){
        account = new Account("na");
        boolean result = account.checkNameToEmboss();
        assertEquals("Ошибка сравнения", false, result);
    }
}
