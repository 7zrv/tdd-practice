package cleancode.studycafe.tobe.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafeLockerPassTest {

    @DisplayName("사물함의 이용권 타입을 출력한다.")
    @Test
    void getPassType() {
        // Given: HOURLY 타입의 StudyCafeLockerPass 생성
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.HOURLY, 3, 10000);

        // When: getPassType을 호출할 때
        String result = lockerPass.getPassType().toString();

        // Then: StudyCafePassType.HOURLY와 같은 문자를 가져야한다
        assertThat(result).isEqualTo(StudyCafePassType.HOURLY.name());

    }

    @DisplayName("이용 가능 기간을 출력해준다.")
    @Test
    void getDuration() {

        // Given: HOURLY 타입의 StudyCafeLockerPass 생성
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.HOURLY, 3, 10000);

        // When: getDuration을 호출할 때
        int result = lockerPass.getDuration();

        // Then: 입력값과 같은 결과가 나와야한다.
        assertThat(result).isEqualTo(3);
    }

    @DisplayName("사물함의 이용권의 가격을 출력한다.")
    @Test
    void getPrice() {
        // Given: HOURLY 타입의 StudyCafeLockerPass 생성
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.HOURLY, 3, 10000);

        // When: getPassType을 호출할 때
        int result = lockerPass.getPrice();

        // Then: StudyCafePassType.HOURLY와 같은 문자를 가져야한다
        assertThat(result).isEqualTo(10000);
    }

    @DisplayName("이용권 타입과 가격을 입력받아 사물함의 타입과 가격을 출력한다.")
    @Test
    void display() {
        // Given: HOURLY 타입의 StudyCafeLockerPass 생성
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.HOURLY, 3, 10000);

        // When: display 메서드를 호출할 때
        String result = lockerPass.display();

        // Then: "3시간권 - 10000원"이라는 문자열을 반환해야 한다
        assertThat(result).isEqualTo("3시간권 - 10000원");
    }


}