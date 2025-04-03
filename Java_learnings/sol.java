class sol {
    public static void main(String[] args) {
        int num = 20;
        String res = toWord(num);
        System.out.println(res);
    }

    public static String toWord(int num) {

        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", 
        "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
        "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if(num <= 19) {
            return units[num];
        }

        int unit = num % 10;
        int ten = num / 10;

        String word = tens[ten];
        if(unit > 0) {
            word +=  "-" + units[unit];
        }

        return word;
    }
}