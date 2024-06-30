package app.vignesh;

public class StringDatatype {
    public static void main(String[] args) {
        // String
        String brand = "Java";
        System.out.println(brand);

        String firstName = "Vignesh";
        String lastName = "Vijayakumar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Methods
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.substring(8)); // Result is Vijayakumar
        System.out.println(fullName.substring(8, 13));
        System.out.println(fullName.subSequence(8, 13));
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("   Spaces a lot   ".trim());


    }
}
