package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Writing assertions for rectangle")
public class RectangleTest {

    @DisplayName("When lenght is zero")
    @Test
    void shouldReturnAreaWhenLengthIsZero() {
        Rectangle rect = new Rectangle(0, 4);
        int res = rect.area();
        assertThat(res, is(equalTo(0)));
        
    }

    @DisplayName("When breadth is zero")
    @Test
    void shouldReturnAreaWhenBreadthIsZero() {
        Rectangle rect = new Rectangle(5, 0);
        int res = rect.area();
        assertThat(res, is(equalTo(0)));
    }

    @DisplayName("When lenght and breadth is integer")
    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        Rectangle rect = new Rectangle(2, 4);
        int res = rect.area();
        assertThat(res, is(equalTo(8)));
        
    }
}