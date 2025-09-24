public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your birth year:");

    int birthYear = input.nextInt();

    int currentYear = 2025;

    int age = currentYear - birthYear;

    System.out.println("You are approximately " + age + " years old.");

    input.close();
}