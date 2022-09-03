package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Writing assertions for calculating area and perimeter of rectangle")
public class RectangleTest {

    @DisplayName("Area when length is zero")
    @Test
    void shouldReturnAreaWhenLengthIsZero() {
        Rectangle rect = new Rectangle(0.0, 4.0);
        double res = rect.area();
        assertThat(res, is(closeTo(0.0, 0.001)));
        
    }

    @DisplayName("Area when breadth is zero")
    @Test
    void shouldReturnAreaWhenBreadthIsZero() {
        Rectangle rect = new Rectangle(5.0, 0.0);
        double res = rect.area();
        assertThat(res, is(closeTo(0.0, 0.001)));
    }

    @DisplayName("Area when length and breadth are integer")
    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        Rectangle rect = new Rectangle(36.34, 21.35);
        double res = rect.area();
        assertThat(res, is(closeTo(775.859, 0.001)));
        
    }


    @DisplayName("Perimeter when length is zero")
    @Test
    void shouldReturnPerimeterWhenLengthIsZero(){
        Rectangle rect = new Rectangle(0.0, 20.0);
        double res = rect.perimeter();
        assertThat(res, is(closeTo(40.0, 0.001)));

    }

    @DisplayName("Perimeter when breadth is zero")
    @Test
    void shouldReturnPerimeterWhenBreadthIsZero(){
        Rectangle rect = new Rectangle(20.0, 0.0);
        double res = rect.perimeter();
        assertThat(res, is(closeTo(40.0, 0.001)));
    }

    @DisplayName("Perimeter when length and breath are given")
    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthAreGiven(){
        Rectangle rect = new Rectangle(20.0, 20.0);
        double res = rect.perimeter();
        assertThat(res, is(closeTo(80.0, 0.001)));
    }



}