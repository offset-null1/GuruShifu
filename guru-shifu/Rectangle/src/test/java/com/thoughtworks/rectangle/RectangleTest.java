package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Writing assertions for rectangle")
public class RectangleTest {

    @DisplayName("When length is zero")
    @Test
    void shouldReturnAreaWhenLengthIsZero() {
        Rectangle rect = new Rectangle(0.0, 4.0);
        double res = rect.area();
        assertThat(res, is(closeTo(0.0, 0.001)));
        
    }

    @DisplayName("When breadth is zero")
    @Test
    void shouldReturnAreaWhenBreadthIsZero() {
        Rectangle rect = new Rectangle(5.0, 0.0);
        double res = rect.area();
        assertThat(res, is(closeTo(0.0, 0.001)));
    }

    @DisplayName("When length and breadth is integer")
    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        Rectangle rect = new Rectangle(36.34, 21.35);
        double res = rect.area();
        assertThat(res, is(closeTo(775.859, 0.001)));
        
    }
}