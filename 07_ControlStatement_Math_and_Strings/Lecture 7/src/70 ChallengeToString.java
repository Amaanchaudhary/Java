class ChallengeToString {
    String name = "Rohan";
    int age = 39;

    public static void main(String[] args) {
        ChallengeToString obj = new ChallengeToString();
        System.out.println(obj);
    }

    @Override
    public String toString() {
        return "ChallengeToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
