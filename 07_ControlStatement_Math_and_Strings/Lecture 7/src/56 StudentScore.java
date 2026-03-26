class StudentScore {
    public static void main(String[] args) {
        System.out.println(checkScore(40));
    }

    public static String checkScore(int score){
        return score < 50 ? "LOW" :
                score > 80 ? "HIGH" : "MODERATE";
    }
}
