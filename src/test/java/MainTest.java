import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @DisplayName("메인 테스트")
    @Test
    void main(){
        String[] args = {"3", "1", "2"};

        // When & Then
        Main.main(args);
    }

}