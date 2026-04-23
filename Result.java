class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "No Division";
    }

    public static void main(String[] args) {
        Result r = new Result();
        double avg = 65.5;

        System.out.println(r.getDivision(avg));
    }
}

interface Classify {
    String getDivision(double average);
}
