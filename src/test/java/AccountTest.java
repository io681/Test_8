import io.qameta.allure.junit4.DisplayName;
import org.example.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Тесты валидации аккаунта")
public class AccountTest {
    private String name;
    private Account account;

    @Test
    @DisplayName("Позитивный тест")
    public void accountSuccessTrueTest(){
        account = new Account("nas Tya");
        boolean result = account.checkNameToEmboss();
        assertEquals("Ошибка сравнения", true, result);
    }
    @Test
    @DisplayName("Проверка максимального значения символов")
    public void accountNameGreaterThan19ShowsFalseTest(){
        account = new Account("name Name1234567890123");
        boolean result = account.checkNameToEmboss();
        assertEquals("Ошибка сравнения", false, result);
    }
    @Test
    @DisplayName("Проверка минимального значения символов")
    public void accountNameLessThan3ShowsFalseTest(){
        account = new Account("na");
        boolean result = account.checkNameToEmboss();
        assertEquals("Ошибка сравнения", false, result);
    }
}
