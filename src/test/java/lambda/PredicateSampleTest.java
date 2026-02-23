package lambda;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PredicateSampleTest {
    @Test
    @DisplayName("ユーザーが成人かどうかを確認する")
    void isCheckAdult_shouldReturnTrue_whenUserIsAdult() {
        User adultuser = new User(1, 54);
        PredicateSample predicateSample = new PredicateSample();

        boolean result = predicateSample.isCheckAdult(adultuser, user -> user.isAdult());
        
        assertTrue(result);
        System.out.println("PredicateSampleTest 大人版 成功！");
    }
    
    @Test
    @DisplayName("ユーザーが未成人かどうかを確認する")
    void isCheckAdult_shouldReturnFalse_whenUserIsNotAdult() {
        User notAdultuser = new User(1, 10);
        PredicateSample predicateSample = new PredicateSample();

        boolean result = predicateSample.isCheckAdult(notAdultuser, user -> user.isAdult());

        assertFalse(result);
        System.out.println("PredicateSampleTest 未成人版 成功！");
    }
}
