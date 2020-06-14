package sk.itsovy.nemethd;

import static org.junit.jupiter.api.Assertions.*;

class ChessTest {
    Chess chess = new Chess();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {}

    @org.junit.jupiter.api.AfterEach
    void tearDown() {}

    @org.junit.jupiter.api.Test
    void checkBishop() {
        assertTrue(chess.checkBishop("a1","c3"));
        assertTrue(chess.checkBishop("g1","e3"));
        assertTrue(chess.checkBishop("g7","e5"));
        assertTrue(chess.checkBishop("a7","c5"));
        assertTrue(chess.checkBishop("d4","h8"));

        assertFalse(chess.checkBishop("a1","h1"));
        assertFalse(chess.checkBishop("a1","a8"));
        assertFalse(chess.checkBishop("a1","i9"));
        assertFalse(chess.checkBishop("a1",""));
        assertFalse(chess.checkBishop("a1",null));
    }

    @org.junit.jupiter.api.Test
    void checkKing() {
        assertTrue(chess.checkKing("a1","a2"));
        assertTrue(chess.checkKing("b2","c3"));
        assertTrue(chess.checkKing("c3","d3"));
        assertTrue(chess.checkKing("d4","e3"));
        assertTrue(chess.checkKing("e5","e4"));

        assertFalse(chess.checkKing("b2","b4"));
        assertFalse(chess.checkKing("b2","b9"));
        assertFalse(chess.checkKing("b2","i2"));
        assertFalse(chess.checkKing("b2",""));
        assertFalse(chess.checkKing("b2",null));
    }

    @org.junit.jupiter.api.Test
    void checkQueen() {
        assertTrue(chess.checkQueen("a1","a8"));
        assertTrue(chess.checkQueen("b2","h8"));
        assertTrue(chess.checkQueen("c3","h3"));
        assertTrue(chess.checkQueen("d4","g1"));
        assertTrue(chess.checkQueen("e5","e1"));

        assertFalse(chess.checkQueen("c3","c9"));
        assertFalse(chess.checkQueen("c3","i3"));
        assertFalse(chess.checkQueen("c3","d5"));
        assertFalse(chess.checkQueen("c3",""));
        assertFalse(chess.checkQueen("c3",null));
    }

    @org.junit.jupiter.api.Test
    void checkRook() {
        assertTrue(chess.checkRook("a1","a8"));
        assertTrue(chess.checkRook("b2","h2"));
        assertTrue(chess.checkRook("c3","c1"));
        assertTrue(chess.checkRook("d4","a4"));
        assertTrue(chess.checkRook("e5","e8"));

        assertFalse(chess.checkRook("d4","d9"));
        assertFalse(chess.checkRook("d4","i4"));
        assertFalse(chess.checkRook("d4","f6"));
        assertFalse(chess.checkRook("d4",""));
        assertFalse(chess.checkRook("d4",null));

    }

    @org.junit.jupiter.api.Test
    void checkKnight() {
        assertTrue(chess.checkKnight("a1","b3"));
        assertTrue(chess.checkKnight("b2","d3"));
        assertTrue(chess.checkKnight("c3","d1"));
        assertTrue(chess.checkKnight("d4","f3"));
        assertTrue(chess.checkKnight("e5","c4"));

        assertFalse(chess.checkKnight("e5","g3"));
        assertFalse(chess.checkKnight("g7","i8"));
        assertFalse(chess.checkKnight("g7","h9"));
        assertFalse(chess.checkKnight("e5",""));
        assertFalse(chess.checkKnight("e5",null));
    }
}
