package kyu6.without_test;

public class FireFury {
    public static void main(String[] args) {

    }
}





 class Dinglemouse {

    public static String fireAndFury(final String tweet){
        String str = tweet.replaceAll("FURY", "a").replaceAll("FIRE", "b").replaceAll("E", "").replaceAll("I", "").replaceAll("F", "").replaceAll("R", "").replaceAll("U", "").replaceAll("Y", "");
        String data = "";

        boolean isFury = false;
        int furyInRow = 0;

        boolean isFire = false;
        int fireInRow = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.toCharArray()[i] == 'a'){
                if (isFury || furyInRow == 0) {
                    furyInRow++;
                }
                isFury = true;
                if (isFire){
                    data += fire(fireInRow) + " ";
                    fireInRow = 0;
                    isFire = false;
                }

            }
            else if (str.toCharArray()[i] == 'b'){
                if (isFire || fireInRow == 0) {
                    fireInRow++;
                }
                isFire = true;
                if (isFury){
                    data += fury(furyInRow) + " ";
                    furyInRow = 0;
                    isFury = false;
                }
            }
            else return "Fake tweet.";


        }
        if (isFire){
            data += fire(fireInRow);
        }
        else if (isFury){
            data += fury(furyInRow);
        }
        return data.isEmpty() ? "Fake tweet.": data;
    }

    private static String fury(int furyCount){
        return "I am " + "really ".repeat(furyCount-1) + "furious.";
    }

    private static String fire(int fireCount){
        return "You " + "and you ".repeat(fireCount-1) + "are fired!";
    }
}
