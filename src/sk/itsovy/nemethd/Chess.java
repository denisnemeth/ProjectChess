package sk.itsovy.nemethd;

public class Chess {

    public String normalize(String item) {
        if (item == null || item.length() != 2) { return null; }
        item = item.toUpperCase();
        if (Character.isDigit(item.charAt(0)) && Character.isLetter(item.charAt(1))) { item = item.charAt(1) + String.valueOf(item.charAt(0)); }
        if (item.charAt(0) < 65 || item.charAt(0) > 72) { return null; }
        if (item.charAt(1) < 49 || item.charAt(1) > 56) { return null; }
        return item;
    }

    public boolean checkBishop(String position, String destination) {
        position = normalize(position);
        destination = normalize(destination);
        if (position == null || destination == null) { return false; }
        if (position.equals(destination)) { return false; }
        if (Math.abs(position.charAt(0) - destination.charAt(0)) == Math.abs(position.charAt(1) - destination.charAt(1))) { return true; }
        else { return false; }
    }

    public boolean checkKing(String position, String destination) {
        position = normalize(position);
        destination = normalize(destination);
        if (position == null || destination == null) { return false; }
        if (position.equals(destination)) { return false; }
        if (Math.abs(position.charAt(0) - destination.charAt(0)) <= Math.abs(1) && Math.abs(position.charAt(1) - destination.charAt(1)) <= Math.abs(1)) { return true; }
        else { return false; }
    }

    public boolean checkQueen(String position, String destination) {
        position = normalize(position);
        destination = normalize(destination);
        if (position == null || destination == null) { return false; }
        if (position.equals(destination)) { return false; }
        if ((Math.abs(position.charAt(0) - destination.charAt(0)) == Math.abs(position.charAt(1) - destination.charAt(1)) || (position.charAt(0) == destination.charAt(0)
                || position.charAt(1) == destination.charAt(1)))) { return true; }
        else { return false; }
    }

    public boolean checkRook(String position, String destination) {
        position = normalize(position);
        destination = normalize(destination);
        if (position == null || destination == null) { return false; }
        if (position.equals(destination)) { return false; }
        if (position.charAt(0) == destination.charAt(0) || position.charAt(1) == destination.charAt(1)) { return true; }
        else { return false; }
    }

    public boolean checkKnight(String position, String destination) {
        position = normalize(position);
        destination = normalize(destination);
        if (position == null || destination == null) { return false; }
        if (position.equals(destination)) { return false; }
        int i = Math.abs(position.charAt(0) - destination.charAt(0));
        int j = Math.abs(position.charAt(1) - destination.charAt(1));
        if ((i == 1 && j == 2) || (i == 2 && j == 1)) { return true; }
        else { return false; }
    }
}
