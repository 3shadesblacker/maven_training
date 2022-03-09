package fr.lernejo;

//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;

class SampleTest {

    @Test
    void op() {
        Sample sa = new Sample();
        Assertions.assertThat(sa.op(ADD, 5, 7)).isEqualTo(12);
        Assertions.assertThat(sa.op(MULT, 5, 7)).isEqualTo(35);
    }
    @Test
    void fact() {
        Sample sa = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sa.fact(-1));
        Assertions.assertThat(sa.fact(5)).isEqualTo(120);
    }
}
