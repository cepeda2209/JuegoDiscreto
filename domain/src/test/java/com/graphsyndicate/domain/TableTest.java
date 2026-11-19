package com.graphsyndicate.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TableTest {

    @Test
    void casinoHasSevenTables() {
        assertEquals(7, Table.values().length);
    }
}
