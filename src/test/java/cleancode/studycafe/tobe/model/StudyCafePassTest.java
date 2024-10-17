package cleancode.studycafe.tobe.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassTest {


    @DisplayName("Hourly 타입의 StudyCafePass가 올바른 문자열을 반환해야 한다")
    @Test
    void display() {
        // Given: HOURLY 타입의 StudyCafePass 생성
        StudyCafePass pass = StudyCafePass.of(StudyCafePassType.HOURLY, 3, 10000, 0.0);

        // When: display 메서드를 호출할 때
        String result = pass.display();

        // Then: "3시간권 - 10000원"이라는 문자열을 반환해야 한다
        assertThat(result).isEqualTo("3시간권 - 10000원");
    }

}