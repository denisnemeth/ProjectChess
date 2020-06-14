package sk.itsovy.nemethd;

public class Main {

    public static void main(String[] args) {

        Chess chess = new Chess();

        System.out.println(chess.normalize("8h"));
        System.out.println(chess.checkBishop("a1", "h8"));
        System.out.println(chess.checkBishop("a1", "h7"));
        System.out.println(chess.checkKing("b2","b3"));
        System.out.println(chess.checkKing("b2","b4"));
        System.out.println(chess.checkQueen("c3","c8"));
        System.out.println(chess.checkQueen("c3","d8"));
        System.out.println(chess.checkRook("d4","d1"));
        System.out.println(chess.checkRook("d4","e3"));
        System.out.println(chess.checkKnight("e5", "f3"));
        System.out.println(chess.checkKnight("e5", "f4"));
    }
}
