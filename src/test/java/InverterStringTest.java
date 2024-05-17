import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InverterStringTest {

    @Test
    void embaralhar() {
        InverterString inverterString = new InverterString();
        String palavra = "cachorro";

        Assertions.assertEquals("orrohcac", inverterString.embaralhar(palavra) );
    }
}