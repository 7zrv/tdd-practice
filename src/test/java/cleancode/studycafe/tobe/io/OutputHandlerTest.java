package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.model.StudyCafeLockerPass;
import cleancode.studycafe.tobe.model.StudyCafePass;
import cleancode.studycafe.tobe.model.StudyCafePassType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OutputHandlerTest {

    private OutputHandler outputHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        outputHandler = new OutputHandler();
        System.setOut(new PrintStream(outContent));
    }


    @Test
    void showWelcomeMessage() {
    }

    @Test
    void showAnnouncement() {
    }

    @Test
    void askPassTypeSelection() {
    }

    @DisplayName("선택한 입장권들을 보여줘야한다.")
    @Test
    void displayPassListCorrectly() {
        // Given
        List<StudyCafePass> passes = Arrays.asList(
                StudyCafePass.of(StudyCafePassType.HOURLY, 1, 1000, 0),
                StudyCafePass.of(StudyCafePassType.WEEKLY, 1, 7000, 0)
        );

        // When
        outputHandler.showPassListForSelection(passes);

        // Then
        String expectedOutput = "\n이용권 목록\n1. 1시간권 - 1000원\n2. 1주권 - 7000원\n";
        then(outContent.toString()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("사물함 이용 여부 메시지가 올바르게 출력되어야 한다")
    void askLockerPassCorrectly() {
        // Given
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(StudyCafePassType.HOURLY, 3, 500);

        // When
        outputHandler.askLockerPass(lockerPass);

        // Then
        String expectedOutput = "\n사물함을 이용하시겠습니까? (3시간권 - 500원)\n1. 예 | 2. 아니오\n";
        then(outContent.toString()).isEqualTo(expectedOutput);
    }

    @Test
    void askLockerPass() {
    }

    @Test
    void showPassOrderSummary() {
    }

    @Test
    void showSimpleMessage() {
    }
}