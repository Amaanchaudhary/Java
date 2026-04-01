class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "This", "is", "the", "Best", "Learning"
        };

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
