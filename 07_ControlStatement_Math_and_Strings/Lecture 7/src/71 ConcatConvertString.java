class ConcatConvertString {
    public static void main(String[] args) {
        String s1 = "Amaan";
        String s2 = "Code";
//        String combine = s1 + " " + s2;
        String combine = s1.concat(" ").concat(s2);

//        System.out.printf("%S", combine);
        System.out.println(combine.toUpperCase());
    }
}
