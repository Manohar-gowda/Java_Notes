class dupli {
    public static void findDupi() {
        String a = "abcd";
        String b = "abcde";

        char ch = 0;
        for(char ele1 : a.toCharArray()) ch ^= ele1;
        for(char ele2 : b.toCharArray()) ch ^= ele2;

        System.out.println(ch);
    }
}