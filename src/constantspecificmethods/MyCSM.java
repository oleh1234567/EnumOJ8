package constantspecificmethods;

public enum MyCSM {
    WORD{
        @Override
        String getInfo() {
            return WORD.name().length() + "";
        }
    },

    SENTENCE{
        @Override
        String getInfo() {
            return SENTENCE.name().length() + "";
        }
    };
    abstract String getInfo();


}

class Testiuk{
    public static void main(String[] args) {
       MyCSM m = MyCSM.SENTENCE;
        System.out.println(m.getInfo());
    }
}
