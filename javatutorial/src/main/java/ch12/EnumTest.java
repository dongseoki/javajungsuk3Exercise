package ch12;

enum Weather{
    SUN(1, "sunny"),
    RAIN(2, "rainny"),
    SNOW(3, "It's snowing");


    private final int value;
    private final String comment;
    Weather(int value, String comment) {
        this.value = value;
        this.comment = comment;
    }
    public int getValue()      { return value;  }
    public String getComment()  { return comment; }
}

public class EnumTest {
    public static void main(String[] args) {
        for(Weather w : Weather.values()){
            System.out.println(String.format("%d, %s, %d",w.getValue(), w.getComment(), w.ordinal()));
        }
        
        Weather w1 = Weather.SUN;
        Weather w2 = Weather.RAIN;
        System.out.println("String.valueOf(w1==w2) = " + String.valueOf(w1==w2));
    }
}
