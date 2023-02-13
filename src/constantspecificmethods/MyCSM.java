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

    public static void main(String[] args) {
        for(MyCSM val : values()){
            System.out.println(val.getInfo());
        }
    }
}
